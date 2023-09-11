package aula6;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem) e faça
		 * dois contador que verifique quantas mulheres e homens são
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe 4 valores, sendo m(muolher) e h(homem)");
		String valorUm = entrada.next();
		String valorDois = entrada.next();
		String valorTres = entrada.next();
		String valorQuatro = entrada.next();

		int contadorMulheres = 0;
		int contadorHomem = 0;

		for (int i = 0; i < 4; i++) {
			String valor = entrada.next();
			if (valor.equals("m")) {
				contadorMulheres++;

			} else {
				contadorHomem++;
			}

		}

	}
}