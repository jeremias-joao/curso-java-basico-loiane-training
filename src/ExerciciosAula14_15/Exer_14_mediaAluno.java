package ExerciciosAula14_15;

import java.util.Scanner;
/**
 * 14. Fa�a um programa que l� as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua m�dia. A
atribui��o de conceitos obedece � tabela abaixo:
M�dia de Aproveitamento Conceito

Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a m�dia, o conceito
correspondente e a mensagem �APROVADO" se o conceito for
A, B ou C ou "REPROVADO" se o conceito for Dou E.
 @author Jeremias
 *
 */
public class Exer_14_mediaAluno {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		
		if(media >= 9 && media <= 10) {
			aproveitamento = "A";
		} else if(media >= 7.5 && media < 9) {
			aproveitamento = "B";
		} else if(media >= 6 && media < 7.5) {
			aproveitamento = "C";
		} else if(media >= 4 && media < 6) {
			aproveitamento = "D";
		} else if(media >= 0 && media < 4) {
			aproveitamento = "E";
		}
		
		
		System.out.println("Nota 1: " +nota1);
		System.out.println("Nota 2: " +nota2);
		System.out.println("M�dia: " +media);
		System.out.println("Conceito: " +aproveitamento);
		
		switch(aproveitamento) {
		case "A":
		case "B":
		case "C": System.out.println("Aprovado"); break;
		case "D":
		case "E": System.out.println("Reprovado"); break;
		}
		
		scanner.close();
	}

}
