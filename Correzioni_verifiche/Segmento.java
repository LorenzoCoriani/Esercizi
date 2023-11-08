/*
Nome: Lorenzo Coriani
Classe: 4f
File: Segmento.java
*/
class Segmento{
	
	//attributi
	
	Punto p;
	Punto p2;
	String nome_segmento;
	
	//costruttori
	
	Segmento(Punto p, Punto p2, String nome_segmento){
		
		this.p=p;
		this.p2=p2;
		this.nome_segmento=nome_segmento;
		
	}
	
	Segmento(Punto p, Punto p2){
		
		this.p=p;
		this.p2=p2;
		
	}
	
	//costruttore aaccetta solo un punto perchè l'altro punto è l'origine
	Segmento(Punto p2){
		
		this.p=new Punto();
		this.p2=p2;
	
	}
	
	double lunghezza(){
		
		double l;
		l=this.p.distanza(this.p2);
		return l;
		
	}
	double angolo(){
		double a;//angolo
		a=this.p.calcolaAngolo(p2);
		return a;
	
	}
	boolean uguale(Segmento s){
		
		if(this.p.x==s.p.x && this.p.y==s.p.y && this.p2.x==s.p2.x && this.p2.y==s.p2.y){
			return true;
		}
		else{
			return false;
		}
			
			
	}
	
}