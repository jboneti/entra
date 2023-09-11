package prova;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e
		 * depois calcule a média.
		 */

		Scanner entrada = new Scanner(System.in);

		// Entrada - usuário leia altura de 10 pessoas diferentes

		System.out.println("Insira a altura das 10 pessoas");
		double media;
		double primeiraPessoa = entrada.nextDouble();
		double segundaPessoa = entrada.nextDouble();
		double terPessoa = entrada.nextDouble();
		double quartaPessoa = entrada.nextDouble();
		double quintaPessoa = entrada.nextDouble();
		double sextaPessoa = entrada.nextDouble();
		double setimaPessoa = entrada.nextDouble();
		double oitavaPessoa = entrada.nextDouble();
		double nonaPessoa = entrada.nextDouble();
		double dezimaPessoa = entrada.nextDouble();

		// Processo - depois calcule a média.
		media = (primeiraPessoa + segundaPessoa + terPessoa + quartaPessoa + quintaPessoa + sextaPessoa + setimaPessoa
				+ oitavaPessoa + nonaPessoa + dezimaPessoa) / 10;

		// Saída
		
		System.out.println(" A média das 10 pessoas é: " + media);

	}

}
