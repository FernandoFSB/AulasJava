package aulaexemplo;

/**
 *
 * @author nando
 */
/*
 * Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no 
 * mês. Calcule e mostre o total do seu salário no referido mês, 
 * sabendo-se que são descontados 11% para o Imposto de Renda, 
 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
○ salário bruto.
○ quanto pagou ao IPRF
○ quanto pagou ao INSS.
○ quanto pagou ao sindicato.
○ o salário líquido.
○ o valor descontado.
 */

import java.util.Scanner;


public class Imposto {


	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		double qtdHoras, iprf, inss, sindicato, salarioBruto, salarioLiquido, desconto;
		int horas;
		
		System.out.println("Quanto você ganha por hora? ");
		qtdHoras = leitor.nextDouble();
		System.out.println("Quantas horas você trabalha na semana? "); 
		horas = leitor.nextInt();
		
		salarioBruto = qtdHoras * horas;
		iprf = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		salarioLiquido = salarioBruto - iprf - inss - sindicato;
		desconto = iprf + inss + sindicato;
		
		System.out.println("O salario bruto é de R$"+ salarioBruto+", o Imposto de renda é de R$"+ iprf+", o INSS é de R$"+inss+", o sindicato é de R$"+sindicato+", o seu salário líquido é de R$"+salarioLiquido+", e o valor do desconto do em seu salário é de R$"+ desconto);
		

	}

}

