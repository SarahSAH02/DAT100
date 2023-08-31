package no.hvl.dat100uke35;

import java.util.Scanner;

//OPPGAVE 3

//Lag et program som leser inn et heltall n > 0,
//beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen,
//der n! = 1*2*3* … *(n-1)*n.


public class OPPG3 {
	
	//lage en funksjon som tar n-heltall som variabel
	
	public static int fakultet(int n) {
		if (n==0) {
			return 1;   //dersom n == 0 blir det returnert 1
		} else {
			return n * fakultet(n-1); // formelen for n
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv inn et heltall: ");
		int n = scanner.nextInt();
		
		int fakultetverdi = fakultet(n);
		System.out.println(n + "! = " + fakultetverdi);
		
		scanner.close();

	}

}
