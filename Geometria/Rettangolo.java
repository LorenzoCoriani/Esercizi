class Rettangolo{
	
	double base; //Base del rettangolo
	double altezza; //Altezza del rettangolo
	
	//metodi costruttori
	Rettangolo(double base, double altezza){
		this.base=base;
		this.altezza=altezza;
		
	}
	
	//metodi descrittori
	double area(){
		double a;
		a=base*altezza;
		return a;
	}
	double perimetro(){
		double p;
		p=(base+altezza)*2;
		return p;
	}

}
