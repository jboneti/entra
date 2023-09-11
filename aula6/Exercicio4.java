package aula6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crie um programa para ler 3 notas e mostrar a 

		 média delas.*/
		
		Scanner entrada = new Scanner(System.in);
		
		 double soma = 0;
			  double entd = 0;
			   for(int i = 0; i < 4; i++) {
		System.out.println("informe a nota");
			entd = entrada.nextDouble();
			soma += entd;
			 
			 double media = soma / 3;
			 
			 System.out.println("A média é " + media);
			  
			  
			 
		  }
	}

}
