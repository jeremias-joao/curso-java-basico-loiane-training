package ExerciciosAula14_15;

import java.util.Scanner;
/*
 Faça um programa que peça dois numeros
 e imprima o maior deles
  @author Jeremias
 */
public class Exer_01_NumeroMaior {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com primeiro Numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Entre com segundo Numero: ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior é: "+num1);
		} else {
			System.out.println("O maior é: "+num2);
		}
		
		scanner.close();

	}

}
