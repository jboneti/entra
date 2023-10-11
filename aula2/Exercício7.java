package aula2;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// entrada - Leia o nome de um vendedor, salário fixo, total de vendas (em
		// dinheiro)

		System.out.println("Nome do Vendedor");
		String nome = entrada.nextLine();
		System.out.println("Salário fixo");
		double salarioFixo = entrada.nextDouble();
		System.out.println("Total de vendas");
		double totalVendas = entrada.nextDouble();

		// processo - ganha 15% de comissão sobre suas vendas efetuadas

		double comissao = 0.15 * totalVendas;
		System.out.println(" O funcionario " + nome + " e o salario total é" + comissao + salarioFixo);

	}

}
