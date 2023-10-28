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
		x = 0;
		y = 0;
		name = "o";
		
	}
	
	//-----------
	double distanza(Punto p){
		double res;
		res = Math.sqrt(Math.pow((p.x-x),2) + Math.pow((p.y-y),2));
		return res;
	}
	
	boolean equal(Punto p2){
		boolean tmp;
		if(p2.x==this.x && p2.y==this.y){
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

