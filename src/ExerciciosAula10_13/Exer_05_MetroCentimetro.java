package ExerciciosAula10_13;

import java.util.Scanner;
/**
Fa�a que converte metros para centimetos

Para converter de metro para cent�metro basta multiplicar o valor 
em metros por cem. Por exemplo cinco metros equivalem a quinhentos 
cent�metros. Sempre ao se converter para cent�metro colocasse ap�s 
os n�meros as letras cm que representam a unidade.
5 x 100 = 500cm
*/
public class Exer_05_MetroCentimetro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite valor em metros: ");
		double valorEmMetros = scanner.nextDouble();
		
		// 1m = 100 cm
		double valorEmCentimetro = valorEmMetros * 100;
		
		System.out.println( valorEmMetros + " m � igual a " +valorEmCentimetro + " cm ");
		
		
		scanner.close();
		

	}

}
