//Lorenzo Coriani
import java.lang.Math;
import java.io.*;
class Triangolo{
	
	Punto a;
	Punto b;
	Punto c;
	String nome;
	//costruttori
	Triangolo(Punto a,Punto b,Punto c,String nome){
		
		this.a=a;
		this.b=b;
		this.c=c;
		this.nome=nome;
	}
	Triangolo(Punto a,Punto b,Punto c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//Costruttore dove crea i punti randomici
	
	Triangolo(){
		this.a = new Punto("A", Math.random() * 50, Math.random() * 50);
		this.b = new Punto("B", Math.random() * 50, Math.random() * 50);
		this.c = new Punto("C", Math.random() * 50, Math.random() * 50);

	}
	double[] lunghezza(){
		double[] l=new double[3];
		l[0]=a.distanza(b);
		l[1]=b.distanza(c);
		l[2]=c.distanza(a);
		
		return l;
	}
	double perimetro(double l[]){
		double p;
		p=l[0]+l[1]+l[2];
		return p;
	}
	int confronto(Triangolo t,double l[]){
		double c =perimetro(l) - t.perimetro(l);
		if (c > 0){
			return 1;
		}
		if(c<0){
			return -1;
		}
		else{
			return 0;
		}
	
	}
	double area(double l[]){
		double a;
		double s = perimetro(l) / 2; 
		//formula di erone
		a= Math.sqrt(s * (s - l[0]) * (s - l[1]) * (s - l[2]));
		return a;
		
	}

}
