package aula9;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 */

		Scanner entrada = new Scanner(System.in);

		double menor = Double.MAX_VALUE;
		double maior = Double.MAX_VALUE;

		double[] vetor = new double[5];

		double soma = 0;
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("Informe um valor");
			vetor[indice] = entrada.nextDouble();
			soma = soma + vetor[indice];
			if (vetor[indice] < menor) {
				menor = vetor[indice];
			}
			if (vetor[indice] > maior) {
				maior = vetor[indice];

			}
		}
		System.out.println("valor maior:" + maior);
		System.out.println("valor menor" + menor);
		System.out.println("a media" + (soma/vetor.length));
	}
}
