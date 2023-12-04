package estudo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/*
		 * A Câmara Municipal de Vereadores de Blumenau pretende realizar uma
		 * estatística sobre o desempenho dos seus parlamentares. Para cada um dos 15
		 * vereadores, ela possui o nome, partido, quantidade de projetos apresentados,
		 * quantidade de projetos aprovados. O desempenho é calculado da seguinte forma:
		 * (projetos aprovados / projetos apresentados) * índice de trabalho. Se não
		 * apresentou nenhum projeto, o desempenho é 0 (zero).
		 * 
		 * O índice de trabalho é definido pela seguinte tabela: Projetos apresentados
		 * Índice de trabalho 01 – 05 0,80 06 – 10 1,00 11 – 17 1,08 acima de 17 1,22
		 * 
		 * Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima
		 * o nome, partido e desempenho do vereador.
		 * 
		 * Imprima: a) o total de projetos apresentados e de aprovados na câmara;
		 * 
		 * b) o nome, partido e desempenho do vereador com mais projetos aprovados;
		 * 
		 * c) o nome, partido e desempenho do vereador com menor desempenho;
		 * 
		 * d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que
		 * o desempenho médio de toda a câmara;
		 */

		// criar uma lista
		//
		List<Vereador> vereadores = new ArrayList<>();
		Vereador maju = new Vereador("Maju", "MJT", 20, 10);
		Vereador ademir = new Vereador("ademir", "MJT", 4, 3);
		Vereador joao = new Vereador("Joao", "FURB", 12, 12);
		Vereador leo = new Vereador("Leo", "ENT", 8, 2);
		Vereador maria = new Vereador("Maria", "MEM", 14, 5);

		vereadores.add(maju);
		vereadores.add(ademir);
		vereadores.add(joao);
		vereadores.add(leo);
		vereadores.add(maria);
		// b) o nome, partido e desempenho do vereador com mais projetos aprovados;
		Vereador melhorDesempenho = new Vereador();
		double projAprov = Integer.MIN_VALUE;
		// como eu vejo os elementos
		// foreach - percorrendo cada item
		for (Vereador vereador : vereadores) {
			if(projAprov < vereador.desempenho()) {
				projAprov = vereador.desempenho();
				melhorDesempenho = vereador;
			}
		}
		
		System.out.println("Vereador com melhor desempenho: " +
				melhorDesempenho.getNome() + " ," + melhorDesempenho.getPartido());

	}

}
