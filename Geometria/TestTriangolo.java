/*
Nome: Lorenzo Coriani
Classe: 4f
File: TestTriangolo.java
*/
import java.io.*;
import java.lang.Math;
class TestTriangolo{
	public static void main(String[] args){
		
		double[] l=new double[3];//lunghezza
		double p;
		double a;
		
		Punto a= new Punto("A",1.2,3.4);
		Punto b= new Punto("B",2.4,6.8);
		Punto c= new Punto("C",3.2,3.4);
		
		Triangolo s1 = new Triangolo(a,b,c,"ABC");
		
		Triangolo s2 = new Triangolo(a,b,c,"ABC");		
		
		l=s1.lunghezza();
		for(int i =0; i<3;i++){
			System.out.println("La lunghezza del segmento s1 e: "+ l[i]);
		}
		p=s1.perimetro(l);
		System.out.println("Il perimetro del triangolo s1 e: "+ p);
		
		if(s1.confronto(s2,l)>0){
			System.out.println("Il triangolo s1 e maggiore del triangolo s2: ");
		}
		else if(s1.confronto(s2,l)<0){
			System.out.println("Il triangolo s1 e minore del triangolo s2: ");
		}else{
			System.out.println("Il triangolo s1 e uguale al triangolo s2: ");
		
		}
		a=s1.area(l);
		
			
		
	}
}