package aula2;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		/*
		 * Dados dois numeros interios descreva um algoritmo para informar o maior valor
		 * entre eles
		 */

		Scanner algoritmo = new Scanner(System.in);
		System.out.println("Digite primeiro numero:");
		int primeiroNumero = algoritmo.nextInt();
		System.out.println("Digite segundo numero:");
		int segundoNumero = algoritmo.nextInt();

		if (primeiroNumero > segundoNumero) {

			System.out.println("O primeironumero é maior segundoNumero");

		}
		if (primeiroNumero < segundoNumero) {

			System.out.println("O primeironumero é menor segundoNumero");
		}
	}
}
