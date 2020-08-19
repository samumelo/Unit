package Desafios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String frase;
		int palavra = 0;

		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Digite uma frase.");
		frase = leTeclado.next();

		for (palavra = 0; palavra < frase.length(); palavra++) {
			palavra = palavra++;

		}
		System.out.println("A frase digitada: " + frase + "\nContem: " + palavra + " palavras");
		leTeclado.close();

	}

}
