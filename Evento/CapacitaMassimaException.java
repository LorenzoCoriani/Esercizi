//eccezione per verificare se il registro � pieno
public class CapacitaMassimaException extends Exception{ 
	public CapacitaMassimaException(){
		super("Il registro ? pieno, impossibile aggiungere altri eventi.");
	}
	public CapacitaMassimaException(String messaggio){
		super(messaggio);
	}
}