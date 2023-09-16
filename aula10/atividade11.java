package aula10;

import java.util.Arrays;

public class atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo que inverta a ordem de uma array (o primeiro elemento vai
		 * se tornar o último elemento)
		 */
		char[] vetor = { '1', '2', '3', '4' };

		int tamanho = vetor.length - 1;
		char temp = ' ';
		System.out.println(Arrays.toString(vetor));
		for (int i = 0; i < tamanho;) {
			temp = vetor[i];

			vetor[i] = vetor[tamanho];

			vetor[tamanho] = temp;

			tamanho--;
			i++;
		}
		System.out.println(Arrays.toString(vetor));

	}

}
