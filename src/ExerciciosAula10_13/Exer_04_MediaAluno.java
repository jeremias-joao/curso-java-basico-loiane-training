package ExerciciosAula10_13;

import java.util.Scanner;

/**
Fa�a um programa que pe�a as 4 notas bimestrais
e mostre a media
*/

public class Exer_04_MediaAluno {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Informe a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		System.out.print("Informe a quarta nota: ");
		double nota4 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4 ) / 4;
		
		System.out.println("A media � : "+media);
		
		scanner.close();
	}

}
