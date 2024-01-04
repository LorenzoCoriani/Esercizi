/*
Nome: Lorenzo Coriani
Classe: 4 f
File: AnalisiTesto.java
*/
import java.io.*;
import java.util.StringTokenizer;

class AnalisiTesto{
	
	//attributi
	String nomeFile;
	
	int numeroCaratteri;
	int numeroParole;
	int numeroRighe;
	int numeroFrasi;
	String testo="";
	
	AnalisiTesto(String nfile){
		
		this.nomeFile=nfile;
		
	}
	AnalisiTesto(){
	}
	//legge il file e calcola gli attributi del testo
	void LeggiFile(){
		String s = " ";
		int i=0;
		boolean inizioParola;
		boolean fineParola;
		String spazio =" ";
		try{
			//apertura file
			FileReader f = new FileReader(nomeFile);
			BufferedReader FIN = new BufferedReader(f);
			
			char c=' ';
			int car=0;
			int tmpParole=0;
			//serve a convertire i caratteri in un'unica stringa
			StringBuilder sb = new StringBuilder();
			//leggo tutto il file per caratteri e ne calcolo il numero 
			// creo una stringa con tutto il testo per evitare di aprire il file più volte
			while(car != -1){
				car=FIN.read();
				c=(char)car;
				//aggiunge il carattere alla stringa
				sb.append(c);
				//non calcolo gli andata a capo
				if (c!='\n') {
					i++;
				}	
			}
			testo = sb.toString();

			numeroCaratteri = i;
			//calcolo numero di parole nel testo
			StringTokenizer stParole;//	
			stParole = new StringTokenizer(testo);
			numeroParole =stParole.countTokens();			
			
			//calcolo righe
			StringTokenizer stRighe;
			stRighe = new StringTokenizer(testo,"\n");
			numeroRighe=stRighe.countTokens();
			
			//calcolo frasi
			StringTokenizer stFrasi;
			stFrasi = new StringTokenizer(testo,".");
			numeroFrasi=stFrasi.countTokens();
			
		}
		catch(IOException e){
			System.out.println("Eccezzione: " + e.getMessage());
		}
	}
	//metodo per calcolare la percentuale di ricorrenza di un carattere specifico
	double CalcolaRicorrenza(char c){
		
		int l;
		int occorrenza=0;
		l=testo.length();
		for(int i=0;i<l;i++){
			
			if(testo.charAt(i)==c){
				occorrenza++;
			}
		}
		
		return (occorrenza*100)/l;
		
		
	}
	//metodo per calcolare la percentuale di ricorrenza di tutti i caratteri 
	double[] CalcoloRicorrenze(){
		char[] alfabeto = {'a','b','c','d','e','f','g','h','i','l','m','n','o','p','q','r','s','t','u','v','z'};
		double[] risultati = new double[21];
		for(int i=0;i<21;i++){
			
			risultati[i]=CalcolaRicorrenza(alfabeto[i]);
		}
		return risultati;
	}
	
}