package ExerciciosAula10_13;

import java.util.Scanner;

/**
Faça programa que peça a temperatura em grau
Kelvin e transforme e mostre a temperatura em grau Farenheit
*/

public class Exer_00_KelvinFarenheit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em grau Kelvin: ");
		double tempKelvin = scanner.nextDouble();
		
		double tempFarenheit = (tempKelvin - 273.15) * 9/5 + 32;
		
		System.out.println("A temperatura " + tempKelvin+ " K " + "é igual "+tempFarenheit +" F ");
		
		scanner.close();
	}

}
