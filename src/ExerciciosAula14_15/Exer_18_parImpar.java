package ExerciciosAula14_15;

import java.util.Scanner;

/**
 *18. Faça um Programa que peça um número inteiro e determine se ele é
  par ou impar. Dica: utilize o operador módulo (resto da divisão).
  @author Jeremias
 */
public class Exer_18_parImpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o numero: ");
		int num = scanner.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("Numero Par");
			
		} else {
			System.out.println("Numero Impar");
		}
		scanner.close();
	}
}
