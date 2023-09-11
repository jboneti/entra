package aula3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Faça um programa que recebe a nota do aluno e retorna: 
A mensagem “Aprovado”, se a média alcançada for maior ou igual a 
sete; A mensagem “Aprovado com Distinção”, se a média for igual a dez; 
A mensagem “Reprovado” se a média for menor de do que sete;
*/
		Scanner entrada = new Scanner(System.in);
		
	System.out.println(" Informe a nota");
     double nota = entrada.nextDouble();
     
     // processo
     
     if (nota > 10) {
    	 System.out.println("erro");
     }
    	 else if(nota == 10) {
    	 System.out.println("Aprovado com Distincao");
    	 
 
     }
     else if (nota >= 7) {
    	 System.out.println("Aprovado");    
     
     } 
     else {
    	 System.out.println("Reprovado");
     }
	}
}
     
    	 

     
     



