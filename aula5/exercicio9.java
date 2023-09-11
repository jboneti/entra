package aula5;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		/*
		 * Escreva um algoritmo em que o usuário entra com um número. Depois ele escolhe
		 * a operação que vai ser feita com esse número Caso ele escolha a operação 1
		 * Modifique a variável do número entrado e some 10 ao número original Caso ele
		 * escolha a operação 2 Modifique a variável do número entrado e subtraia 10 do
		 * número original Caso ele escolha a operação 3 Modifique a variável do número
		 * entrado e multiplique 10 ao número original Caso ele escolha a operação 4
		 * Modifique a variável do número entrado e divida 10 do número original
		 */

		System.out.println("digite um numero");
		double numero = entrada.nextDouble();
		System.out.println("digite a operacao");
		int numeroOperacao = entrada.nextInt();

		double variavel = 0;
		double variavelAuxiliar = numero;

		switch (numeroOperacao) {
		case 1:
			variavel = variavelAuxiliar + 10;
			break;
		case 2:
			variavel = variavelAuxiliar - 10;
			break;
		case 3:
			variavel = variavelAuxiliar * 10;
			break;
		case 4:
			variavel = variavelAuxiliar / 10;
		default:
			System.out.println("Valor invalido");

			break;
		}
		System.out.println("Valor chegado" + variavel);
	}

}
