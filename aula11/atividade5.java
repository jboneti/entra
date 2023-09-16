package aula11;

public class atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * crie programas em java que crie e exiba as seguintes figuras abaixo
		 * utilizando matrizes
		 */
	//	a)  * * * * 
	//	    * * * * 
    //	    * * * *
	//		* * * * 
			
	
	
	//   c) *
    //      * *
    //	    * * *
	//      * * * *	
		
		
		int qntLinhas = 4;
		int qntColunas = 4;
		char[][] matriz = new char[qntLinhas][qntColunas];

		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
			 matriz[linha][coluna] = '*';
			}
		}
		
		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		// c
		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
			 if(coluna > linha) {
				 matriz[linha][coluna] = ' ';
			 } else {				 
				 matriz[linha][coluna] = '*';
			 }
			}
		}
		
		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}

	}
}
		
		
		
		
		
		
		
	
