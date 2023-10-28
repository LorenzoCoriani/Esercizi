import java.io.*;
class TestSetpoint{
	public static void main(String[] args){
		
		InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader key= new BufferedReader(in);
		
		
		String tmp;
		double x=0,y=0;
		
		Setpoint s = new Setpoint(5);
		// Inserisco i punti nell'array
		s.inserisci_punti();
		// Richiedo le coordinate del punto da cercare
		try{
		System.out.println("Inserisci le coordinate del punto che stai cercando");
		System.out.println("Inserisci la x :");
		tmp= key.readLine();
		x=Double.parseDouble(tmp);
		System.out.println("Inserisci la y :");
		tmp= key.readLine();
		y=Double.parseDouble(tmp);
		}
		catch(IOException e){
		}
		
		Punto p= new Punto(x,y);
		// Cerco se il punto esiste o no
		if(s.cerca(p)==true){
			System.out.println("Il punto esiste");
		}
		else{
			System.out.println("Il punto non esiste");
		}
		// Trovo la distanza dei punti dal punto 0
		Punto zero = new Punto(0,0);
		
		System.out.println("Calcolo distanze dall'origine ");
		s.calcolo_distanza(zero);
		//Trovo il baricentro 
		System.out.println("Calcolo baricentro dall'origine ");
		s.calcolo_baricentro(zero);
		//Calcolo distanza maggiore e minore
		System.out.println("Calcolo della distanza maggiore e minore dall'origine ");
		
		s.calcolo_min_max(zero);
		
	}	
}