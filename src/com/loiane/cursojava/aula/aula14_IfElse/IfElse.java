package com.loiane.cursojava.aula.aula14_IfElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Entre com sua idade:");
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade!!!");
		} else {
			System.out.println("Não é maior de idade!!!");
		}
		*/
		
		// barato <=10
		// 10 < valor < 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		// >= 17 muito carro
		
		System.out.println("Entre com o preço do item:");
		double valor = scanner.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Esta barato pode comprar!!!");
		} else if (valor < 10 && valor < 10 ) {
			System.out.println("Voçe pode pedir um desconto!!!");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais!!!");
		} else { // valor >= 17
			System.out.println("Esta muito carro!!!");
		}
		
		
		scanner.close();
	}

}
