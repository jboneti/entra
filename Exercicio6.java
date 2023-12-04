package aula7;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Escreva um programa onde caso o usuário digite a letra 's' peça para informar
		// um número e caso digite 'n' encerre o programa e por fim
		// a) escreva o menor valor
		// b) escreva o maior valor
		
		// entrada
		System.out.println("Informe uma opção");
		char opcao = entrada.next().charAt(0);
		// número que o usuario digitará dentro do laço de repetição
		int numero = 0;
		// variaveis auxiliares
		// pega o maior valor para uma variavel do tipo inteiro
		int menor = Integer.MAX_VALUE; // variavel auxiliar - valor
		// pega o menor valor para uma variavel do tipo inteiro
		int maior = Integer.MIN_VALUE;
		// debug - utilizamos para analisar o código
		// System.out.println(menor);
		// debug
		// System.out.println(maior);
		
		while(opcao == 's') {
			System.out.println("Informe um número");
			numero = entrada.nextInt();
			// processo - comparando valor do usuario
			if(numero < menor) {
				menor = numero;
			}
			// debug
			// System.out.println("menor temp " + menor);
			if(numero > maior) {
				maior = numero;
			}
			// não entrar em loop
			// opcao = 'n';
			System.out.println("Informe uma opção");
			opcao = entrada.next().charAt(0);
			
			// melhor - predinha no código
			// utilizamos para caso o valor insira um valor inválido 
			// e queremos valores válidos ('s') e ('n')
			while(opcao != 's' && opcao != 'n') { // só sai desse while caso seja 
													// 's' ou 'n' 
				System.out.println("Valor inválido");
				System.out.println("Informe de novo");
				opcao = entrada.next().charAt(0);
			}
			
		}
		// saida
		System.out.println("Menor " + menor);
		System.out.println("Maior " + maior);
		
		
	}

}
