//eccezione per verificare se il registro � pieno
public class  LimiteAnnotazioniException extends Exception{ 
	public LimiteAnnotazioniextends(){
		super("Errore hai aggiunto troppe annotazioni?");
	}
	public LimiteAnnotazioniextends(String messaggio){
		super(messaggio);
	}
}