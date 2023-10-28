import java.io.*;
	class TestDado{
	public static void main(String[] args) {
		// Creare due dadi 
		Dado dadi[] = new Dado[6];
		dadi = new Dado[6];
		int i=0;
		for(i=0;i<6;i++){
			dadi[i]=new Dado(6);
		}
		//simulare e visualizzare i risultati dei lanci dei dadi
		int risultato[];
		risultato = new int[6];
		i=0;
		for(Dado dado : dadi){
			risultato[i]=dado.lanciaDado();
			i++;
		}
		
		i=0;
		for(Dado dado : dadi){
			System.out.println("Risultato del lancio del dado "+i+": " + risultato[i]);
			i++;
		}
	}
}

	