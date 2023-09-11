package aula6;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. Faça um programa, utilizando for, em que o usuário tenha a opção de inserir dois valores e ocorra a subtração deles, deve ocorrer por 3 vezes.*/
		
		Scanner entrada = new Scanner(System.in);
		
		for  (int i = 0; i < 3; i++) {
		
			System.out.println("Insira dois valores");
			double valorUm = entrada.nextDouble();
			double valorDois = entrada.nextDouble();
			
			double menos = valorUm - valorDois;
			
			System.out.println(menos);
			
			
			
			
			
			
	}

}
}
