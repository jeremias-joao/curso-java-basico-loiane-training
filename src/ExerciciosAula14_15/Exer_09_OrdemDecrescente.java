package ExerciciosAula14_15;

import java.util.Scanner;

/**
 Fa�a um programa que leia tres numeros
 e mostre em ordem decrescente
 */
public class Exer_09_OrdemDecrescente {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com primeiro numero: ");
		int num1 = scanner.nextInt();
		System.out.print("Entre com segundo numero: ");
		int num2 = scanner.nextInt();
		System.out.print("Entre com terceiro numero: ");
		int num3 = scanner.nextInt();
		
		if (num1 <= num2 && num1 <= num3 && num2 <=num3) {
			//num � menor
			//num3 � maior
			//num1 < num2 < num3
			System.out.println(num3 + " - " +num2 + " - " +num1);
			
		} else if (num1 <= num2 && num1 <= num3 && num3 <=num2) {
			//num � menor
			//num2 � maior
			//num1 < num3 < num2
			System.out.println(num2 + " - " +num3 + " - " +num1);
			
		}else if (num2 <= num1 && num2 <= num3 && num1 <=num3) {
			//num2 � menor
			//num2 � maior
			//num2 < num1 < num3
	
			System.out.println(num3 + " - " +num1+ " - " +num2);
			
		}else if (num2 <= num1 && num2 <= num3 && num3 <=num1) {
			//num2 � menor
			//num1 � maior
			//num2 < num3 < num1
			System.out.println(num1 + " - " +num3+ " - " +num2);
			
		}else if (num3 <= num1 && num3 <= num2 && num1 <=num2) {
			//num3 � menor
			//num2 � maior
			//num3 < num1 < num2
			System.out.println(num2 + " - " +num1+ " - " +num3);
			
		}else if (num3 <= num1 && num3 <= num2 && num2 <=num1) {
			//num3 � menor
			//num1 � maior
			//num3 < num1 < num2
			System.out.println(num1 + " - " +num2+ " - " +num3);
			
			scanner.close();
		}
		
	}
}
