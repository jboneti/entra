package aula3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
 /*
  * Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. 
  * Imprima a mensagem “Bom dia!” ou “Boa Noite” ou “Valor inválido”, conforme o caso.
  *
  */
		System.out.println("Infomre o turno que você escuta");
		System.out.println("Digite  M-matutino");
		System.out.println("Digite  V-vespertino");
		System.out.println("Digite  N-noturno");
		
		
		String turno = entrada.next();
		
		if (turno.equalsIgnoreCase (" M ")) {
		System.out.println("Bom dia");
		} else if (turno.equalsIgnoreCase (" V ")) {
		System.out.println("Boa tarde");
		} else if (turno.equalsIgnoreCase (" N ")) {
		System.out.println("Boa noite");
		}
		else {
			System.out.println("Valor invalido");
		}
		}
	}


