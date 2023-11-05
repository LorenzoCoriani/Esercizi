/*
Nome: Lorenzo Coriani
Classe: 4f
Data: 1/11/23
File: Evento.java
*/
import java.io.*;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Evento{
	
	//Attributi
	public String nome;
	public LocalDate data;
	public String descrizione;//descrizione dell'evento 
	
	//costruttori
	Evento(String nome,LocalDate data, String descrizione){
		this.nome=nome;
		this.data=data;
		this.descrizione=descrizione;
	}
	Evento(String nome,LocalDate data){
		this.nome=nome;
		this.data=data;
	}
	
	Evento(String nome, String data, String descrizione) {
		this.nome = nome;
		descrizione = descrizione.trim();
		
		// formato "gg/mm/aaaa"
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.data = LocalDate.parse(data, formatter);
		this.descrizione = descrizione;
	}
	
	//descrittori
	public String toString(){
		String res;

		res = "Nome: " + nome;
		res += " Data: " + data.toString();
		res += " Descrizione: " + descrizione;
		
		return res;
	}

}

