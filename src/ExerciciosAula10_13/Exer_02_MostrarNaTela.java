package ExerciciosAula10_13;

import java.util.Scanner;

/**
Faça um programa que peça um numero e entao moste a
a mensagem na tela. O numero informado foi [numero]
*/

public class Exer_02_MostrarNaTela {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o numero inteiro: ");
		int numero = scanner.nextInt();
		
		System.out.println("O numero informado foi: "+numero);
		
		scanner.close();
	}

}
