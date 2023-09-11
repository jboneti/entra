package aula8;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Faça uma calculadora. O usuário entra com dois números e depois com a
		 * operação desejada.
		 * 
		 * Caso o número da operação seja 1: some os dois números.
		 * 
		 * Caso seja 2: subtraia os dois números.
		 * 
		 * Caso seja 3: multiplique os dois números.
		 * 
		 * Caso seja 4: divida os dois números.
		 * 
		 * 
		 * 
		 * Após realizada a operação, solicite ao usuário se deseja continuar realizando
		 * operações (sempre com dois novos valores) digite qualquer tecla e caso queira
		 * encerrar informe a letra ‘n’.
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja realizar uma operação?");
		char letra = entrada.next().charAt(0);

		int resposta = 'x';
		double numUm = Double.MIN_VALUE;
		double numDois = Double.MIN_VALUE;

		int operacao = Integer.MIN_VALUE;

		// variavel auxiliar
		double variavelAuxiliar = 0;

		// processo

		while (resposta != 'n') {
			System.out.println("Informe o valor 1");
			numUm = entrada.nextDouble();
			System.out.println("Informe o valor 2");
			numDois = entrada.nextDouble();

			System.out.println("Informe a operação");
			operacao = entrada.nextInt();

			switch (operacao) {
			// ==
			case 1:
				variavelAuxiliar = numUm + numDois;
				System.out.println(variavelAuxiliar);
				System.out.println("Deseja continuar operação");
				resposta = entrada.next().charAt(0);
				break;
			case 2:
				variavelAuxiliar = numUm - numDois;
				System.out.println(variavelAuxiliar);
				System.out.println("Deseja continuar operação");
				resposta = entrada.next().charAt(0);
				break;
			case 3:
				variavelAuxiliar = numUm * numDois;
				System.out.println(variavelAuxiliar);
				System.out.println("Deseja continuar operação");
				resposta = entrada.next().charAt(0);
				break;
			case 4:
				variavelAuxiliar = numUm / numDois;
				System.out.println(variavelAuxiliar);
				System.out.println("Deseja continuar operação");
				resposta = entrada.next().charAt(0);
				break;

			default:

				System.out.println("Valor invalido");
				break;
			}

		}
		System.out.println("programa encerrado");
	}
}
