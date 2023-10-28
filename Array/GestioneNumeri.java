class GestioneNumeri{
	
	double vet[];
	
	String nome="";
	
	GestioneNumeri(int n){
		
		double x;
		int i=0;
		vet = new double[n];
		for(i=0;i<n;i++){
			
			x=Math.random()*51;
		}
	
	}
	GestioneNumeri(int n,String nome){
	
	this.nome=nome;
		
	
	}
	double media(){ // Funzione calcolo Media
		int i=0;
		double m;
		double tmp=0;
		for(i=0;i<vet.length;i++){
			tmp+=vet[i];
		
		}
		m=tmp/vet.length;
		return m;
	
	}
	double min(){ // Funzione calcolo Minimo
		int i=0;
		int j=1;
		double tmp=0;
		for(i=0;i<vet.length;i++){
			if(vet[i]<vet[j]){
				tmp=vet[i];
			}
			j++;
		}
		return tmp;
	
	}
	double max(){ // Funzione calcolo Massimo
		int i=0;
		int j=1;
		double tmp=0;
		for(i=0;i<vet.length;i++){
			if(vet[i]>vet[j]){
				tmp=vet[i];
			}
			j++;
		}
		return tmp;
	
	}
	int n_ripetuti(int n){ // Funzione calcola numeri ripetuti
		int i=0;
		int rip;
		double tmp=0;
		for(i=0;i<vet.length;i++){
			if(vet[i]==n){
				rip++;
			}
			
		}
		return rip;
	}
	void ordine(){ // Funzione ordinamento
		double tmp;
		int max;
		for(i=0;i<vet.length-1;i++){
			max=i;
			for(j=i+1;j<vet.length;j++){
				
				
			}
	}
	double stampa(){ //Funzione visua
	
	}
	
}
	
	