package ExerciciosAula14_15;
import java.util.Scanner;

/*
 Fa�a um programa  que verifique  se a letra
 digitada � vogal ou � consoante
 
 */

public class Exer_04_ConsoanteVogal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("Entre com uma letra: ");
		String letra = scanner.next();
		
		/**
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
		*/
		scanner.close();
		
		if (letra.length() > 1) {
			System.out.println("N�o � uma letra valida");
		} else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
		}
	}
		
		
		
		
		
		
		
	}
}
