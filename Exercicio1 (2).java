package aual9;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// idades
		int[] euQueEscolhoONome = new int[4];

		int varivale = 18; // linha 10 e linha 11 iguais
		euQueEscolhoONome[0] = 18;
		euQueEscolhoONome[1] = 20;
		euQueEscolhoONome[2] = 30;
		euQueEscolhoONome[3] = 40;

		System.out.println(euQueEscolhoONome);
		System.out.println(euQueEscolhoONome[0]);
		System.out.println(euQueEscolhoONome[3]);

		int soma = euQueEscolhoONome[0] + euQueEscolhoONome[1] + euQueEscolhoONome[2] + euQueEscolhoONome[3];

		System.out.println("Media: " + (soma / 4));

		for (int i = 0; i < 4; i++) {

			System.out.println(euQueEscolhoONome[i]);
		}

		// criar vetor de String - tamanho 3 - nome de pessoas próximas
		String[] nomes = new String[3];

		nomes[0] = "Maria";
		nomes[1] = "Fred";
		nomes[2] = "Bruno";
		
		// imprimir valores do vetor
		for(int i = 0; i < 3; i++) {
			System.out.println(nomes[i]);
		}
		
		//int[] exemplo = new int[3];
		//for (int i = 0; i < 3; i++) {
		//	exemplo[i] = entrada.nextInt();
		//}
		
		// primeiro um for para armazenar os valores
		
		String[] alunos = new String[21];
		for (int i = 0; i < 21; i++) {
		
			System.out.println("Informe o nome");	
			alunos[i] = entrada.next();
		}
		
		// depois outro for para imprimir os valores
		for(int i = 0; i < 21; i++) {
			System.out.println(alunos[i]);
		}
		
		
		
		

	}

}
