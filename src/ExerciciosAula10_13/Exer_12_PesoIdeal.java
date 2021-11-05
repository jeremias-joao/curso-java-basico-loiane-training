package ExerciciosAula10_13;

import java.util.Scanner;
/**
 tendo como dados de entrada a altura de uma pessoa
 contrua um algoritmo que calcule o peso ideal, usando
 a seguinte fórmula : (72.7*altura) -58
 * @author Jeremias
 */
public class Exer_12_PesoIdeal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com a altura: ");
		double altura = scanner.nextDouble();
		
		double pesoIdeal = (72.7 * altura) -58;
		
		System.out.println("O peso ideal é: "+pesoIdeal);
		
		scanner.close();

	}

}
