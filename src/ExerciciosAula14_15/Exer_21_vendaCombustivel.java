package ExerciciosAula14_15;

import java.util.Scanner;

/**
 21.Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustivel (codificado da seguinte forma: A-álcool, G-
gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.
 * @author Jeremias
 *
 */
public class Exer_21_vendaCombustivel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre a qtd de litros vendidos");
		double litros = scanner.nextDouble();
		
		
		System.out.println("Entre com o tipo de combustivel");
		String tipo = scanner.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		
		if(tipo.equalsIgnoreCase("a")) {
			
			if(litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			
			total = litros * precoAlc;
			
					
		} else if (tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			total = litros * precoGas;
		}
		
		totalDesconto = (total / 100 ) * percDesconto;
		
		double precoApagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago: "+precoApagar);
		
	
		
		scanner.close();
	}

}
