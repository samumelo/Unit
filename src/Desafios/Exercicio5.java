package Desafios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Digite um Valor");
		int N = leTeclado.nextInt();

			for(int a=1, b=1, i=0; i<N; b+=a, a=b-a, i++) {
				System.out.print(a + " ");
			}  
			leTeclado.close();

	}

}
