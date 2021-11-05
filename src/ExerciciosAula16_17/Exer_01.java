package ExerciciosAula16_17;

import java.util.Scanner;

public class Exer_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com a nota:");
			
			double nota = scanner.nextDouble();
			
			if(nota >=0 && nota <= 10){
				notaValida = true;
				System.out.println("Voçe digitou a nota: " +nota);
			} else {
				System.out.println("Nota Invalida, digite novamnente!!!");
				notaValida = false;
			}
		} while (!notaValida);	
		
		scanner.close();
	}

	
}
