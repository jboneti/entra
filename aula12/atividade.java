package aula12;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa onde o usuário define quantas linhas e colunas deve ter uma
		 * matriz, e posteriormente imprima o total de elementos(posições) que está
		 * matriz tem
		 */

		Scanner entrada = new Scanner(System.in);

		// deve ter uma matriz

		

		// usuário define quantas linhas e colunas
		System.out.println("digite a quantidade de linhas");
		int linhas = entrada.nextInt();

		System.out.println("digite a quantidade de colunas");
		int colunas = entrada.nextInt();
		int[][] matriz = new int[linhas][colunas];
		int soma = 0;

		
		soma = matriz.length * matriz[0].length;
		
		System.out.println("total: " + soma);

	
		
	}



}





