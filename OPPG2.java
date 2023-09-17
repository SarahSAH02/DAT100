package no.hvl.dat100uke35;

import java.util.Scanner;

public class OPPG2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<=10;i++) { 
			System.out.println("Skriv inn poengsum: ");
			int poeng = scanner.nextInt();
	
		
	    
		
			
			//Dersom poeng er mellom 90 og 100, printes det ut karakter A
       if (poeng >= 0 && poeng <=100 ) { 
    	   if (poeng >= 90 && poeng <=100 ) {
			System.out.println("A");
		    }//Dersom poeng er mellom 80 og 89, pristes det ut karakter B (samme metode til karakter F.
			else if (poeng >= 80 && poeng <=89 ) {
				System.out.println("B");
		}
			else if (poeng >= 60 && poeng <=79 ) {
				System.out.println("C");
		}
			else if (poeng >= 50 && poeng <=59 ) {
				System.out.println("D");
		}
			else if (poeng >= 40 && poeng <=49 ) {
				System.out.println("E");
		}   else if (poeng >= 0 && poeng <=39 ) {
			System.out.println("F");
	    }
			// Dersom oppgitte karakter er negativ verdi eller over 100 printes det ut ugyldig poengsum
      } else {
			System.out.println("ugyldig poengsum" );
      }
		 
	}
	      scanner.close();

		 }
		  
}
	


