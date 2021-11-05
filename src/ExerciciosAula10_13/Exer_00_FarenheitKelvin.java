package ExerciciosAula10_13;

import java.util.Scanner;

/**
Faça programa que peça a temperatura em grau
Farenheit e transforme e mostre a temperatura em grau  Kelvin
*/

public class Exer_00_FarenheitKelvin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em grau Farenheit: ");
		double tempFarenheit = scanner.nextDouble();
		
		double tempKelvin  = (tempFarenheit - 32) * 5/9 + 273.15;
		
		System.out.println("A temperatura " +tempFarenheit + " F " + "é igual " + tempKelvin + " K ");
		
		scanner.close();
	}

}
