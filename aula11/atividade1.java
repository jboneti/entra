package aula11;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos valores
		 * são par e quantos valores são impar e calcule a média dos valores
		 */
		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[1][10];

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		matriz[0][5] = 6;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 9;
		matriz[0][9] = 10;

		int soma = 0;
		int contPar = 0;
		int contImpar = 0;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			soma = soma + matriz[0][coluna];
			
			if ((matriz[0][coluna]) % 2 == 0) {
				contPar++;

			} else {
				contImpar++;

				
			}
			
		}
		System.out.println("pares: " +contPar);
		System.out.println("impares: " +contImpar);
		System.out.println("media: " + (soma / matriz [0].length));
	}
}
