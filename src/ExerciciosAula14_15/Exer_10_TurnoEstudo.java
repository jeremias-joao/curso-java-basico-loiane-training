package ExerciciosAula14_15;

import java.util.Scanner;
/**
 *Faça um programa que pergunte em que turno 
 *voce estuda. Peça para digitar M- Matutino,
 *M- Matutino e N- Noturno. Imprima a mensagem
 *"Bom dia", "Boa Tarde", "Boa Noite" ou valor 
 *invalido conforme o caso.
 *@author Jeremias 
 */
public class Exer_10_TurnoEstudo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("M/m- Matuino");
		System.out.println("V/v- Vespertino");
		System.out.println("N/n- Noturno");
		System.out.print("Em que turno voce estuda: ");
		String turno = scanner.next();
		
		switch(turno) {
		case "m": 
		case "M": System.out.println("Bom dia ");
		break;
		case "v": 
		case "V": System.out.println("Boa Tarde");
		break;
		case "n": 
		case "N": System.out.println("Boa Noite");
		break;
		default: System.out.println("Valor Inválido");
		}
		
		scanner.close();
	}

}
