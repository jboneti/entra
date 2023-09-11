package aula7;

import java.util.Scanner;

public class lacosDeRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int numero = 0;
		while (numero < 6) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("informe valores");
		int entrada = scan.nextInt();
		while (entrada != 0) {
			System.out.println("informe valores");
			entrada = scan.nextInt();
		}
		System.out.println("fim");

		System.out.println(" Informe uma letra");
		char entrada2 = scan.next().charAt(0);

		while (entrada2 != 'a') {
			System.out.println("Informe uma letra");
			entrada2 = scan.next().charAt(0);
		}
		System.out.println("fim");

	}

}
