import java.io.*;
class Setpoint{
	
	Punto pvet[]; // reference dell'array
	String nome="";
	
	Setpoint(int np){
		pvet= new Punto[np];
	}
	
	boolean cerca(Punto p){
		boolean b = false;
		for(int i=0;i<pvet.length;i++){
			if(p.equal(pvet[i])==true){
				b=true;
			}
		}
		return b;
	}
	
	boolean cerca(double x, double y){
		boolean b;
		Punto p= new Punto(x,y);
		b=this.cerca(p);
		return b;
	}
	
	
	void inserisci_punti(){
		InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader key= new BufferedReader(in);
		String tmp;
		double x,y;
		System.out.println("Inserisci le coordinate dei punti dell'array");

		try{
			for(int i=0;i<pvet.length;i++){
				System.out.println("Inserisci la x :");
				tmp= key.readLine();
				x=Double.parseDouble(tmp);
				System.out.println("Inserisci la y :");
				tmp= key.readLine();
				y=Double.parseDouble(tmp);
				pvet[i]= new Punto(x,y);
			}
		}catch(IOException e){
		
		}
	}
	void calcolo_distanza(Punto p){	
		double dis =0;
		for(int i=0;i<pvet.length;i++){
			dis=p.distanza(pvet[i]);
			System.out.println("La distanza dal punto 0 e :" + dis);
		}
	}
	void calcolo_baricentro(Punto p){
		double bar=0;//Baricentro
		for(int i=0;i<pvet.length;i++){
			bar=(p.distanza(pvet[i])/2);
			System.out.println("La distanza dal punto 0 e :" + bar);
		}
	}
	
	void calcolo_min_max(Punto p){
		double dis =0;
		double min=dis;
		double max=0;
		for(int i=0;i<pvet.length;i++){
			dis=p.distanza(pvet[i]);
			if(min==0){
			min=dis;
			max=dis;
			}
			else{
				if(dis<min){
					min=dis;
				}
				if(dis>max){
					max=dis;
				}
			}
		}
		System.out.println("La distanza minore dal punto 0 e :" + min);
		System.out.println("La distanza maggiore dal punto 0 e :" + max);
	}
}
