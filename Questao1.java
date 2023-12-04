package prova;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		// Escreva um programa onde o usuário informa um valor e a opção desejada do que
		// deve ser
		// feito com o valor, sendo as opções 1-converter de dólar para real e
		// 2-converter de real para dólar,
		// qualquer outra opção é considerada entrada inválida.
		
		double dolar = 4.97;
		// variavel auxiliar de resposta
		double resposta = 0;
		// entrada -  informa um valor
		System.out.println("Informe um valor");
		double valor = entrada.nextDouble();
		
		System.out.println("Escolha uma opção");
		int opcao = entrada.nextInt();
		
		
		// 1-converter de dólar para real e 2-converter 
		// processo
		if(opcao == 1) {
			// 1-converter de dólar para real
			resposta = valor * dolar;
		}else if(opcao == 2) {
			resposta = valor / dolar;
		} else {
			// 2-converter de real para dólar
			System.out.println("Opção inválida");
		}
		
		// saida
		System.out.println("O valor é: " + resposta);

	}

}
