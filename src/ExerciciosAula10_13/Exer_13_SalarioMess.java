package ExerciciosAula10_13;
import java.util.Scanner;
public class Exer_13_SalarioMess {
/**
 Faça um programa  que pergunte quanto  voce ganha  por hora
  e o numero de horas trabalhados no mes. Calcule e mostre total do seu
  salario no referido mes, sabendo-se que sao descontados 11% paara o
  imposto de Renda, 8%, para INSS e 5% para o sindicato, faça um 
  programa que nos dê:
  	a)salario bruto;
  	b)quanto pagou a INSS,
  	c)quanto pagou ao sindicato,
  	d)o salario liquido,
  	e)calcule os descontos  e o salario liquido, conforme a tabela
  
 * @param args
 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o valor/hora:");
		double valorHora = scanner.nextDouble();
		
			System.out.println("Entre com o a quantidade de hora trabalhada no mes:");
			double horas = scanner.nextDouble();
		
			double salarioBruto = valorHora * horas;
			double inss = (salarioBruto / 100) * 8;
			double sindicato = (salarioBruto / 100) * 5;
			double impostoRenda = (salarioBruto / 100) * 11;
			double totalDesconto = inss + sindicato + impostoRenda;
			double salarioLiquido= salarioBruto - totalDesconto;
		
			System.out.println("O salario Bruto é de: "+salarioBruto);
			System.out.println("INSS: " +inss);
			System.out.println("Sindicato: " +sindicato);
			System.out.println("Imposto Renda: " +impostoRenda);
			System.out.println("Total descontos: "+totalDesconto);
			System.out.println("Salario Liquido: " +salarioLiquido);
		
			scanner.close();
	}

}
