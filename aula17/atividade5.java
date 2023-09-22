package aula17;

import java.text.DecimalFormat;

public class atividade5 {
	public static void retangulo(double altura, double 
			largura) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		double area = altura * largura;
		double perimetro = (altura * 2) + (largura * 2);
		
		System.out.println("Area: " + formatar.format(area)  );
		System.out.println("Perimetro: " + perimetro);

	}

	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo
		 * 
		 * (Passe a altura e a largura como parâmetros da função)
		 */

		

		retangulo(10, 10);
		
		retangulo(20, 5);
		retangulo(100, 2);
	}

}