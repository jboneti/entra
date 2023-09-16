package aula12;

public class atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. Dada a seguinte matriz, calcule:
		 * 
		 * 
		 * 
		 * 1 2 3 4
		 * 
		 * 5 6 7 8
		 * 
		 * 9 10 11 12
		 * 
		 * 13 14 15 16
		 * 
		 * a) A soma dos elementos de primeira coluna;
		 * 
		 * b) O produto dos elementos da primeira linha;
		 * 
		 * c) A soma de todos os elementos;
		 * 
		 * d) O produto da diagonal principal.
		 */

		int[][] matriz = { 
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 },
				};

		// a)
		int soma = 0;
		int produto = 1;
		int somaTotal = 0;
		int produtoDiagonal = 1;

		for (int linha = 0; linha < matriz.length; linha++) {
			soma = soma + matriz[linha][0];

		}
		// b)
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			produto = produto * matriz[0][coluna];

		}

		// c)
		// d)
		for (int linha = 0; linha < matriz.length; linha++) {
			produtoDiagonal = produtoDiagonal * matriz[linha][linha];

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somaTotal = somaTotal + matriz[linha][coluna];

			}
		}

		System.out.println(" A) Elementos de primeira coluna : " + soma);
		System.out.println(" B) Produto dos elementos da primeira linha : " + produto);
		System.out.println(" C) Soma de todos os elementos: " + somaTotal);
		System.out.println(" D) Produto da diagonal principal: " + produtoDiagonal);

	}
}
