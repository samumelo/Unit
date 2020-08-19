package Desafios;

public class Exercicio7 {

	public static void main(String[] args) {
		double x;
		double f;
		double numParaFatorial;
		int somaPar = 0;
		int somaImpar = 0;
		int i = 0;
		int j = 1;
		while (i <= 50) {
			somaPar = somaPar + i;
			i += 2;
		}
		System.out.println("Soma dos pares é " + somaPar);
		while (j <= 49) {
			somaImpar = somaImpar + j;
			j += 2;
		}
		System.out.println("Soma dos impares é " + somaImpar);

		numParaFatorial = somaPar - somaImpar;
		System.out.println("num para Fatorar " + numParaFatorial);

		x = numParaFatorial;
		f = x;

		while (x > 1) {

			f = f * (x - 1);
			x--;
		}
		System.out.println("Resultado fatorial " + f);

	}

}
