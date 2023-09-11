package aula6;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma
		 * dos números ímpares entre 1 e 1000.
		 */

		Scanner entrada = new Scanner(System.in);

		 int somaPar = 0;
		 int somaImpar = 0;
		 
		    for(int i = 0; i <= 1000; i++) {
		       
		        if (i % 2 == 0) {
		        	somaPar += i;
		        }	else {
		        	somaImpar += i;	
		        }
		    }
		        
		      
		    	System.out.println(" seu numero é impar" + somaPar);
		    	System.out.println(" seu numero é par" + somaImpar);
		}
	
			
		

	}

