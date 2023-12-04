public class Principal {

	public static void main(String[] args) {

		Mercado unidadeBlumenau = new Mercado("São José", 50, 2.4, 7000, 2);
		Mercado unidadeFloripa = new Mercado("Floripa", 3000, 2.4, 5000, 2.1);

		System.out.println(unidadeBlumenau.getMacasVendidas()); // Acessando o atributo
		unidadeBlumenau.setMacasVendidas(500); // Modificando o atributo
		System.out.println(unidadeBlumenau.getMacasVendidas());
		unidadeBlumenau.setMacasVendidas(2000);
		Mercado vetor[] = new Mercado[2];
		vetor[0] = unidadeBlumenau;
		vetor[1] = unidadeFloripa;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].getLocalidade());
		}

	}

}
