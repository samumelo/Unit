package Desafios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		int a;
		int b;
		int c;
		double delta;
		double x1;
		double x2;
		
		System.out.println("Raizes da equacao ax^2 + bx + c = 0");

		
		System.out.println("Entre com o valor de a : ");
		a = leTeclado.nextInt();
		System.out.println("Entre com o valor de b : ");
		b = leTeclado.nextInt();
		System.out.println("Entre com o valor de c : ");
		c = leTeclado.nextInt();

		
		delta = (b * b) - 4 * a * c;
		System.out.println("O valor de delta = " + delta);	   
		
		if (delta < 0) {
			System.out.println("Indeterminadas");
		}
		
		if (delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("O valor de x1 = " + x1);
		}
		
		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("O valor de x1 = " + x1);
			System.out.println("O valor de x2 = " + x2);
		}
		leTeclado.close();
	}

}
