package ExerciciosAula10_13;

import java.util.Scanner;
/**
 Faça um programa que pergunte quanto voce ganha por 
 hora e o seu numero de horas trabalhadas no mes.
 Calcule e mostre o tatal do seu salariono referido mes
 
 * @author Jeremias
 */
public class Exer_08_SalarioMes {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora:");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Entre com o a quantidade de hora trabalhada no mes:");
		double horas = scanner.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salario é de: "+salario);
		
		scanner.close();

	}

}
