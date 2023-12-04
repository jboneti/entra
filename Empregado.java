package ex8;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empregado extends Funcionario {
	private String idSindicato;
	private Gerente gerente;

	public Empregado(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, ArrayList<String> habilidades, String idSindicato, Gerente gerente) {
		super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);

		setIdSindicato(idSindicato);
		setGerente(gerente);
	}
	
	public void comissao(double parametro) {
		double valorAAcrescentar = parametro * 0.05;
		// não consigo o this.salario porque ele é do pai
		setSalario(getSalario() + valorAAcrescentar);
	}
	
	//eu não to verificando nenhuma dado externo
	public void sairDoSindicato() {
		this.idSindicato = null;
	}


	public String getIdSindicato() {
		return idSindicato;
	}

	public void setIdSindicato(String idSindicato) {
		if(idSindicato != null) {
			this.idSindicato = idSindicato;			
		}
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return super.toString() + "Empregado [idSindicato=" + idSindicato + ", gerente=" + gerente + "]";
	}
	
	
}
