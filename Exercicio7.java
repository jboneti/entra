package Revisao;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * A primeira coluna é o tamanho da casa
		 * A segunda coluna é a quantidade de quartos
		 * A terceira coluna é o preço
		 * Determinar:
		 * a) Qual é a média dos preços das casas?
		 * b) Quanto custa a menor casa? E quantos quartos tem a casa 
		 * mais cara?
		 * c) Qual a diferença de tamanho da casa com o maior número 
		 * de quartos para a casa com o menor número de quartos?
		 */
		
		int[][] matriz = {
				 {2104, 3, 399900},
				 {1600, 3, 329900},
				 {2400, 3, 369000},
				 {1416, 2, 232000},
				 {3000, 4, 539900},
				 {1985, 4, 299900},
				 {1534, 3, 314900},
				 {1427, 3, 199000},
				 {1380, 3, 212000},
				 {1494, 3, 242500},
				 {1940, 4, 240000},
				 {2000, 3, 347000},
				 {1890, 3, 330000},
				 {1890, 5, 699900},
				 {1268, 3, 259900}
		};
		
		int soma = 0;
		int menorCasa = Integer.MAX_VALUE;
		int casaMaisCara = Integer.MIN_VALUE;
		int valorMenorCasa = 0;
		int quartos = 0;
		
		int maiorQntQuartos = Integer.MIN_VALUE;
		int tamanhoMaior = 0;
		int menorQntQuartos = Integer.MAX_VALUE;
		int tamanhoMenor = 0;
		
		// Fazer o for para realizar a analise da matriz
		for(int linha = 0;linha < matriz.length; linha++) {
			// linha altera porem coluna é fixa			
			soma = soma + matriz[linha][2];
			
			if(matriz[linha][0] < menorCasa) {
				menorCasa = matriz[linha][0];
				valorMenorCasa = matriz[linha][2];
			}
			
			if(matriz[linha][2] > casaMaisCara ) {
				casaMaisCara = matriz[linha][2];
				quartos = matriz[linha][1];
			}
			
			if(matriz[linha][1] > maiorQntQuartos) {
				maiorQntQuartos = matriz[linha][1];
				tamanhoMaior = matriz[linha][0];
			} 
			
			if(matriz[linha][1] < menorQntQuartos) {
				menorQntQuartos = matriz[linha][1];
				tamanhoMenor = matriz[linha][0];
			}
		}
		
		// tem que da 399900 + 329900 =  729800
		
		
		// Qual é a média dos preços das casas?
		System.out.println("A media: " + (soma / matriz.length));
		// b) Quanto custa a menor casa? E quantos quartos tem a casa 
		// mais cara?
		System.out.println("Valor menor casa: " + valorMenorCasa);
		System.out.println("Quartos casa mais cara: " + quartos);
		
		//c) Qual a diferença de tamanho da casa com o maior número 
		// de quartos para a casa com o menor número de quartos?
		System.out.println("Diferença: " + (tamanhoMaior - tamanhoMenor));
	
		
		
		
		
		
	}

}
