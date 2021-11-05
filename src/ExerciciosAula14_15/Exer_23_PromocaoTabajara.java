package ExerciciosAula14_15;
/**
 * 23. Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:
Até 5 Kg
Acima de 5 kg
0 File Duplo R$ 4,90 por kg
R$ 5,80 por kg
Alcatra R$ 5,90 por kg
R$ 6,80 por kg
o Picanha R$ 6,90 por kg
R$ 7,80 por kg
O
Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o total a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preço total, tipo de pagamento, valor do
desconto e valor a pagar.
 */
import java.util.Scanner;

public class Exer_23_PromocaoTabajara {
	
	public static void main(String [] args ) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre o tipo da carne:");
		System.out.println("1- File duplo");
		System.out.println("2- Alcatra");
		System.out.println("3- Picanha");
		
		int tipo = scanner.nextInt();
		
		System.out.print("Entre com a quantidade (kg):");
		double qtd = scanner.nextDouble();
		
		double precoKg = 0;
		
		if(tipo == 1) {
			
			System.out.println(qtd + "Kg - File Duplo");
			
			if(qtd < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
		} else if (tipo == 2) {
			
			System.out.println(qtd + "Kg - Alcatra");
			
			if(qtd < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}	
		}  else if (tipo == 3) {
			
			System.out.println(qtd + "Kg - Picanha");
			
			if(qtd < 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}	
		}
		
		double total = qtd * precoKg;
		System.out.println(qtd + "Kg * " +precoKg + " = " +total);
		
		System.out.println("Compra no cartao? digite 1 para sim:");
		int cartao = scanner.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) + 5;
			System.out.println("Desconto  de " +desconto);
			System.out.println("Valor a pagar " + (total - desconto));
		} else {
			System.out.println("Valor a pagar " +total );
			
		}
		scanner.close();
	}

}
