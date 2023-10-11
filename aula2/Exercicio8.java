package aula2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// entrada - dolar, reais, valor em reais
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor");
		double valorEmDolares = entrada.nextDouble();
		double dolar = 4.97;

		// processo

		double troca = valorEmDolares * dolar;

		// saida
		System.out.println("o total em reais é" + troca);

	}

}
