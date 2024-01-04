//eccezione per verificare se il registro è pieno
public class  LimiteAnnotazioniException extends Exception{ 
	public LimiteAnnotazioniException(){
		super("Errore hai aggiunto troppe annotazioni?");
	}
	public LimiteAnnotazioniException(String messaggio){
		super(messaggio);
	}
}