package aula9;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[3];

		System.out.println("Informe 3 notas");
		notas[0] = entrada.nextDouble();
		notas[1] = entrada.nextDouble();
		notas[2] = entrada.nextDouble();

		double soma = notas[0] + notas[1] + notas[2];
		double media = soma / 3;
		System.out.println("Média: " + media);
	}

}
