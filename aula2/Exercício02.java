package aula2;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dados dois numeros interios descreva um algoritmo para informar o maior valor
		 * entre eles
		 * 
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite primeiro numero:");
		int primeiroNumero = entrada.nextInt();
		System.out.println("Digite segundo numero:");
		int segundoNumero = entrada.nextInt();

		if (primeiroNumero % segundoNumero == 0) {

			System.out.println("O primeironumero é Múltiplo segundoNumero");

		} else {
			System.out.println("O primeironumero não é Múltiplo segundoNumero");

		}

	}

}
