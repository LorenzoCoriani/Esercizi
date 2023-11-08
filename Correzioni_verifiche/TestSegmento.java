/*
Nome: Lorenzo Coriani
Classe: 4f
File: TestSegmento.java
*/
import java.io.*;
import java.lang.Math;
class TestSegmento{
	public static void main(String[] args){
		
		double l;//lunghezza
		double a;
		boolean u;
		
		Punto p= new Punto("A",1.2,3.4);
		Punto p2= new Punto("B",2.4,6.8);
		
		Segmento s1 = new Segmento(p,p2,"A-B");
		Segmento s2 = new Segmento(p);
		Segmento s3 = new Segmento(p,p2);
		
		l=s1.lunghezza();
		System.out.println("La lunghezza del segmento s1 e: "+ l);
		
		a=s1.angolo();
		System.out.println("L'angolo del segmento s1 e: "+ a);
		
		if(s1.uguale(s2))
			System.out.println("I segmenti s1 e s2 sono uguali");
		else 
			System.out.println("I segmenti s1 e s2 non sono uguali");
		
		if(s1.uguale(s3))
			System.out.println("I segmenti s1 e s3 sono uguali");
		else 
			System.out.println("I segmenti s1 e s3 non sono uguali");
		
	}
}