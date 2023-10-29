/*
Nome: Lorenzo Coriani
Classe: 4f
File: TestPunto.java
*/
import java.io.*;
class TestPunto{
	public static void main(String[] args){
		
		double x=0,y=0;
		double d;
		
		// Creo il punto origine
		Punto zero = new Punto();
		Punto pvet[];
		pvet = new Punto[3];
		double dis[]=new double[3];
		
		pvet[0]= new Punto("A",1.2,3.4);
		pvet[1]= new Punto("B",1.6,3.8);
		pvet[2]= new Punto("C",3.5,1.5);
		
		//Test metodo distanza
		for(Punto p : pvet){
			System.out.println("La distanza tra il punto "+p.toString() +" e il punto " + zero.toString()+" e: " +p.distanza(zero));
			System.out.println("Il punto medio tra il punto "+p.toString() +" e il punto " + zero.toString()+" e: " +p.punto_medio(zero));
			System.out.println("");
		}
		
		//test del costruttore del formato
		Punto t= new Punto("Test(1.6;3.8)");
		
		//test del metodo equal
		for(Punto p : pvet){
			if(p.equal(t)){
				System.out.println("Il punto "+p.toString() +" e uguale al punto " + t.toString());
			}
		}
		System.out.println("");
		//test metodo trasla
		pvet[0].trasla(1.0,1.0);
		System.out.println("Le nuove coordinate sono "+pvet[0].toString());
		System.out.println("");
		//test metodo calcolo coefficiente angolare
		double angolo;
		angolo=pvet[0].calcolaAngolo();
		System.out.println("L'angolo del punto "+pvet[0].toString()+" rispetto all'origine e: "+angolo);
	}
}