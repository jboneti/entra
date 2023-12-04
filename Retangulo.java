import java.util.ArrayList;
import java.util.List;

public class Retangulo {

	private double largura; // Encapsulando os atributos
	private double altura;

	public static List<Retangulo> listaRetangulos = new ArrayList<Retangulo>(); // Criando a ArrayList (sem get e set)

	public Retangulo(double largura, double altura) {
		setLargura(largura); // Usando sets no construtor em vez de atribuicao direta
		setAltura(altura);
		listaRetangulos.add(this); // Passando os objetos para a lista
	}

	public double calcularArea() {
		return this.getAltura() * this.getLargura();
	}

	public double calcularPerimetro() {
		return (this.getAltura() * 2) + (this.getLargura() * 2);
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) { // Validacao da largura
		if (largura <= 0) {
			System.out.println("Largura nao pode ser negativa");
		}
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) { // Validacao da altura
		if (altura <= 0) {
			System.out.println("Altura nao pode ser negativa");
		}
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "o retangulo de altura " + this.getAltura() + " e de largura " + this.getLargura();
	}

}
