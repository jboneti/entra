package aula9;

import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e
		 * por fim printe o vetor.
		 */
		Scanner entrada = new Scanner(System.in);
		
		//coloque o número
		int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("informe um indice");
		int indice = entrada.nextInt();
		
		vetor[indice] = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[indice]);
		}
		
	//	índice que o usuário escolheu e por fim printe o vetor
	
	}

}
