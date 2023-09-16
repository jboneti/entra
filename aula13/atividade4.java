package aula13;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * 4. Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 */

		float maior = Float.MIN_VALUE;
		float menor = Float.MAX_VALUE;

		float[] vetor = new float[5];

		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Infome um valor");
			vetor[i] = entrada.nextFloat();
			soma = soma = vetor[i];

			if (vetor[i] < menor) {
				menor = vetor[i];
			}
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}

		System.out.println("valor maior: " + maior);
		System.out.println("valor menor: " + menor);
		System.out.println("a media: " + (soma / vetor.length));

	}

}
