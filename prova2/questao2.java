package prova2;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Questão 2) Crie um programa Java para encontrar a maior sequência de números
		 * seguidos em um vetor. Por exemplo, o vetor {6, 0, 1, 5, 4, 3, 4, 5, 6, 1, 6}
		 * tem a maior sequência sendo {3, 4, 5, 6}. Exiba essa sequência. Peça para o
		 * usuário inserir os valores do vetor.
		 */
		Scanner entrada = new Scanner(System.in);

		int[] vetor = new int[8];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o valor no vetor: ");
			vetor[i] = entrada.nextInt();

		}

		int possivelInicio = 0;
		int inicioSequencia = 0;
		int tamanhoSequencia = 1;
		int tamanhoFinal = 1;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] - 1 == vetor[i - 1]) {
				tamanhoSequencia++;
			} else {
				tamanhoSequencia = 1;
				possivelInicio = i;
			}
			if (tamanhoSequencia > tamanhoFinal) {
				tamanhoFinal = tamanhoSequencia;
				inicioSequencia = possivelInicio;
			}

		}

		for (int i = 0; i < tamanhoFinal; i++) {
			System.out.println(vetor[inicioSequencia + i]);
		}
	}
}
