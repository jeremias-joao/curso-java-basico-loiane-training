package ExerciciosAula14_15;

/**
 22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Morango
Maça
Até 5 Kg
R$ 2,50 por kg
R$ 1,80 por Kg
Acima de 5 Kg
R$ 2,20 por Kg
R$ 1,50 por kg
Se o cliente comprar mais de 8 kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em kg) de morangos e a quantidade (em kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.
 */
import java.util.Scanner;

public class Exer_22_vendaFrutas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre a qtd de (kg) de Morango:");
		double qtdMorango = scanner.nextDouble();

		
		System.out.print("Entre a qtd de (kg) de maça:");
		double qtdMaca = scanner.nextDouble();
		
		double precoKgMorango = 0;
		
		if (qtdMorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.5;
		}
		
		double precoKgMaca = 0;
		if (qtdMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca  = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		
		
		double precoParcial = precoKgMaca + precoKgMorango;
		double precoTotal = precoParcial;
		
		if (qtdMaca + qtdMorango > 8 || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100)) * 100;		
		}
		
		System.out.println("Preço total = " +precoTotal);
		System.out.println("teste simples1 = " + precoTotalMaca);
		System.out.println("teste simples2 = " + precoTotalMorango);
		

		scanner.close();
	}

}
