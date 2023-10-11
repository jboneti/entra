package aula2;

import java.util.Scanner;

public class Exercício001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

			if (primeiroNumero == segundoNumero) {

				System.out.println("O primeironumero é igual segundoNumero");
			}
	}
}

