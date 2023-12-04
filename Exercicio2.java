package aula7;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Crie um programa que leia um número do teclado até que encontre um
		// número igual a zero. No final, mostre a soma dos números digitados.

		double soma = 0;
		System.out.println("Escreva um numero");
		double numero = scan.nextDouble();
		while(numero != 0) {
			soma = soma + numero;
			System.out.println("Escreva um numero");
			numero = scan.nextDouble();
		}
		
		System.out.println("O valor da soma é " + soma);
	}

}
