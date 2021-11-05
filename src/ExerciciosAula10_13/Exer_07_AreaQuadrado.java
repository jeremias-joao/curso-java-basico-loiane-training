package ExerciciosAula10_13;

import java.util.Scanner;

/**
Faça um programa que calcule a raea de um quadrado, 
em seguida mostre o dobro desta area para usuario
*/

public class Exer_07_AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com o tamanho dola lado de quadrado: ");
		double lado = scanner.nextDouble();
		
		// area de quadrado é lado ao quadrado
		// area = lado * lado;
		
		double areaQuadrado = Math.pow(lado, 2);
		double dobroAreaQuadrado = areaQuadrado * 2;
		
		System.out.println("A area de Quadrado é: "+areaQuadrado);
		System.out.println("O dobro da area de Quadrado é: " +dobroAreaQuadrado);
		//System.out.println("O dobro da area de Quadrado é: " +(areaQuadrado *2));
		
		scanner.close();
		
	}

}
