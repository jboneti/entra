package aula7;

import java.lang.invoke.SwitchPoint;
import java.text.BreakIterator;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que receba um nome de uma fruta como entrada.
		 * 
		 * Faça vários cases para as frutas que você conhece.
		 * 
		 * Por exemplo:
		 * 
		 * Case "banana": Eu gosto dessa fruta
		 * 
		 * Case "pera": Eu não gosto dessa fruta
		 * 
		 * Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa
		 * fruta e encerre o programa
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe uma fruta");
		String fruta = entrada.next();
		while (fruta.equals("banana") || fruta.equals("pera") || (fruta.equals("uva") || fruta.equals("morango"))) {

			switch (fruta) {
			case "banana":
				System.out.println("Eu gosto dessa frurta");
				break;
			case "pera":
				System.out.println("Eu gosto dessa frurta");
				break;
			case "uva":
				System.out.println("Eu gosto dessa frurta");
				break;
			case "morango":
				System.out.println("Eu gosto dessa frurta");
				break;

			default:

				break;
			}
			System.out.println("informe uma fruta");
			fruta = entrada.next();
		}
		System.out.println("Eu não conheço essa fruta");

	}
}
