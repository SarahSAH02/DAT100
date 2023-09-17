package no.hvl.dat100uke35;


import java.util.Scanner;


public class OPPG1 {

	public static void main(String[] args) {
		
		// En trinnskatt er en progressiv skatt på bruttolønn som beregnes når inntekten er høyere enn 164 100kr.
		//Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn bruttoinntekt: ");
		double brutto =  scanner.nextDouble();
		
		scanner.close();
		
		
		trinnskatt(brutto);
	}
	
	public static void trinnskatt(double inntekt) { 
		double trinn1 = 0.0093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		double grense1 = 164100;
		double grense2= 230950;
		double grense3= 580650;
		
	
		double trinnskatt = 0.0;
		
		if (inntekt <= grense1) {
			trinnskatt = inntekt * trinn1;
		} else if (inntekt <= grense2) {
			trinnskatt = grense1 *trinn1 +(inntekt -grense1)* trinn2;
		} 
		else if (inntekt <= grense3) {
	        trinnskatt = grense1 * trinn1 + (trinn2 - grense1) * trinn2 + (inntekt - grense2) * trinn3;
	    } 
	     else {
	        trinnskatt = grense1 * trinn1 + (trinn2 - grense1) * trinn2+ (trinn3 - grense2) * trinn3 + (inntekt - grense3) * trinn4;
	    }
			
			
		
		
	 System.out.println("Trinnskatt for oppgitt bruttoinntekt " + inntekt + " er " + trinnskatt);

}
		
}	
		

	
