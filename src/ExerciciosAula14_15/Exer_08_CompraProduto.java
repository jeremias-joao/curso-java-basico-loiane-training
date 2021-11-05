package ExerciciosAula14_15;

import java.util.Scanner;

/*
 Faça um programa que pergunte o preco
 de tres produtos e informe qual produto voce 
 devve comprar sabendoque a decisao é smepre 
 pelo mais barato deles.
 */
public class Exer_08_CompraProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com primeiro preço: ");
		double preco1 = scanner.nextDouble();
		System.out.print("Entre com segundo preço: ");
		double preco2 = scanner.nextDouble();
		System.out.print("Entre com terceiro preço: ");
		double preco3 = scanner.nextDouble();
		
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1, é o mais barato");
			
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2, é o mais barato");
			
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("Compre o produto 3, é o mais barato");
		}
		scanner.close();
	}

}
