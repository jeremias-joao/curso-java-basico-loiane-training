package ExerciciosAula14_15;

import java.util.Scanner;

/**
 15. Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isosceles ou
escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isosceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;
 
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
				System.out.println("Triângulo Equilatero");
				
			} else if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
				System.out.println("Triângulo Escaleno");
				
			}  else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isociles");
			}
			
			
		} else {
			System.out.println("Nao forma um triângulo");
		}
		scanner.close();
	}
}
	



