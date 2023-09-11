package aula9;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um algoritmo em que quem preenche os valores do vetor é o usuário, por
		 * fim printe o vetor (vetor de 5 posições)
		 */

		Scanner entrada = new Scanner(System.in);
		
		
		int tamanhoDoVetor = 5;
		String[] valores = new String [tamanhoDoVetor];
		
		System.out.println("Tamanho do meu vetor:" + valores.length);
		for(int i = 0; i < valores.length; i ++) {
			valores[i] = entrada.next();
		}
		for(int i = (valores.length - 1); i >= 0; i ++) {
		System.out.println(valores[i]);
	}
	}
}



