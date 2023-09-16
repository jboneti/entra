package aula13;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		/*
		 * 3. Descreva um algoritmo que leia vá lendo números inteiros até o usuário
		 * entrar com o número 0
		 * 
		 * a) Qual é o menor valor?
		 * 
		 * b) Qual é o maior valor?
		 * 
		 * c) Qual é a média dos valores?
		 */

		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		double media = 0;
		double valorUm = Integer.MIN_VALUE;
		double contador = 0;
		double parar = Integer.MIN_VALUE;

		while (parar != 0) {
			System.out.println("Insira um valor");
			valorUm = entrada.nextDouble();
			contador++;
			media = media + valorUm;
			
			if(valorUm > maior) {
				maior = valorUm;
			}
			if (valorUm < menor) {
				menor = valorUm;
				
			}
			System.out.println("Quer parar digite 0");
			parar = entrada.nextDouble();
			
	}
		
		System.out.println("Maior valor" + maior);
		System.out.println("menor valor" + menor);
		System.out.println("Média dos valores" + media / contador);
}
}


	
	