/*
Nome: Lorenzo Coriani
Classe: 4f
File:TestEvento.java
*/
import java.time.*;
import java.io.*;
class TestEvento{
	
	public static void main(String[] args){
		
		Evento evento1 = new Evento("Evento 1", LocalDate.of(2023, 11, 1), "Descrizione dell'evento 1");
		Evento evento2 = new Evento("Evento 2", LocalDate.of(2023, 11, 2));
		Evento evento3 = new Evento("Evento 3", "03/11/2023", "Descrizione dell'evento 3");

		// Stampa delle informazioni sugli eventi
		System.out.println("Informazioni sugli eventi:");
		System.out.println(evento1.toString());
		System.out.println(evento2.toString());
		System.out.println(evento3.toString());
	
	}
}