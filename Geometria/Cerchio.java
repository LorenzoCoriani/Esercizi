class Cerchio{
	
	double raggio; //raggio
	
	
	//metodi costruttori
	Cerchio(double r){
		
		this.raggio=r;
	}
	Cerchio(){
		
		this.raggio=0;
		
	}
	
	// Metodo per calcolare l'area del cerchio
	double calcolaArea() {
		double a=0;
		a=Math.PI*(Math.pow(raggio,2));
		return a;
	}
	double calcolaCirconferenza() {
		double c=0;
		c=  2 * Math.PI * raggio;
		return c;
	}
	
}