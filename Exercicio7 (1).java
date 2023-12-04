package metodos;

public class Exercicio7 {
// 1 - Criar metodo
	// 2 - Definir os meus parametros
	public static void printPalavra(String palavra) {
		// .length() - Apresenta o tamanho da palavra
		if(palavra.length() % 2 == 0) {
			System.out.println(palavra.charAt(0));
		} else {
			System.out.println(palavra.charAt(1));
		
		}
		
	}

	public static void main(String[] args) {
		/*
		 * Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho
		 * par, printe o primeiro caracter dessa palavra Caso ela tenha tamanho ímpar,
		 * printe o segundo caracter dessa palavra
		 */
		
		printPalavra("Olá mund");
	}

}
