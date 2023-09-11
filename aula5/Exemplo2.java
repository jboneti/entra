package aula5;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				/*
				 * Faça uma calculadora. O usuário entra com dois números e depois com a
				 * operaçao desejada. Caso o número da operação seja 1: some os dois números.
				 * Caso seja 2: subtraia os dois números. Caso seja 3: multiplique os dois
				 * números. Caso seja 4: divida os dois números.
				 */
		        Scanner entrada = new Scanner(System.in);
		        
		        // entrada
		        
		        System.out.println("Insira o primeiro numero");
		        double valorUm = entrada.nextDouble();
		        System.out.println("Insira o segundo numero");
		        double valorDois = entrada.nextDouble();
		        
		        int operacao = entrada.nextInt();
		        
		        double variavelAuxiliar = 0;
		        
		        switch (operacao) {
				case 1:
					variavelAuxiliar = valorUm + valorDois;
					break;
				case 2: 
					variavelAuxiliar = valorUm - valorDois;
					break;
				case 3: 
					variavelAuxiliar = valorUm * valorDois;
					break;
				case 4: 
					variavelAuxiliar = valorUm / valorDois;
					
				default:
					System.out.println("Valor invalido");
					break;
				}
	}

}
