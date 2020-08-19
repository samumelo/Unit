package Desafios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Digite N");
		Scanner leTeclado = new Scanner(System.in);
		
		double N = leTeclado.nextDouble();
		double A = 0;
		for (int i = 0; i < N; i++) {
		A= (N)+((N-i)/i+1)+(1/N);
			A += (N - i) / (i + 1);
		}
		System.out.println("Entrada em N: " + N + "; Saída em A = " + A);

		leTeclado.close();

	}

}
