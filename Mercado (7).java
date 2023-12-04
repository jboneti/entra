
public class Mercado {
	int macasVendidas;
	double precoMacas;
	int laranjasVendidas;
	double precoLaranjas;
	
	


	public Mercado(int macasVendidas, double precoMacas, int laranjasVendidas, double precoLaranjas) {
		this.macasVendidas = macasVendidas;
		this.precoMacas = precoMacas;
		this.laranjasVendidas = laranjasVendidas;
		this.precoLaranjas = precoLaranjas;
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
