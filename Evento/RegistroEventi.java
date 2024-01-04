import java.time.*;
import java.io.*;
class RegistroEventi{
	
	Evento eventi[];
	int numeroEventi;
	int capacitaMassima;
	
	//costruttore che tiene conto degli eventi  in un registro
	RegistroEventi(int capacitaMassima){
		this.capacitaMassima = capacitaMassima;
		eventi = new Evento[capacitaMassima];
		numeroEventi = 0;
	}
	
	//metodo che aggiunge gli eventi nel registro e se il registro e verifica se il registro � pieno
	void aggiungiEvento(Evento evento)throws CapacitaMassimaException{
		if (numeroEventi < capacitaMassima){
		    eventi[numeroEventi] = evento;
		    numeroEventi++;
		} else {
			throw new CapacitaMassimaException();
		}
	}
	
	//metodo che mostra tutti gli eventi del giorno
	public Evento[] eventiGiorno(LocalDate dataRicerca) {
		Evento[] eventiData = new Evento[capacitaMassima];
		int numeroEventiData = 0;

		for (int i = 0; i < numeroEventi; i++) {
		    if (eventi[i].data.equals(dataRicerca)) {
			eventiData[numeroEventiData] = eventi[i];
			numeroEventiData++;
		    }
		}
		return eventiData;
    }
    //metodo che mostra tutti gli eventi del  mese
	Evento[] eventiMese(int mese, int anno){
		Evento[] eventiData = new Evento[capacitaMassima];
		int numeroEventiData = 0;

		for (int i = 0; i < numeroEventi; i++) {
		    if (eventi[i].data.getMonthValue()==mese && eventi[i].data.getYear()==anno) {
			eventiData[numeroEventiData] = eventi[i];
			numeroEventiData++;
		    }
		}
		return eventiData;
	    
	}
	
	//metodo che mostra tutti gli eventi dell'anno
	Evento[] eventiAnno(int anno){
		Evento[] eventiData = new Evento[capacitaMassima];
		int numeroEventiData = 0;

		for (int i = 0; i < numeroEventi; i++) {
		    if (eventi[i].data.getYear()==anno) {
			eventiData[numeroEventiData] = eventi[i];
			numeroEventiData++;
		    }
		}
		return eventiData;
	}
	
	//eventi intervallo
	Evento[] eventiIntervallo(LocalDate inizio,LocalDate fine){
		Evento[] eventiData = new Evento[capacitaMassima];
		int numeroEventiData = 0;

		for (int i = 0; i < numeroEventi; i++) {
		    if (eventi[i].data.compareTo(inizio) >= 0 && eventi[i].data.compareTo(fine)<=0) {
			eventiData[numeroEventiData] = eventi[i];
			numeroEventiData++;
		    }
		}
		return eventiData;		
	}
}