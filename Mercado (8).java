
public class Mercado {
	private String localidade; // Deixando todos os atributos privados
	private int macasVendidas;
	private double precoMacas;
	private int laranjasVendidas;
	private double precoLaranjas;

	public Mercado(String localidade, int macasVendidas, double precoMacas, int laranjasVendidas,
			double precoLaranjas) {
		setLocalidade(localidade); // Colocando os sets no construtor
		setMacasVendidas(macasVendidas);
		setPrecoMacas(precoMacas);
		setLaranjasVendidas(laranjasVendidas);
		setPrecoLaranjas(precoLaranjas);
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		if (localidade.isBlank() || localidade.isEmpty() || localidade == null) { // Fazendo a validação de string
			System.out.println("Erro, nome inválido");
		} else {
			this.localidade = localidade;
		}
	}

	public int getMacasVendidas() {
		return macasVendidas;
	}

	public void setMacasVendidas(int macasVendidas) {
		if (macasVendidas < 0) { // Fazendo a validação de número
			System.out.println("Erro, número não pode ser negativo");
		} else {
			this.macasVendidas = macasVendidas;
		}
	}

	public double getPrecoMacas() {
		return precoMacas;
	}

	public void setPrecoMacas(double precoMacas) {
		if (precoMacas < 0) {
			System.out.println("Erro, preço não pode ser negativo");
		} else {
			this.precoMacas = precoMacas;
		}
	}

	public int getLaranjasVendidas() {
		return laranjasVendidas;
	}

	public void setLaranjasVendidas(int laranjasVendidas) {
		if (laranjasVendidas < 0) {
			System.out.println("Erro, número de laranjas vendidas inválido");
		} else {
			this.laranjasVendidas = laranjasVendidas;
		}
	}

	public double getPrecoLaranjas() {
		return precoLaranjas;
	}

	public void setPrecoLaranjas(double precoLaranjas) {
		if (precoLaranjas < 0) {
			System.out.println("Erro, preço da laranja não pode ser negativo");
		} else {
			this.precoLaranjas = precoLaranjas;
		}
	}

	public double lucroMacas() {
		return macasVendidas * precoMacas;
	}

	public double lucroLaranja() {
		return laranjasVendidas * precoLaranjas;
	}

	public double lucroTotal() {
		return lucroMacas() + lucroLaranja();
	}

}
