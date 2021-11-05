import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		
		
		System.out.println("-------------------------");
		System.out.println("     CRIANÇA ESPERANÇA   ");
		System.out.println("-------------------------");
		System.out.println("Muito obrigado por ajudar");
		System.out.println("[1] para doar R$10");
		System.out.println("[2] para doar R$25");
		System.out.println("[3] para doar R$50");
		System.out.println("[4] para doar outros valores");
		System.out.println("[5] para cancelar ");
		
		System.out.println("Escolha o numero: ");
		valor = scanner.nextInt();
		
		
		switch (valor) {
		case 1:
			valor = 10;
		case 2:
			valor = 25;
		case 3:
			valor = 50;
		case 4:
			System.out.println("Qual é o valor da doação? R$");
		case 5:
			valor = 0;
		System.out.println("----------------------------");
		System.out.println(" SUA DOAÇÃO FOI DE R$" +valor);
		System.out.println(" MUITO OBRIGADO! ");
		
			scanner.close();
			
		}
	}

}
