package metodos;

import java.util.Scanner;

public class Exercicio4 {
	public static void comparacao(int numUm, int numDois) {
		
		if(numUm == numDois) {
			System.out.println("Iguais");
		} else if(numUm > numDois) {
			System.out.println("O primeiro valor é maior");
		} else {
			System.out.println("Segundo valor é maior");
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça um programa que receba 2 números do 
		 * usuário. Faça um método que descubra
		 * qual dos números é maior Se os dois números
		 *  forem iguais, informe: número
		 * iguais
		 */
		
		System.out.println("Informe o primeiro valor");
		int numUm = entrada.nextInt();
		System.out.println("Informe o segundo valor");
		int numDois = entrada.nextInt();
		comparacao(numUm, numDois);

	}

}
