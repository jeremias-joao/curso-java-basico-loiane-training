package ExerciciosAula14_15;

import java.util.Scanner;

/**
19.Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao
usu�rio qual opera��o ele deseja realizar. O resultado da opera��o
deve ser acompanhado de uma frase que diga se o n�mero �:
� par ou �mpar;
a. positivo ou negativo;
 */
public class Exer_19_Operacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Informe a segunda numero: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Entre com a opera��o (+ - / *): ");
		String operacao = scanner.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
			case "+" : resultado  = num1 + num2; break;
			case "-" : resultado  = num1 - num2; break;
			case "/" : resultado  = num1 / num2; break;
			case "*" : resultado  = num1 * num2; break;
			default: 
				System.out.println("Opera��o Inv�lida");
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
