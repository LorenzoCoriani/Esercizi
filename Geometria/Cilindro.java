class Cilindro extends Cerchio {
	
	double altezza;
	String nome="";
	
	Cilindro(String nome,double altezza,double raggio){
		super(raggio);
		this.altezza=altezza;
		this.nome=nome;
	}
	
	double areacilindro(){
		double a;
		a=(2*super.area())+(this.altezza*super.circonferenza());
		return a;
	}
	
	double volumecilindro(){
		double v;
		v=super.area()*this.altezza;
		return v;
		
	}
	
	
}