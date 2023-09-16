package aula12;

import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7. Crie uma matriz 3x3 do tipo, onde o usuário irá preencher os valores
		 * utilizando o scanner, ao fim imprima a matriz
		 */
		Scanner entrada = new Scanner (System.in);
		char[][] matriz = new char[3][3];
		
		
		
		
		for(int linha = 0; linha < 3; linha ++) {
		for	(int coluna = 0; coluna < 3; coluna ++) {
			System.out.println("Insira na linha: [ " + linha + "] e coluna : [" + coluna +  "]");
			
			char aux = entrada.next().charAt(0);
			matriz[linha][coluna] = aux;
		}
		}

		for(int linha = 0; linha < 3; linha ++) {
		for	(int coluna = 0; coluna < 3; coluna ++) {
			System.out.println(matriz[linha][coluna ] + " , ");
		}
			System.out.println();
		}
	}

}
