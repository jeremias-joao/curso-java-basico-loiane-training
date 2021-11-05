package ExerciciosAula10_13;

import java.util.Scanner;
/**
Faça programa que peça a temperatura em grau
celsius e transforme e mostre a temperatura em grau Kelvin
*/
public class Exer_00_Ceslcius_Kelvin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em grau Celsius: ");
		double tempCelsius = scanner.nextDouble();
		
		double tempKelvin = (tempCelsius + 273.15);
		
		System.out.println("A temperatura " +tempCelsius + " C " + " é igual " +tempKelvin +" K ");
		
		scanner.close();
	}

}
