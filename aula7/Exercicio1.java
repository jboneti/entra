package aula7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um algoritmo que leia um número do teclado até que encontre um número
		 * menor ou igual a 1.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o numero");
		int numero = scan.nextInt();

		while (numero > 1) {
			System.out.println("Insira o numero");
			numero = scan.nextInt();

		}
		System.out.println(numero);

	}
}
