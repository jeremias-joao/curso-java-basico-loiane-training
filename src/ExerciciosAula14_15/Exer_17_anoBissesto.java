package ExerciciosAula14_15;

import java.util.Scanner;
/**
 17. Fa�a um Programa que pe�a um n�mero correspondente a um
 determinado ano e em seguida informe se este ano � ou n�o bissexto.
 @author Jeremias
 *
 */
public class Exer_17_anoBissesto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o ano: ");
		int ano = scanner.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0 )) {
			System.out.println("� bissesto");
			
		} else {
			System.out.println("Nao � bissesto");
		}
		
		
		
		
		scanner.close();
	}

}
