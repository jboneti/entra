package estudo;

// 1 - criando a entidade
public class Vereador {

	private String nome;
	private String partido;
	private double qntProjApres;
	private double qntProjAprov;

	public Vereador() {
		// TODO Auto-generated constructor stub
	}
	public Vereador(String nome, String partido, int qntProjApres, int qntProjAprov) {
		setNome(nome);
		setQntProjApres(qntProjApres);
		setQntProjAprov(qntProjAprov);
		setPartido(partido);
	}

	public String getPartido() {
		return partido;
	}
	
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getNome() {
		return nome;
	}

	public double getQntProjApres() {
		return qntProjApres;
	}

	public double getQntProjAprov() {
		return qntProjAprov;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQntProjApres(double qntProjApres) {
		this.qntProjApres = qntProjApres;
	}

	public void setQntProjAprov(double qntProjAprov) {
		this.qntProjAprov = qntProjAprov;
	}

	/*
	 * O desempenho é calculado da seguinte forma: (projetos aprovados / projetos
	 * apresentados) * índice de trabalho. o Se não apresentou nenhum projeto,
	 * desempenho é 0 (zero).
	 */

	public double desempenho() {
		// recebo por função o dado do indice de trabalho
		double indiceTrab = this.indiceTrabalho();
		// Se não apresentou nenhum projeto, desempenho é 0 (zero).
		if (this.getQntProjApres() == 0) {
			return 0;
		} else {
			return (this.qntProjAprov / this.qntProjApres) * indiceTrab;
		}
	}

	/*
	 * O índice de trabalho é definido pela seguinte tabela: Projetos apresentados
	 * Índice de trabalho 01 – 05 (0,80) 06 – 10 (1,00) 11 – 17 (1,08) acima de 17 (1,22)
	 */
	// Usuario não informa nada pois temos uma tabela, então pensamos em ter
	// uma função para conseguir esses dados
	// somente a classe vereador irá utilizar
	private double indiceTrabalho() {
		// crio uma função que descobre o dado que deve ser utilizado
		// no metodo desempenho()
		double indice = 0;
		if(qntProjApres >= 17) {
			indice = 1.22;
		} else if(qntProjApres >= 11 && qntProjApres < 17) {
			indice = 1.08;
		} else if(qntProjApres > 6 && qntProjApres < 11) {
			indice = 1;
		} else {
			indice = 0.80;
		}
		return indice;
	}

	
	
}
