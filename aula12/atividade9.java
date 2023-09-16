package aula12;

import java.util.Random;

public class atividade9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9. Crie uma matriz com 7 linhas e 8 colunas do tipo inteiro, para preencher a
		 * mesma utilize o Random de java.util.Random, posteriormente imprima esta
		 * matriz;
		 */
		Random generator = new Random();

		int[][] matriz = new int[7][8];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = generator.nextInt();

			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = generator.nextInt(100);
				System.out.print(matriz[linha][coluna] + ", ");

			}
			System.out.println();
		}
	}
}
