
public class Principal {

	public static void main(String[] args) {

		Retangulo r1 = new Retangulo(5, 2);
		Retangulo r2 = new Retangulo(1, 6);
		Retangulo r3 = new Retangulo(6, 9);
		Retangulo r4 = new Retangulo(5, 2);
		Retangulo r5 = new Retangulo(3, 2);
		Retangulo r6 = new Retangulo(2.5, 6);
		Retangulo r7 = new Retangulo(8, 3);
		Retangulo r8 = new Retangulo(9, 5);
		Retangulo r9 = new Retangulo(1, 16);
		Retangulo r10 = new Retangulo(5, 9);

		// Usando o for normal
		double maiorPerimetro = Integer.MIN_VALUE;
		double maiorArea = Integer.MIN_VALUE;
		int iMaiorPerimetro = 0;
		int iMaiorArea = 0;
		for (int i = 0; i < Retangulo.listaRetangulos.size(); i++) {
			if (Retangulo.listaRetangulos.get(i).calcularArea() > maiorArea) {
				maiorArea = Retangulo.listaRetangulos.get(i).calcularArea();
				iMaiorArea = i;
			}
			if (Retangulo.listaRetangulos.get(i).calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = Retangulo.listaRetangulos.get(i).calcularPerimetro();
				iMaiorPerimetro = i;
			}
		}

		System.out.println("Maior perimetro: " + Retangulo.listaRetangulos.get(iMaiorPerimetro).toString());
		System.out.println("Maior area: " + Retangulo.listaRetangulos.get(iMaiorArea).toString() + "\n");

		// Usando o for iterable
		Retangulo rPerimetro = null; // A informacao de quem eh o maior vai ser passado para um objeto de Retangulo
		Retangulo rArea = null;
		maiorPerimetro = Integer.MIN_VALUE; // Resetando os valores (por causa do for de cima)
		maiorArea = Integer.MIN_VALUE;
		for (Retangulo r : Retangulo.listaRetangulos) {
			if (r.calcularArea() > maiorArea) {
				maiorArea = r.calcularArea();
				rArea = r;
			}
			if (r.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.calcularPerimetro();
				rPerimetro = r;
			}
		}

		System.out.println("Maior perimetro: " + rPerimetro.toString());
		System.out.println("Maior area: " + rArea.toString());

	}

}
