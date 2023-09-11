package aula3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		/* Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”.
		 *  Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.
		 */
		
		System.out.println(" Digite F para feminino e M para masculino");
		String dado = entrada.next();
		
		if (dado.equalsIgnoreCase("F")){
		System.out.println("Feminino");
		}
		else if (dado.equalsIgnoreCase(" M ")){
		System.out.println("Masculino");
		}
		else {
			System.out.println("Sexo inválido");
		}
		
	}

}
