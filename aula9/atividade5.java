package aula9;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um array de 10 elementos e depois peça ao usuário para informar um
		 * índice, imprima o o valor que está no vetor conforme indice informado pelo
		 * usuario // Criar e adicionar valores ao vetor antes do for
		 */

		Scanner entrada = new Scanner(System.in);

		int[] vetor = {0,1,2,3,4,5,6,7,8,9};
	//	ao usuário para informar um índice
		
		System.out.println("Informe um indice");
		int indice = entrada.nextInt();
		
	//	imprima o o valor que está no vetor conforme indice
		System.out.println(vetor[indice]);
		

	}

}
