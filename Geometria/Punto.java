class Punto{
	
	double x,y;	//coordinate cartesiane
	String name;
	
	//-----------
	Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	Punto(double x, double y, String nome){
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	Punto(){		//crea un punto nel origine
		this.x = 0;
		this.y = 0;
		this.name = "o";
	}
	
	//-----------
	double distanza(Punto p){
		double res;
		res = Math.sqrt(Math.pow((p.x-this.x),2) + Math.pow((p.y-this.y),2));
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
	
	String toStringa(){
		String res;

		res = "{ Nome: " + name;
		res += " X: " + x;
		res +="  Y: " + y;
		res +=" } ";
				
		return res;
	}
}

