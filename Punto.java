/*
Nome: Lorenzo Coriani
Classe: 4f
File: Punto.java
*/
import java.io.*;
import java.lang.Math;
class Punto{
	
	double x,y;	//coordinate cartesiane
	String name;
	
	//costruttori
	Punto(String name,double x, double y){
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	Punto(){		//crea un punto nel origine
		this.x = 0;
		this.y = 0;
		this.name = "origin";
	}
	
	Punto(String formato){
		
		int inizio=0,fine=0; // inizio e fine della sottostringa da  convertire
		double x,y;
		
		formato=formato.trim();
		fine=formato.indexOf("(");
		this.name=formato.substring(inizio,fine);
		inizio= fine;
		fine=formato.indexOf(";");
		this.x=Double.parseDouble(formato.substring(inizio+1,fine));
		inizio=fine;
		fine=formato.indexOf(")");
		this.y=Double.parseDouble(formato.substring(inizio+1,fine));
		
	}
	
	//descrittori
	double distanza(Punto p){
		double res;
		res = Math.sqrt(Math.pow((p.x-this.x),2) + Math.pow((p.y-this.y),2));
		return res;
	}
	
	double punto_medio(Punto p){
		double res;
		res = (Math.sqrt(Math.pow((p.x-this.x),2) + Math.pow((p.y-this.y),2))/2.0);
		return res;
	}
	
	boolean equal(Punto p){
		boolean tmp;
		if(p.x==this.x && p.y==this.y){
			tmp = true;
		}
		else{
			tmp =false ;
		}
		return tmp;
	}
	
	public String toString(){
		String res;

		res = name + "(";
		res +=  Double.toString(x)+ ";";
		res += Double.toString(y);
		res +=")";
				
		return res;
	}
	public void trasla(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double calcolaAngolo(Punto p) {
		double m;//angolo
		m=Math.atan2(this.y-p.y,this.x-p.x);
		return m;
	}


}
