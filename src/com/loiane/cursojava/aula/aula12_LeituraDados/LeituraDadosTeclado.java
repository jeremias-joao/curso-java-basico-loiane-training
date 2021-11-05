package com.loiane.cursojava.aula.aula12_LeituraDados;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/**
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("O seu nome completo é: "+nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("O seu nome primeiro é: "+primeiroNome);
		
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " +idade);
		
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua idade é: " +altura);
		*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimaçao ");
		
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores");
		System.out.println("Primeiro nome: "+primeiroNome);
		System.out.println("Idade: " +idade);
		System.out.println("Quantidade de Filhos: " +qtdFilhos);
		System.out.println("Altura: "+altura);
		System.out.println("Tem bichinho de estimação? " +temPet);
		
		scan.close();
	}

}
