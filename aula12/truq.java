package aula12;

import java.util.Random;


public class truq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generador = new Random();
		
		int [] [] matrizR = new int [2][2];
		
		for (int linha = 0; linha < 2; linha ++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				matrizR[linha][coluna] = generador.nextInt(10);
			}
		}
				
		int[][] matriz = {
				{20, 50, 30},
				{100, 60,80}
		};
		
		

	}

}
