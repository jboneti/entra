package metodos;

public class Exercicio2 {
	
	public static void soma(int numUm, int numDois, 
					int numTres, int numQuatro) {
		int soma = numUm + numDois 
				+ numTres + numQuatro;
		
		System.out.println("A minha soma: " + soma);
	}

	public static void main(String[] args) {
		// Faça um programa que some 4 números.
		// Passando esses 4 números como parâmetros para 
		// um método
		int dado = 100;
		soma(20, 10, 50, dado);
		soma(20, 10, 50, 100);
	}

}
