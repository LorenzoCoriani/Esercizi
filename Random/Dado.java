import java.io.*;
import java.util.Random;
class Dado{

	int facce; 
	int rand;
	
	Dado(int facce) {
		
		this.facce = facce;
	}

	// Metodo per lanciare il dado e ottenere un valore casuale
	int lanciaDado() {
		rand=1+(int)(Math.random()*(facce));//valore da 1 a 6
		return rand;
	}
	
}