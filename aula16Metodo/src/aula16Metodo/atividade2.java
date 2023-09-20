package aula16Metodo;

public class atividade2 {
// TODO Auto-generated method stub
	/*
	 * Faça um método para cada um dos seus seus colegas O método deve printar: O
	 * nome dele(a) é [nome] Ele(a) tem [idade] anos Ele(a) é estudante do Entra 21
	 * (Em prints separados)
	 * 
	 * O usuário deve entar com um valor que vai selecionar um dos métodos a ser
	 * executado
	 */

	public static void dados(String nome, int idade) {

		System.out.println("O nome de é, " + nome + "." + " Ele tem  " + idade);
	}

	public static void main(String[] args) {

		dados("Rodrigo", 28);
		dados("Samuel", 33);
		dados("Bruna", 24);
	}

}
