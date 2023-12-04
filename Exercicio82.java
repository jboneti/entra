package aula5;

import java.util.Scanner;

// exercicio 8 2.0
public class Exercicio82 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça uma calculadora. O usuário entra com dois números e depois com a
		 * operaçao desejada. Caso o número da operação seja 1: some os dois números.
		 * Caso seja 2: subtraia os dois números. Caso seja 3: multiplique os dois
		 * números. Caso seja 4: divida os dois números.
		 */

		// objetivo - operaçao desejada

		// entrada - dois números - com a operaçao
		System.out.println("Informe o valor 1");
		double numUm = entrada.nextDouble();
		System.out.println("Informe o valor 2");
		double numDois = entrada.nextDouble();

		System.out.println("Informe a operação");
		int operacao = entrada.nextInt();

		// variavel auxiliar
		double variavelAuxiliar = 0;

		// processo
		switch (operacao) {
		// ==
		case 1:
			variavelAuxiliar = numUm + numDois;
			break;
		case 2:
			variavelAuxiliar = numUm - numDois;
			break;
		case 3:
			variavelAuxiliar = numUm * numDois;
			break;
		case 4:
			variavelAuxiliar = numUm / numDois;
			break;

		default:
			System.out.println("Valor invalido");
			break;
		}

		// saida
		System.out.println("O resultado é " + variavelAuxiliar);

	}

}
