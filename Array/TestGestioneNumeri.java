import java.io.*;
class TestGestioneNumeri{
	public static void mani(String[] args){
	InputStreamReader in = new InputStreamReader(System.io)
	BufferedReader Key = new BufferedReader(in);
	
	try{
		String tmp;
		int n; //numeri max
		double nscelto;
		
		
		Syste.out.println("Inserisci il numero di numeri: ");
		tmp=key.readLine();
		n=Integer.parseInt(tmp);
		Syste.out.println("Inserisci un numero: ");
		tmp=key.readLine();
		nscelto=Double.parseDouble(tmp);
		GestioneNumeri g0 = new GestioneNumeri(n);
		
		Syste.out.println("Media: " + g0.media);
		Syste.out.println("Numero minore: " + g0.min);
		Syste.out.println("Numero maggiore: + "g0.max);
		Syste.out.println("Numero di numeri ripetuti: " + g0.n_ripetuti);
		
		
		
	
		
	}
	
}