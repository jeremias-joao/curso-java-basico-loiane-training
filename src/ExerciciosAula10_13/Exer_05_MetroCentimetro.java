package ExerciciosAula10_13;

import java.util.Scanner;
/**
Faça que converte metros para centimetos

Para converter de metro para centímetro basta multiplicar o valor 
em metros por cem. Por exemplo cinco metros equivalem a quinhentos 
centímetros. Sempre ao se converter para centímetro colocasse após 
os números as letras cm que representam a unidade.
5 x 100 = 500cm
*/
public class Exer_05_MetroCentimetro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite valor em metros: ");
		double valorEmMetros = scanner.nextDouble();
		
		// 1m = 100 cm
		double valorEmCentimetro = valorEmMetros * 100;
		
		System.out.println( valorEmMetros + " m é igual a " +valorEmCentimetro + " cm ");
		
		
		scanner.close();
		

	}

}
