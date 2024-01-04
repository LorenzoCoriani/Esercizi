/*
Nome: Lorenzo Coriani
Classe: 4 f
File: Appunti.java
*/
import java.util.Arrays;

class Appunti {

    // attributi
    String[] annotazioni;
    int indice;

    // costruttore
    Appunti() {
        annotazioni = new String[100];
        indice = 0;
    }

    // metodo che inserisce un'annotazione
    void inserisciAnnotazione(String annotazione)throws LimiteAnnotazioniException{
        if (indice < annotazioni.length){
            annotazioni[indice] = annotazione;
            indice++;
            System.out.println("Annotazione aggiunta: " + annotazione);
        } else {
		throw new LimiteAnnotazioniException();
        }
    }

    // metodo che visualizza tutte le annotazioni
    void visualizzaAnnotazioni(){
        System.out.println("Elenco delle annotazioni:");
        for (String annotazione : annotazioni){
            if (annotazione != null) {
                System.out.println(annotazione);
            }
        }
    }

    // metodo che visualizza annotazioni contenenti una determinata parola chiave
    void visualizzaPerParola(String chiave){
        boolean trovato = false;
        for (int i = 0; i < indice; i++){
            if (annotazioni[i].contains(chiave)){
                trovato = true;
                System.out.println((i + 1) + ": " + annotazioni[i]);
            }
        }
        if (!trovato){
            System.out.println("Nessuna annotazione trovata con la parola chiave: " + chiave);
        }
    }

    // metodo che elimina un'annotazione in base alla posizione
    void elimina(int posizione) throws EliminazioneException{
        if (posizione > 0 && posizione <= indice) {
            for (int i = posizione - 1; i < indice - 1; i++){
                annotazioni[i] = annotazioni[i + 1];
            }
            annotazioni[indice - 1] = null;
            indice--;
            System.out.println("Annotazione eliminata con successo!");
        } else {
		throw new EliminazioneException();
        }
    }
}


	
	