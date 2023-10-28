class Cerchio{
	
	double raggio; //raggio
	
	
	//metodi costruttori
	Cerchio(double r){
		
		this.raggio=r;
	}
	Cerchio(){
		
		this.raggio=0;
		
	}
		
		
	//metodi descrittori
	
	
	// Metodo per calcolare l'area del cerchio
	double area() {
	    double a;
	    a= Math.PI * Math.pow(this.raggio, 2);
            return a;
	}
	double circonferenza() {
		double c;
		c=  2 * Math.PI * this.raggio;
		return c;
	}
	
}
