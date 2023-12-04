package prova3;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	private String nomeCarro;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preco;
	private int localizacao;
	public static List<Carro> carros = new ArrayList<>();
	
	public Carro (String nomeCarro, String marca, String placa, String cor, int ano, double preco, int localizacao) {
		setNomeCarro(nomeCarro);
		setMarca(marca);
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
		setPreco(preco);
		setLocalizacao(localizacao);
		carros.add(this);
	}
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
		
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor (String cor) {
		this.cor = cor;
	}
	public int getAno () {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getLocalizaçao() {
		return localizacao;
	}
	public void setLocalizacao(int localizaçao) {
		this.localizacao = localizaçao;
	}
		
	}







