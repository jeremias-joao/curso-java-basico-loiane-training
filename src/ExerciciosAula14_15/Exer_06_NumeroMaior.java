package ExerciciosAula14_15;

import java.util.Scanner;

/**
 Faça um programa que leia tres numeros e mostre
 o maior deles
 * @author Jeremias
 */
public class Exer_06_NumeroMaior {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com primeiro numero: ");
		int num1 = scanner.nextInt();
		System.out.print("Entre com segundo numero: ");
		int num2 = scanner.nextInt();
		System.out.print("Entre com terceiro numero: ");
		int num3 = scanner.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("num1 é maior:" +num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("num2 é maior:" +num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("num3 é maior:" +num3);
		}		
		
		scanner.close();
	}

}
