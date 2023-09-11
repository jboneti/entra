package aula3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
		
		
		System.out.println("valor");
	int valor = entrada.nextInt();
	
  if(valor < 0) {
		System.out.println("o valor é negativo");
  }
		else if (valor > 0) {
			System.out.println("o valor é positivo");
		}
			else {
				System.out.println(" Seu valor é zero");
			
		}
	}
	
	
	

	}


