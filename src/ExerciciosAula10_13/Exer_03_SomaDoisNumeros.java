package ExerciciosAula10_13;

import java.util.Scanner;

/**
Faça um programa que peça dois numeros e imprima 
a soma;

*/

public class Exer_03_SomaDoisNumeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Entre com o  segundo numero: ");
		int num2 = scanner.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma dos numeros é: "+soma);
		
		scanner.close();
	}

}
