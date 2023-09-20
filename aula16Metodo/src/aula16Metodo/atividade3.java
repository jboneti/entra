package aula16Metodo;

import java.util.Scanner;

public class atividade3 {
// TODO Auto-generated method stub
		/*
		 * Faça um programa que some 4 números. Passando esses 4 números como parâmetros
		 * para um método
		 */
	
	
	public static void soma(int valorUm, int valorDois, int valorTres, int valorQuatro)
	{
		System.out.println("total dos valores: "  + ( valorUm + valorDois + valorTres + valorQuatro));
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Adicione 4 valores");
		int valorUm = entrada.nextInt();
		int valorDois = entrada.nextInt();
		int valorTres = entrada.nextInt();
		int valorQuatro = entrada.nextInt();
		
		
		soma(valorUm, valorDois, valorTres, valorQuatro);
	}

}
