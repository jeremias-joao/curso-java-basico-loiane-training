package ExerciciosAula10_13;

import java.util.Scanner;

/**
Faça um programa que peça  o raior de um circulo, 
calculer e mostre a sua area

*/

public class Exer_06_AreaCirculo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o raio de circulo:");
		double raio = scanner.nextDouble();
		
		double areaCirculo =  Math.PI * Math.pow(raio, 2);
		//double areaCirculo = 3.14 * (raio * raio);
		
		System.out.println("A area de Circulo é: "+areaCirculo);
		
		scanner.close();
	}

}
