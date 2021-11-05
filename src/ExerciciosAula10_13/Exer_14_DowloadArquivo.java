package ExerciciosAula10_13;

import java.util.Scanner;

public class Exer_14_DowloadArquivo {
/**
 Faça um programa que peça o tamanho de um arquivo para 
 download (em MB),  e a velocidade de um link de internet
 em (Mbps), calcule e informe o tempo aproximado de download
  do arquivo usando este link em minutos
 * @param args
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho de arquivo:");
		double tamArquivo = scanner.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velInternet = scanner.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("O tempo de download: "+tempo);
		
		scanner.close();
	}

}
