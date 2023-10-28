/*Esercizio: Elenco di Studenti

Crea una classe Java chiamata Studente con gli attributi seguenti:

nome (una stringa)
cognome (una stringa)
voto (un numero decimale, ad esempio, il voto in una prova)
Successivamente, crea una classe chiamata ElencoStudenti che utilizzi un array di oggetti Studente per gestire un elenco di studenti. La classe ElencoStudenti dovrebbe avere i seguenti metodi:

Un costruttore che accetta un array di oggetti Studente come argomento e inizializza un attributo di istanza per memorizzare l'array.
Un metodo calcolaMediaVoti che calcoli la media dei voti degli studenti nell'array.
Un metodo stampaMedia che stampi la media calcolata.
*/

class Studente{
	
	String nome;
	String cognome;
	float voto[];
	
	//Costruttori
	
	Studente(String Nome,String Cognome,float voto[],int nv){
		this.nome = nome;
		this.cognome = cognome;
		this.voto = voto;
		voto= new float[nv];
	}
	double calcolaMediaVoti(int nv){
		
		double m;
		double somma=0;
		int i;
		for(i=0;voto[i]<nv;i++){
			somma+=voto[i];
		}
		m = voto[i]/nv;
		return m;
	}
	
	
	

} 