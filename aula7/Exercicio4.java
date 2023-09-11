package aula7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
		 * com o número 0
		 * 
		 * Calcule a média de altura das mesmas.
		 */

		
		Scanner scan = new Scanner(System.in);
	
		
			
		System.out.println("Insira a altura");
		double altura = scan.nextDouble();
		
		
		double soma = 0;
		int quantasPessoas = 0;
		while(altura != 0) {
		soma = soma + altura;
		quantasPessoas++;
		
		
			System.out.println("media da altura");
			altura = scan.nextDouble();
		}
		double media = soma / quantasPessoas;
		
		System.out.println("O valor da soma é " + media);
	
		
	}

}
