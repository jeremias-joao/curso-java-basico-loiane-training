package com.loiane.cursojava.aula.aula15_SwitchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semane (1-7):");
		int diaSemana = scanner.nextInt();
		
		/*
		if (diaSemana == 1) {
			System.out.println("Domingo");
		}
		else if (diaSemana == 2) {
			System.out.println("Segunda");
		}
		else if (diaSemana == 3) {
			System.out.println("Ter�a");
		}
		else if (diaSemana == 4) {
			System.out.println("Quarta");
		}
		else if(diaSemana == 5) {
			System.out.println("Quinta");
		}
		else if(diaSemana == 6) {
			System.out.println("Sexta");
		}
		else if (diaSemana == 7) {
			System.out.println("S�bado");
		}
		else {
			System.out.println("Nao � um dia da semana v�lida");
		} */
		scanner.close();
		
		
		switch (diaSemana) {
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
		case 7: System.out.println("S�bado");
		break;
		default : System.out.println("Nao � um dia da semana v�lida");
		}
	}
}
