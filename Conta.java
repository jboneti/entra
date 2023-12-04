package aula;

// isto aqui é um objeto - Entidade
public class Conta {
	
	// 2 - criação dos atributos
	private String proprietario;
	// priva os atributos para proteger eles
	private double saldo;
	private int idConta;
	
	// 4 - envolve inicializar é pq não posso ter um dado vazio
	// que é o construstor
	// ele vai executar (entrar) quando o objeto é criado
	// Eu passo os dados que vão preencher os atributo nos parametros
	public Conta(String proprietarioCreate, int idContaCreate) {
		// tudo que não pode ser vazio entra no constutor
	
		// gravar este dado
		// usar o set para previnir erros
		setProprietario(proprietarioCreate);
		setIdConta(idContaCreate);
	}
	
	
	// 3 - pegar os dados (visualizar os dados)
	// construir os gets
	// o get não deixa acessar o atributo diretamente
	public String getProprietario() {
		return proprietario;
	}
	
	public int getIdConta() {
		return idConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	// 5 - setar valores - definir valor para um atributo
	// validação - tratamento
	public void setProprietario(String proprietarioCreate) {
		// proprietarioCreate != null ISTO AQUI VERIFICA SE NÃO É NULO
		// !proprietarioCreate.isBlank() ISTO VERIFICA SE NÃO É
		// STRING VAZIA OU SOMENTE COM ESPAÇO (" ")
		
		if(proprietarioCreate != null && !proprietarioCreate.isBlank()) {
			this.proprietario = proprietario;			
		} else {
			// tratamento de erros - deixem por ultimo
			throw new IllegalArgumentException("Proprietario invalido");
		}
	}
	
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	
	// Nem tudo precisa de set
	
	
	// Toda entidade(objeto)  é uma classe, mas nem toda classe é uma entidade
	//  qualquer tipo de classe tem metodos.
	
	// inclusive uma entidade pode ter metodos especificos

	// metodo para depositar valores
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	
	

}
