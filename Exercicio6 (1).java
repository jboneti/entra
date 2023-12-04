package metodos;

public class Exercicio6 {
	// 1 - cria o metodo
	// 2 - Definir os parametros
	public static void repetir(int numero) {
	// 3 - Verifico processo	
	// os 20 números que vem depois dele
		// definir limite
		int limite = numero + 20;
		for(int i = numero; i <= limite; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que printe o número que o 
		 * usuário entrou e os 20 números que
		 * vem depois dele
		 */
		repetir(20);
		
	
	}

}
