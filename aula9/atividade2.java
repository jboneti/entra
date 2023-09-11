package aula9;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie uma array de 5 elementos e no momento de imprimir, comece pelo último
		 * elemento até o primeiro elemento.
		 */
		Scanner entrada = new Scanner(System.in);

		int[] elementos = new int[5];

		
		elementos [0] = 1;
		elementos [0] = 2;
		elementos [0] = 3;
		elementos [0] = 4;
		elementos [0] = 5;
		
				
		System.out.println(elementos[4]);
		System.out.println(elementos[3]);
		System.out.println(elementos[2]);
		System.out.println(elementos[1]);
		System.out.println(elementos[0]);

		
		for(int i = 4; i >= 0; i --) {
			System.out.println(elementos[i]);
			
		}
	}

}
