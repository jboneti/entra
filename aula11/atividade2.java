package aula11;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos valores
		 * são par e quantos valores são impar e calcule a média dos valores. Agora
		 * criem uma segunda linha e novamente somem todas as colunas, por fim somem os
		 * valores da linho 0 e da linha 1
		 */

		int[][] matriz = new int[2][10];

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

		matriz[1][0] = 1;
		matriz[1][1] = 2;
		matriz[1][2] = 3;
		matriz[1][3] = 4;
		matriz[1][4] = 5;
		matriz[1][5] = 6;
		matriz[1][6] = 7;
		matriz[1][7] = 8;
		matriz[1][8] = 9;
		matriz[1][9] = 10;

		int soma = 0;
		int soma2 = 0;
		int total = 0;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println(matriz[0][coluna]);

			soma = soma + matriz[0][coluna];
			
			
			soma2 = soma2 + matriz[1][coluna];
			total = soma2 + soma;
		
		}
		System.out.println("soma:" + soma);
		System.out.println("soma2:" + soma2);
		System.out.println("Total: " + total);
		
	}
	
	
}
