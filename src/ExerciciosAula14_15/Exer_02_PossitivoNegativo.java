package ExerciciosAula14_15;

import java.util.Scanner;
/**
 Fa�a um programa que pe�a um valor e mostre 
 na tela se o valor � negativo ou possitivo
 * @author Jeremias
 */
public class Exer_02_PossitivoNegativo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double numero = scanner.nextDouble();
		
		if(numero >= 0) {
			System.out.println("Numero informado � positivo");
		} else {
			System.out.println("Numero informado � negativo");
		}
		
		scanner.close();

	}

}
