
import java.io.*;
import java.time.*;			//contiene le classi  LocalData, LocalTime, e LocalDataTime


import java.time.temporal.*;		//contiene la classe CronoUnit
import java.time.format.*;		//contiene la classe DateTimeFormatter

public class TestData{
	
	public static void main(String arg[]){
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		
		try{
			LocalDate dataOggi=LocalDate.now();
			System.out.println("Data odierna: "+dataOggi.toString());
		
			LocalDateTime dataOggiInizio=dataOggi.atStartOfDay();
			System.out.println("Data odierna all'inizio: "+dataOggiInizio.toString());
			
			LocalDate dataNascita=LocalDate.parse("2000-02-01");
			System.out.println("Data nascita: "+dataNascita.toString());
			
			LocalDateTime adesso=LocalDateTime.now();
			System.out.println("Data e ora attuale: "+adesso.toString());
			System.out.println("Data e ora attuale: "+adesso.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
			System.out.println("Data e ora attuale: "+adesso.format(DateTimeFormatter.ofPattern("yyyy-MM-dd     kk:mm:ss")));
			
			
			
			//String[] Month.values()	 restituisce un array con tutti i mesi in inglese
			
			long diffGiorni = ChronoUnit.DAYS.between(dataNascita,dataOggi);
			System.out.println("\nLa differenza tra le due date è di " + diffGiorni + " giorni.");
			long diffMesi = ChronoUnit.MONTHS.between(dataNascita,dataOggi);
			System.out.println("\nLa differenza tra le due date è di " + diffMesi + " mesi.");
			long diffAnni = ChronoUnit.YEARS.between(dataNascita,dataOggi);
			System.out.println("\nLa differenza tra le due date è di " + diffAnni + " anni.");
			


						// Creare una data specifica
			LocalDate dataSpecificata = LocalDate.of(2023, 10, 14);
			System.out.println("Data specificata: " + dataSpecificata.toString());

			// Ottenere il giorno, il mese e l'anno
			int giorno = dataOggi.getDayOfMonth();
			int mese = dataOggi.getMonthValue();
			int anno = dataOggi.getYear();
			
			DayOfWeek giornoSettimana=dataOggi.getDayOfWeek();
			System.out.println("Giorno della settimana: " +giornoSettimana);
			Month meseEsteso=dataOggi.getMonth();
			System.out.println("Mese: " +meseEsteso);
			
			System.out.println("Giorno: " + giorno);
			System.out.println("Mese: " + mese);
			System.out.println("Anno: " + anno);

						// Verificare se una certa data viene prima o dopo di un'altra data
			LocalDate altraData = LocalDate.of(2023, 11, 1);
			boolean primaDi = dataSpecificata.isBefore(altraData);
			boolean dopoDi = dataSpecificata.isAfter(altraData);

			System.out.println(dataSpecificata + " è prima di " + altraData + "? " + primaDi);
			System.out.println(dataSpecificata + " è dopo di " + altraData + "? " + dopoDi);
							
						//confronto fra date con compareTo
			int confronto= dataOggi.compareTo(dataNascita);
			
			if(confronto>0){
				System.out.println("La data "+dataNascita+" viene prima di "+dataOggi);
			}
			else{
				if(confronto<0){
					System.out.println("La data "+dataOggi+" viene prima di "+dataNascita);
				}
				else{
					System.out.println("Le date "+dataNascita+" e "+dataOggi+" sono uguali");
				}
			
				
			}	
			System.out.println("Giorno di scadenza:  "+dataOggi.plusDays(2));			
			
			
		
		
		}catch(Exception e){
		}
	}
}