/*
Nome:Lorenzo Coriani
Classe:4^f
*/
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>

#define NUM_VARCHI 5 // Numero dei varchi
#define TEMPO_SERVIZIO 30 // Tempo di attesa per servire un'auto
#define ARRIVO_AUTO 60 // Tempo di arrivo di una nuova auto
#define INTERVALLO_STAMPA 1 // Tempo di arrivo di una nuova auto

pthread_mutex_t mutex[NUM_VARCHI] = {PTHREAD_MUTEX_INITIALIZER};
pthread_cond_t cond[NUM_VARCHI] = {PTHREAD_COND_INITIALIZER};

int lunghezza_coda[NUM_VARCHI] = {0};
int incasso_varco[NUM_VARCHI] = {0};

void* gestione_varco(void* arg) {
	// numero del varco
    int varco = (int)arg;

    while(1) {
        pthread_mutex_lock(&mutex[varco]);
		// se non ci sono auto in fila al varco, aspetto
        while(lunghezza_coda[varco] == 0) {
            pthread_cond_wait(&cond[varco], &mutex[varco]);
        }
        // tolgo una auto dalla coda
        lunghezza_coda[varco]--;
        pthread_mutex_unlock(&mutex[varco]);

		// tempo di attesa per servire l'auto
        sleep(TEMPO_SERVIZIO);

        pthread_mutex_lock(&mutex[varco]);
		// incremento l'incasso del varco
        incasso_varco[varco]++;
        pthread_mutex_unlock(&mutex[varco]);
    }
    return NULL;
}

void* generatore_auto(void* arg) {
    while(1) {
		// tempo di attesa casuale prima di generare un'auto
        sleep(rand() % ARRIVO_AUTO + 1);

		// genero un numero del varco a caso
        int varco = rand() % NUM_VARCHI;
		// blocco il mutex releativo al varco id
        pthread_mutex_lock(&mutex[varco]);
        lunghezza_coda[varco]++;
		// segnalo la presenza di una auto in fila al varco id
        pthread_cond_signal(&cond[varco]);
		// sblocco il mutex relativo al varco id
        pthread_mutex_unlock(&mutex[varco]);
    }
    return NULL;
}

void* stampa_stato(void* arg) {
    while(1) {
        sleep(INTERVALLO_STAMPA);

		float varchi_occupati = 0.0;

		// calcolo il livello di saturazione della barriera
        for(int i = 0; i < NUM_VARCHI; i++) {
			// blocco il mutex relativo al varco attuale prima di stampare
            pthread_mutex_lock(&mutex[i]);
			if(lunghezza_coda[i] > 0)
				varchi_occupati++;
			// sblocco il mutex relativo al varco attuale
            pthread_mutex_unlock(&mutex[i]);
        }

		// stampo il livello di saturazione della barriera
		printf("Livello di saturazione della barriera: %.1f\n\n", (varchi_occupati/NUM_VARCHI*100.0));

		// stampo lo stato della coda ai varchi
        for(int i = 0; i < NUM_VARCHI; i++) {
			// blocco il mutex relativo al varco attuale prima di stampare
            pthread_mutex_lock(&mutex[i]);
            printf("Auto in coda al varco %d: %d\n", i, lunghezza_coda[i]);
			// sblocco il mutex relativo al varco attuale
            pthread_mutex_unlock(&mutex[i]);
        }

		printf("\n");

		int totale_incasso = 0;

		// stampo l'incasso delle auto transitate dai varchi
        for(int i = 0; i < NUM_VARCHI; i++) {
			// blocco il mutex relativo al varco attuale prima di stampare
            pthread_mutex_lock(&mutex[i]);
            printf("Incasso dal varco %d: %d\n", i, incasso_varco[i]);
			totale_incasso += incasso_varco[i];
			// sblocco il mutex relativo al varco attuale
            pthread_mutex_unlock(&mutex[i]);
        }

		// stampo il livello di saturazione della barriera
		printf("\nTotale incasso della barriera: %d Euro\n", totale_incasso);

		printf("\n");
    }
    return NULL;
}

int main() {
    srand(time(NULL));

    pthread_t varchi[NUM_VARCHI];
    pthread_t generatore, stampa;
    int ids[NUM_VARCHI];

	// creo i thread per i varchi
    for(int i = 0; i < NUM_VARCHI; i++) {
        ids[i] = i;
        pthread_create(&varchi[i], NULL, gestione_varco, ids[i]);
    }
	// creo il thread per il generatore di auto e la stampa
    pthread_create(&generatore, NULL, generatore_auto, NULL);
    pthread_create(&stampa, NULL, stampa_stato, NULL);

	// aspetto la terminazione dei thread dei varchi
    for(int i = 0; i < NUM_VARCHI; i++) {
        pthread_join(varchi[i], NULL);
    }
	// aspetto la terminazione dei thread del generatore e della stampa
    pthread_join(generatore, NULL);
    pthread_join(stampa, NULL);

    return 0;
}
