package aula16Metodo;

public class exemploMetodo {

	/*
	 * Exercicio: 
	 * 
	 * - Crie um metodo para imprimir seu nome, sua idade e cor favorita
	 * 
	 * - Crie um metodo com duas variaveis com os valores 10 e 100, imprima a
	 * multiplicação e soma
	 * 
	 * - Utilize o metodo conta(), já criado, quebre o mesmo em dois metodos -
	 * soma() e multiplicacao(), sendo que os nomes das variaveis deve ser igual
	 * 
	 * - Crie mais um metodo, utilize o dados de altura de dois amigos e imprima a
	 * meédia e os nomes
	 */

	// 1 - crie um metodo para imprimir seu nome, sua idade e cor favorita

	public static void name() {

		System.out.println("Olá, meu nome é Jonathan Boneti." + "Tenho 23 anos," + " minha cor favorita é preto");

	}

// 2 - Crie um metodo com duas variaveis com os valores 10 e 100. Imprima a multiplicação e soma

	public static void valores() {

		int multiplicacao = 0;
		int soma = 0;
		int cor = 10;
		int papel = 100;

		multiplicacao = cor * papel;
		soma = cor + papel;

		System.out.println("valores de  10 * 100 é igual: " + multiplicacao);
		System.out.println("valores de  10 + 100 é igual: " + soma);

	}

// 3 - utilize o metodo conta (), ja criado, quebre o mesmo em dois metodos - soma() e multiplicacao(), sendo que oe nomes das variaveis deve ser igual

	public static void soma() {

		int soma = 0;
		int cor = 10;
		int papel = 100;

		soma = cor + papel;

		System.out.println("valores de  10 + 100 é igual: " + soma);
		// System.out.println("valores de 10 * 100 é igual: " (cor + papel));
	}

	public static void multiplicacao() {

		int soma = 0;
		int cor = 10;
		int papel = 100;

		soma = cor * papel;

		System.out.println("valores de  10 * 100 é igual: " + soma);
		// System.out.println("valores de 10 * 100 é igual: " (cor * papel));
	}

// 4 - crie mais um metodo, utilize o dados de altura de dois amigos e imprima a media e dos nomes

	public static void amigos() {
		double alturaUm = 1.65;
		double alturaDois = 1.80;
		double soma = 0;
		double media = 0;

		soma = alturaDois + alturaUm;
		media = soma / 2;

		System.out.println("Média: " + media);

		// double alturaUm = 1.65;
		// double alturaDois = 1.80;

		// System.out.println("Média : " + ((alturaDois + alturaUm) / 2 ) + "Maju e
		// Bruno");
	}

	public static void main(String[] args) {
		name();
		valores();
		soma();
		multiplicacao();
		amigos();

	}
}
