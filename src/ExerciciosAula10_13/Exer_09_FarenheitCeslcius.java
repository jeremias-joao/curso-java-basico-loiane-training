package ExerciciosAula10_13;

import java.util.Scanner;

/**
Fa�a programa que pe�a a temperatura em grau
farenheit e transforme e mostre a temperatura em grau celcius
*/

public class Exer_09_FarenheitCeslcius {
	
	public static void main (String [] args ) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Grau Farenheit: ");
		double tempFarenheit = scanner.nextDouble();
		
		double tempCelsius = (5 * (tempFarenheit-32)/9);
		
		System.out.println("A temperatura " + tempFarenheit + " F � igual a " +tempCelsius + " C ");
		
		scanner.close();
	}
}
