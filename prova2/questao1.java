package prova2;

import java.util.Arrays;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Questão 1) Crie um programa para encontrar o maior número que pode ser criado
		 * reordenando o vetor.
		 * 
		 * Por exemplo: {1, 2, 3, 0, 4, 6} Deverá ter a saída: 643210
		 * 
		 * // Proibido usar: Arrays.sort() // É o vetor não possui números negativos
		 
		*/
		Scanner entrada = new Scanner(System.in);
		
		int [] vetor = new int[6];
				
		for ( int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o valor no vetor: ");
			vetor[i] = entrada.nextInt();
		
		}
		String resultado = "";
		for (int i =0; i< vetor.length; i++) {
			int maiorValor = Integer.MIN_VALUE;
			int indiceMaior = 0;
			
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] > maiorValor) {
					maiorValor = vetor[j];
					indiceMaior = j;
				}
			}
			resultado += maiorValor + " ";
			vetor [indiceMaior] = -1 ;
		}
		System.out.println(resultado);
	}
}
