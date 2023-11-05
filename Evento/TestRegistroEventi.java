/*
Nome: Lorenzo Coriani
Classe: 4f
File:TestRegistroEvento.java
*/
import java.time.*;
import java.io.*;
class TestRegistroEventi{
	
	public static void main(String[] args){

		RegistroEventi re = new RegistroEventi(3);
		
		// Inserimento eventi nel registro
		Evento evento = new Evento("Evento 1", LocalDate.of(2023, 11, 1), "Descrizione dell'evento 1");
		re.aggiungiEvento(evento);
		
		evento = new Evento("Evento 2", LocalDate.of(2023, 12, 2));
		re.aggiungiEvento(evento);
		
		evento = new Evento("Evento 3", "31/12/2022", "Descrizione dell'evento 3");
		re.aggiungiEvento(evento);

		// Stampo tutti gli eventi
		System.out.println("Elenco eventi: ");		
		for(Evento e : re.eventi) {
			System.out.println(e.toString());			
		}
		
		// Test ricerca eventi del giorno
		LocalDate g = LocalDate.of(2023, 11, 1);
		Evento[] eg = re.eventiGiorno(g);

		System.out.println("Eventi del giorno: "+ g);		
		for(Evento e : eg) {
			if (e != null)
				System.out.println(e.toString());			
		}
			
		// Test ricerca eventi del mese
		int anno=2023;
		int mese=12;
		eg = re.eventiMese(mese,anno);

		System.out.println("Eventi del mese: " + anno + "/" + mese);		
		for(Evento e : eg) {
			if (e != null)
				System.out.println(e.toString());			
		}

		// Test ricerca eventi del anno
		eg = re.eventiAnno(anno);

		System.out.println("Eventi del'anno: " + anno);		
		for(Evento e : eg) {
			if (e != null)
				System.out.println(e.toString());			
		}
		
	
	}
}