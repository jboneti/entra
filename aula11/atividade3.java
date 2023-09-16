package aula11;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores.
		 * Posteriormente verifique a média e imprima somente os valores que estão acima
		 * dela
		 */

		int[][] matriz = new int[5][1];
		
		System.out.println("matriz.length: " + matriz.length); // referente a quantidade de linhas
		System.out.println("matriz[0].length: " + matriz[0].length); // referente a quantidade de colunas

		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[2][0] = 3;
		matriz[3][0] = 4;
		matriz[4][0] = 5;

		int soma = 0;
		
		for (int linha = 0; linha < 5; linha++) {
			

			soma = soma + matriz[linha][0];
			
		}
		int media = soma /5 ; // 5 quantidade total de elementos exemplo 5*1 ou 3*3 = 9
		
		System.out.println(soma);
		System.out.println("media" + media);
		
		for (int linha = 0; linha < 5; linha++) {
			if (matriz[linha] [0] > media) {
				System.out.println(matriz[linha][0]);
			}
		}
	
	}
}
