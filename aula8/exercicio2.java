package aula8;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações, caso seja certo, de os parabéns e encerre o programa.
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu usuario");
		String usuario = entrada.next();
		System.out.println("Insira sua senha");
		String senha = entrada.next();
		
		
		while (usuario.equals(senha)) {
			System.out.println("entrada invalida");
			System.out.println("Informe seu usuario");
			usuario = entrada.next();
			
			System.out.println("Informe sua senha");
			senha = entrada.next();
		}
	
		
		System.out.println("Parabens, usuario criado");
		
		 
	}

}
