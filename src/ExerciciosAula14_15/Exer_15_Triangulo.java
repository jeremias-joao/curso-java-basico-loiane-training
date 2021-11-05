package ExerciciosAula14_15;

import java.util.Scanner;

/**
 15. Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa
dever� informar se os valores podem ser um tri�ngulo. Indique, caso
os lados formem um tri�ngulo, se o mesmo �: equil�tero, isosceles ou
escaleno.
Dicas:
Tr�s lados formam um tri�ngulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Tri�ngulo Equil�tero: tr�s lados iguais;
o Tri�ngulo Isosceles: quaisquer dois lados iguais;
o Tri�ngulo Escaleno: tr�s lados diferentes;
 
 * @author Jeremias
 */
public class Exer_15_Triangulo {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Entre com o lado 1:");	
		int lado1 = scanner.nextInt();	
		
		System.out.println("Entre com o lado 2:");	
		int lado2 = scanner.nextInt();
		
		System.out.println("Entre com o lado 3:");	
		int lado3 = scanner.nextInt();	
		
		if (((lado1 + lado2 > lado3)) || 
				((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Tri�ngulo Equilatero");
				
			} else if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
				System.out.println("Tri�ngulo Escaleno");
				
			}  else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Tri�ngulo Isociles");
			}
			
			
		} else {
			System.out.println("Nao forma um tri�ngulo");
		}
		scanner.close();
	}
}
	



