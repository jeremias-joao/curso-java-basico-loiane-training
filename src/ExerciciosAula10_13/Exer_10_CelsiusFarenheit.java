package ExerciciosAula10_13;

import java.util.Scanner;

/**
Fa�a programa que pe�a a temperatura em grau
celsius e transforme e mostre a temperatura em grau farenheit
*/

public class Exer_10_CelsiusFarenheit {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em grau Celsius: ");
		double tempCelsius = scanner.nextDouble();
		
		double tempFarenheit = ((tempCelsius * 9/5) + 32);
		
		System.out.println("A temperatura "+tempCelsius + " C " + "� igual " +tempFarenheit + " F ");
		
		scanner.close();
	}

}
