package aula16Metodo;

import java.util.Scanner;

public class atividade1 {

	/*
	 * Faça um programa em que o usuário entre com um número de 1 a 4 Com o número 1
	 * sendo verão, 2 sendo outono... Dependendo de o que o usuário informa, printe:
	 * 
	 * É verão E o tempo está quente
	 * 
	 * Ou
	 * 
	 * É inverno E está frio
	 */
	

	public static void estacao(int escolha) {
		
		switch (escolha) {

		case 1:
			System.out.println("é verão e está quente");
			break;
		case 2:
			System.out.println("é outuno e está morno");
		case 3:
			System.out.println("é primavera e está morno");
		case 4:
			System.out.println("é inverno e está frio");
		default:
			System.out.println("Valor invalido");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Escolha um alternativa");
		int escolha = entrada.nextInt();
				
		estacao(escolha);

	}
	

}
