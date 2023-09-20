package aula16Metodo;

public class metodoComParametro {

	public static void metodoComParametro(String nome) {
		System.out.println("Meu nome: " + nome);
	}

	public static void metodoComMaisDeUmParametro(int idadeUm, int idadeDois, String texto) {

		System.out.println("A soma das idades : " + (idadeUm + idadeDois));
		System.out.println("E o texto: " + texto);

	}

// Reutilizar metodo soma, porem passar os dados via parametro

	public static void metodoSoma(int valorUm, int valorDois) {
		System.out.println(" Valores total da soma: " + (valorUm + valorDois));
	}

	public static void main(String[] args) {
		// String nome = "Jonathan";

		// metodoComParametro(nome);

		// metodoComParametro("Jonathan");

		// metodoComMaisDeUmParametro(15, 30, "jonathan");
		metodoSoma(10, 100);
	}
}
