package ExerciciosAula14_15;

import java.util.Scanner;
/**
 * 12. Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
 *FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Liquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
• Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
O
o
Salário Bruto: (5.220)
(-) IR (58)
(-) INSS ( 108)
PGTS (118)
Total de descontos
Salário Liquido
: R$ 1100,00
• R$
55,00
• R$ 110,00
+ RS 121,00
: R$ 165,00
! RS 935,00 
 * @author Jeremias
 */
public class Exer_12_FolhaPagemento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora:");
		double valorHora = scanner.nextDouble();
		
			System.out.println("Entre com o a quantidade de hora trabalhada no mes:");
			double qtdhoras = scanner.nextDouble();
			
			double salarioBruto = valorHora * qtdhoras;
			
			int percentualIR = 0;
			
			if(salarioBruto <= 900) {
				percentualIR = 0;
			} else if(salarioBruto > 900 && salarioBruto <= 1500) {
				percentualIR = 5;
			} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
				percentualIR = 10;
			} else if(salarioBruto > 2500) {
				percentualIR = 20;
			}
			
			double ir = (salarioBruto / 100) * percentualIR;
			double inss = (salarioBruto / 100) * 10;
			double fgts = (salarioBruto / 100) * 11;
			double totalDescontos = ir + inss;
			double salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("Salario Bruto: (" + valorHora + " + " +qtdhoras + "): " + salarioBruto);
			System.out.println("(-) IR (" +percentualIR + "%):" + ir);
			System.out.println("(-) INSS (10%): " +inss);
			System.out.println("(-) FGTS (11%): " +fgts);
			System.out.println("Total de descontos: " +totalDescontos);
			System.out.println("Salario Liquido: " +salarioLiquido);
	
			scanner.close();

	}

}
