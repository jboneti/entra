package aula15;

import java.util.Scanner;

public class metado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Jonathan";
		printNome(nome);
		media();
		
	}
	public static void printNome(String nome) {
		
		
		System.out.println("olá, meu primeiro nome é: " + nome);
		System.out.println("Meu sobrenome é Boneti");
	}
		
		// fazer um calculo de media e printar na tela
	
	public static void media() {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um valor");
		double valorUm = entrada.nextDouble();
		System.out.println("Insira um valor 2");
		double valorDois = entrada.nextDouble();
		
		
		double soma = 0;
		soma = valorUm + valorDois;
		
		System.out.println("Soma igual: " + soma / 2);
	}

}
