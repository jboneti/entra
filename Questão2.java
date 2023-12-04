package prova;

import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Escreva um programa onde o usuário informa os dados dos lados de um
		// triangulo depois verifique e retorne se ele é isóscele, escaleno ou
		// equilátero.

		// entrada
		System.out.println("Informe os dados de um triangulo");
		int ladoUm = entrada.nextInt();
		int ladoDois = entrada.nextInt();
		int ladoTres = entrada.nextInt();

		// processo
		// equilátero - todos os lados iguais
		// isóceles - dois lados
		// escaleno - nenhum lado
		if (ladoUm == ladoDois && ladoDois == ladoTres) {
			System.out.println("Equilátero");
		} else if (ladoUm == ladoDois || ladoDois == ladoTres 
				|| ladoTres == ladoUm) { // entra nesse else if é porque
										// todos os lados não são iguais
			System.out.println("isóceles");
		} else {
			System.out.println("escaleno");
		}
	}

}
