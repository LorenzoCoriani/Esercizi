//eccezione per verificare se il registro è pieno
public class EliminazioneException extends Exception{ 
	public EliminazioneException(){
		super("Errore eliminazione non riuscita!");
	}
	public EliminazioneException(String messaggio){
		super(messaggio);
	}
}