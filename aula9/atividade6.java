package aula9;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um array de elementos e depois peça ao usuário para informar um valor,
		 * verifique se este valor está presente no array e printe o índice.
		 */
		Scanner entrada = new Scanner(System.in);

		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor");
			vetor[i] = entrada.nextInt();
		}
		System.out.println("Informe um valor para ver se esta presente");
		int variavelAuxiliar = entrada.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == variavelAuxiliar) {
				System.out.println("indice:" + i);
			}

		}

	}

}
