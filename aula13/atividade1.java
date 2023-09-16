package aula13;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		/*
		 * 1. O índice de massa corporal (IMC) é uma medida internacional usada para
		 * calcular se um pessoa está no peso ideal. O IMC é determinado pela divisão da
		 * massa do indivíduo pelo quadrado de sua altura, onde a massa está em
		 * quilogramas e a altura está em metros, de acordo com a fórmula:
		 * 
		 * IMC = Massa / Altura²
		 * 
		 * 
		 * 
		 * Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
		 * indivíduo, de acordo com a seguinte tabela:
		 * 
		 * 
		 * 
		 * < 18.5 Magreza
		 * 
		 * 18.5 – 24.9 Saudável
		 * 
		 * 25.0 – 29.9 Sobrepeso
		 * 
		 * 30.0 – 34.9 Obesidade Grau I
		 * 
		 * 35.0 – 39.9 Obesidade Grau II (severa)
		 * 
		 * > 40.0 Obesidade Grau III (morbida)
		 */

		double imc = 0;

		System.out.println("Informe sua peso");
		double peso = entrada.nextDouble();
		System.out.println("Informe seu altura");
		double altura = entrada.nextDouble();

		imc = peso / (altura * 2);

		if (imc <= 18.5) {
			System.out.println("Magreza");
		}if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Saudavél");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade Grau II");
		} else if (imc >= 40.0) {
			System.out.println("Obesidade Grau III");
		

		}

	}
}
