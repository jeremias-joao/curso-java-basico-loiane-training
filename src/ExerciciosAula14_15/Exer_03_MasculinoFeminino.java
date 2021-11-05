package ExerciciosAula14_15;

import java.util.Scanner;
/**
 Faça um programa que verifique  se a letra 
 digitada é "F" ou "M". Conforme a letra escrever
 F- feminio, M- masculino, Sexo Inavlido.
 * @author Jeremias
 */
public class Exer_03_MasculinoFeminino {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Difite a letra (F-M): ");
		String letra = scanner.next();
		
		if (letra.equalsIgnoreCase("f")) {
				System.out.println("F- Feminino");	
		} else if(letra.equalsIgnoreCase("m")) {
				System.out.println("M- Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
		
		
		
		
		
		scanner.close();

	}

}
