package ExerciciosAula14_15;

import java.util.Scanner;

/**
 *18. Fa�a um Programa que pe�a um n�mero inteiro e determine se ele �
  par ou impar. Dica: utilize o operador m�dulo (resto da divis�o).
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
