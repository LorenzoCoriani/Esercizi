import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args){
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader key = new BufferedReader(in);
		Vector<Segmento> v = new Vector<Segmento>();
		double ax,ay,bx,by;
		int risposta;
		String tmp;
		int indice;
		boolean segmentoTrovato = false;
		
		Punto p;
		Punto p2;
		Segmento s = null;
		Segmento strova = null;
		try{
			do{
				System.out.println("Scegli un'opzione: ");
				System.out.println("1:Inserisci un segmento ");
				System.out.println("2:Visualizza un segmento ");
				System.out.println("3:Elimina un segmento ");
				System.out.println("4:Trovare un segmento ");
				System.out.println("5:Esci ");

				risposta = Integer.parseInt(key.readLine());
				
				
				switch (risposta){
				    case 1: {
					System.out.println("Inserisci x del  punto a:");
					ax=Double.parseDouble(key.readLine());
					System.out.println("Inserisci y del  punto a:");
					ay=Double.parseDouble(key.readLine());
					System.out.println("Inserisci x del  punto b:");
					bx=Double.parseDouble(key.readLine());
					System.out.println("Inserisci y del  punto b:");
					by=Double.parseDouble(key.readLine());

					p = new Punto("A",ax,ay);
					p2 = new Punto("B",bx,by);
					s = new Segmento(p,p2);
					
					v.add(s);
					
					break;
				    }
				    case 2:{
					    
					for(int i=0;i<v.size();i++){
						s=(Segmento)v.get(i);
						System.out.println("Il segmento "+i+" e: "+ s.toString());
					}
					break;
				    }
				    case 3:{
					System.out.println("Inserisci l'indice dell'elemento da rimuovere:");
					indice=Integer.parseInt(key.readLine());
					if(indice>=0 && indice<=v.size()){
						v.removeElementAt(indice);
					}
					else{
						System.out.println("Indice non valido:");
					}
					break;
					}
				    case 4:{
					
					System.out.println("Inserisci ax del  punto:");
					ax=Double.parseDouble(key.readLine());
					System.out.println("Inserisci ay del  punto:");
					ay=Double.parseDouble(key.readLine());
					System.out.println("Inserisci bx del  punto:");
					bx=Double.parseDouble(key.readLine());
					System.out.println("Inserisci by del  punto:");
					by=Double.parseDouble(key.readLine());
					    
					p = new Punto("A",ax,ay);
					p2 = new Punto("B",bx,by);
					strova = new Segmento(p,p2);
										
					
					segmentoTrovato = v.contains(strova);

					if (segmentoTrovato) {
						System.out.println("Il segmento e  presente nella lista.");
					} else {
						System.out.println("Il segmento non e presente nella lista.");
					}    
					break;   
					}
				    case 5:{
					
					break;
				    }
				    default:{
					System.out.println("Opzione non valida!");
					break;
				    }
				    
			}
			}while(risposta!=5);
		}catch (IOException e){
			System.out.println("errore");
		}
	}
}