/*
Nome: Lorenzo Coriani
Classe: 4 f
File: TestAnalisiTesto.java
*/
import java.io.*;

class TestAnalisiTesto{
	
	public static void main(String[] args){
		
		AnalisiTesto at = new AnalisiTesto("Prova.txt");
		
		at.LeggiFile();

		System.out.println("Numero caratteri: " + at.numeroCaratteri);
		System.out.println("Numero parole: " + at.numeroParole);
		System.out.println("Numero righe: " + at.numeroRighe);
		System.out.println("Numero frasi: " + at.numeroFrasi);

		// Calcola ricorrenze di un carattere nel file
		double ricorrenza = at.CalcolaRicorrenza('c');
		System.out.println("Percentuale ricorrenza del carattere 'c': " + ricorrenza);

		// Calcola ricorrenze di tutti i caratteri dell'alfabeto
		double[] ricorrenze = at.CalcoloRicorrenze();
		for(int i=0; i<21;i++){
			System.out.println("Percentuale ricorrenza del carattere: " + ricorrenze[i]);
		}

	}
}