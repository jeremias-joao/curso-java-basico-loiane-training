package ExerciciosAula14_15;

import java.util.Scanner;

/**
13. Fa�a um Programa que leia um n�mero e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inv�lido.
* @author Jeremias
*/
public class Exer_13_diaSemena {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o numero: ");
		int numero = scanner.nextInt();
		
		switch(numero) {
		case 1: System.out.println("Domingo"); 
		break;
		case 2: System.out.println("Segunda");
		break;
		case 3: System.out.println("Ter�a");
		break;
		case 4: System.out.println("Quarta");
		break;
		case 5: System.out.println("Quinta");
		break;
		case 6: System.out.println("Sexta");
		break;
		case 7: System.out.println("Sabado");
		break;
		default: System.out.println("N�o � um dia da semana v�lido");
		}
		
		
		if (numero == 1) {
			System.out.println("Domingo");
		} else if (numero == 2) {
			System.out.println("Segunda");
		} else if (numero == 3) {
			System.out.println("Ter�a");
		} else if (numero == 4) {
			System.out.println("Quarta");
		} else if (numero == 5) {
			System.out.println("Quinta");
		} else if (numero == 6) {
			System.out.println("Sexta");
		} else if (numero == 7) {
			System.out.println("Sabado");
		} else {
			System.out.println("N�o � um dia da semana v�lido");
		}
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
