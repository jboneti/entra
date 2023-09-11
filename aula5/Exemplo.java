package aula5;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Sala");
		int salaAluno = entrada.nextInt();
		
		if (salaAluno == 6) {
			System.out.println("sexto ano");
		} else if ( salaAluno == 7) {
			System.out.println("setimo ano");
		} else if (salaAluno == 8) {
			System.out.println("oitavo ano");
		} else if (salaAluno == 9) {
			System.out.println("nono ano");
		}
			
	
		switch (salaAluno) {
		case 7:
			System.out.println("setimo ano");
			break;
		case 6:
			System.out.println("sexto ano");
			break;
		case 8:
			System.out.println("oitavo ano");
			break;
		case 9:
			System.out.println("nono ano");
			break;
		default:
			break;
		}

	}

}
