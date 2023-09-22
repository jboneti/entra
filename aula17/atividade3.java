package aula17;

public class atividade3 {

	public static void colega(String nome, int idade, boolean estudante) {

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
// mesma coisa que estudante == true
		if (estudante) {
			System.out.println("É estudante do Entra21");
		} else {
			System.out.println("Não é estudante");
		}
//							! = not
// if(estudante == false) || if(!estudante)
	}

	public static void main(String[] args) {
		/*
		 * Faça um método para cada um dos seus seus colegas O método deve printar: O
		 * nome dele(a) é [nome] Ele(a) tem [idade] anos Ele(a) é estudante do Entra 21
		 * (Em prints separados)
		 * 
		 * Os dados devem ser passados como parametros, e o metodo pode ser chamado mais
		 * de uma vez
		 */

		boolean verdade = true;
		colega("Maju", 20, false);
		colega("Leo", 19, verdade);
		colega("Fernando", 40, true);
	}

}
