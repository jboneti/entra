package aula2;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome :");
		String primeiroNome = entrada.nextLine();
		System.out.println("Digite o segundo nome:");
		String segundoNome = entrada.nextLine();
		
		if (primeiroNome.equals(segundoNome)) {
			System.out.println("nomes iguais");
		}
		if(!primeiroNome.equals(segundoNome)) {
	    System.out.println("Nomes diferentes");
		}
	}
}
	
		
	

	


