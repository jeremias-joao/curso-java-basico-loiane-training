package com.loiane.cursojava.aula.aula15_SwitchCase;

import java.util.Scanner;

public class testeSwitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("---------BEM VINDO A CRIAN�A ESPERAN�A----------");
		System.out.println("----OBRIGADO POR FAZER PARTE DESTA INICITIVA----");
		System.out.println("");
		System.out.println("1---------- R$ 100");
		System.out.println("2---------- R$ 250");
		System.out.println("3---------- R$ 400");
		System.out.println("4---------- R$ 1000");
		System.out.println("5---------- R$ Outro Valor");
		System.out.println("");
		System.out.println("Digite o numero para Doa��o:");
		

		int valorDoacao = scanner.nextInt();
		
		switch (valorDoacao) {
		case 1: System.out.println("SUA DOA��O FOI DE R$ 100");
		break;
		case 2: System.out.println("SUA DOA��O FOI DE R$ 250");
		break;
		case 3: System.out.println("SUA DOA��O FOI DE R$ 400");
		break;
		case 4: System.out.println("SUA DOA��O FOI DE  R$ 1000");
		break;
		case 5: System.out.println("Qual � o valor da doa��o:");
		 scanner.nextInt();
		 
		break;
		default: System.out.println("Numero para doa��o inv�lido!!!");
		}
		
		System.out.println("MUITO OBRIGADO!!!");
		
		
		
		
		
		
		
		
		scanner.close();
		

	}

}
