import java.io.*;
	class TestDado{
	public static void main(String[] args) {
		// Creare due dadi 
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		Dado dado3 = new Dado(6);
		Dado dado4 = new Dado(6);
		Dado dado5 = new Dado(6);
		Dado dado6 = new Dado(6);

		//simulare e visualizzare i risultati dei lanci dei dadi
		int risultatoDado1 = dado1.lanciaDado();
		int risultatoDado2 = dado2.lanciaDado();
		int risultatoDado3 = dado3.lanciaDado();
		int risultatoDado4 = dado4.lanciaDado();
		int risultatoDado5 = dado5.lanciaDado();
		int risultatoDado6 = dado6.lanciaDado();

		System.out.println("Risultato del lancio del dado 1: " + risultatoDado1);
		System.out.println("Risultato del lancio del dado 2: " + risultatoDado2);
		System.out.println("Risultato del lancio del dado 3: " + risultatoDado3);
		System.out.println("Risultato del lancio del dado 4: " + risultatoDado4);
		System.out.println("Risultato del lancio del dado 5: " + risultatoDado5);
		System.out.println("Risultato del lancio del dado 6: " + risultatoDado6);
	}
}

	