/*
Nome: Lorenzo Coriani
Classe: 4 f
File: Appunti.java
*/
import java.io.*;

class TestAppunti{
    public static void main(String[] args){
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(in);

        String tmp;
        int risposta, indice;
        Appunti a = new Appunti();
        boolean b = false;

        try {
            while (!b) {
                System.out.println("Scegli un'opzione:");
                System.out.println("1: Inserisci un'annotazione");
                System.out.println("2: Visualizzare tutte le annotazioni precedute da un contatore delle annotazioni");
                System.out.println("3: Cerca annotazioni per parola chiave");
                System.out.println("4: Elimina un'annotazione");
                System.out.println("5: Esci");

                risposta = Integer.parseInt(keyboard.readLine());

                switch (risposta){
                    case 1:
                        System.out.println("Inserisci l'annotazione: ");
                        tmp = keyboard.readLine();
                        a.inserisciAnnotazione(tmp);
                        break;
                    case 2:
                        a.visualizzaAnnotazioni();
                        break;
                    case 3:
                        System.out.println("Inserisci la parola chiave per la ricerca: ");
                        tmp = keyboard.readLine();
                        a.visualizzaPerParola(tmp);
                        break;
                    case 4:
                        System.out.println("Quale annotazione vuoi eliminare? (Inserisci l'indice): ");
                        indice = Integer.parseInt(keyboard.readLine());
                        a.elimina(indice);
                        break;
                    case 5:
                        b = true;
                        break;
                    default:
                        System.out.println("Opzione non valida!");
                        break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (EliminazioneException e){
            System.out.println("Errore nell'eliminazione!");
        }catch (LimiteAnnotazioniException e){
            System.out.println("Errore: hai inserito troppe annotazioni");
        }
    }
}
