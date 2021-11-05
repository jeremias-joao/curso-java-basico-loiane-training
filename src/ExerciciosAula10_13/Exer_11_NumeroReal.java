package ExerciciosAula10_13;

import java.util.Scanner;

/**
Faça programa que peça 2 numeros interos e um
numero real:
Calculde e mostre:
a) o produto do dobro do primeiro com a metade de segundo
b) a soma so triplo do primeiro com o terceiro
c) o terceiro elevado ao cubo
*/
public class Exer_11_NumeroReal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com um numero inteiro: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Entre com um segundo numero inteiro: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Entre com um numero Real: ");
		double num3 = scanner.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3) * (num2 + num3);
		double resultado3 = Math.pow(num3, 3); // num3 * num3 * num3;
		
		System.out.println("Resultado 1: " +resultado1);
		System.out.println("Resultado 2: " +resultado2);
		System.out.println("Resultado 3: " +resultado3);
		
		
		
		scanner.close();
	}

}
