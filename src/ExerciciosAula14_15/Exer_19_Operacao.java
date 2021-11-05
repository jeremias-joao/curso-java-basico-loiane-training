package ExerciciosAula14_15;

import java.util.Scanner;

/**
19.Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
· par ou ímpar;
a. positivo ou negativo;
 */
public class Exer_19_Operacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Informe a segunda numero: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Entre com a operação (+ - / *): ");
		String operacao = scanner.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
			case "+" : resultado  = num1 + num2; break;
			case "-" : resultado  = num1 - num2; break;
			case "/" : resultado  = num1 / num2; break;
			case "*" : resultado  = num1 * num2; break;
			default: 
				System.out.println("Operação Inválida");
				valida = false;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " +resultado);
			
			if (resultado >= 0) {
				System.out.println("resultado positivo");
			} else {
				System.out.println("resultado negativo");
			}
			if (resultado % 2 == 0) {
				System.out.println("resultado par");
			} else {
				System.out.println("resultado impar");
			}
		}
		
		scanner.close();
		
	}

}
