package aula6;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número
		 * lido, se o mesmo é par ou ímpar.
		 */
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 5 numeros inteiros");
		for (int i = 0; i < 5; i++) {
			int num = entrada.nextInt();
			if (num % 2 == 0) {
				System.out.println("o numero é par");
			} else {
				System.out.println(" o numero é impar");

			}

		}

		System.out.println("Fim");
	}
}
