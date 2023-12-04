package aula;

public class Principal {

	// 1 - definir o nome do meu objeto = toda loja tem produtos
	// - possui atributos - caracteristicas - os tipos (string, int, boolean)
	// - possui metodos - cada objeto tem suas funções (ideia de trabalho)

	// FAÇAM ESTA QUESTÃO
	/*
	 * Faça uma classe chamada Conta, com os atributos nome e saldo.
	 * 
	 * Faça um método para sacar dinheiro Outro método para depositar dinheiro E
	 * outro método para transferir dinheiro de uma conta para outra
	 * 
	 */
	
	// para criar um objeto na classe main
	
	// Um objeto ele tem as atributos da entidade
	// mas os valores do atributos mudam
	
	public static void main(String[] args) {
		Conta contaDaMAju = new Conta("Maju", 1234);
		Conta contaDoJoao = new Conta("Joao", 9874);
		
		// mostrar o saldo da conta da maju
		System.out.println(contaDaMAju.getSaldo());
		System.out.println(contaDaMAju.getProprietario());
	
		
		System.out.println(contaDaMAju.getProprietario());
		
		contaDaMAju.depositar(10);
		contaDaMAju.depositar(20);
		System.out.println(contaDaMAju.getSaldo());
		
		contaDaMAju.sacar(15);
		System.out.println(contaDaMAju.getSaldo());
	}
	
	
	
	

}
