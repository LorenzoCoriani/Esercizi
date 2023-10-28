import java.io.*;
class TestRettangolo{
	public static void main(String arg[]){
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader key= new BufferedReader(in);
		
		String tmp;
		double base,altezza;
		try{
			System.out.println("Inserisci la base");
			tmp = key.readLine();
			base = Double.parseDouble(tmp);
			System.out.println("Inserisci l'altezza");
			tmp = key.readLine();
			altezza = Double.parseDouble(tmp);
			
			
			Rettangolo r1;
			r1= new Rettangolo(base,altezza);
			System.out.println("Area:" + r1.area());
			System.out.println("Perimetro:" + r1.perimetro());
			
		}catch(IOException e){
			// gestire le eccezioni
		}
	}
}