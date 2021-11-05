package ExerciciosAula14_15;

import java.util.Scanner;

public class Exer_05_MediaAluno {
	
/*
 Faça um programa para a leitura de duas
 notas de parcias d eumm aluno.
 O programa de calcular a media alcançada  por aluno
 e apresentar consoante;
  Aprovado se a media  for maior ou igual a sete;
  Reprovado se a media for menor que sete;
  Aprovado com Distinção se a media for igual a dez
  
 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		
		if (media == 10) {
			System.out.println("Aprovado com distinção");	
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}  
		scanner.close();
	}

}
