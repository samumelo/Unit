package Desafios;

public class Exercicio1 {

	public static void main(String[] args) {

		double soma = 1;
		double qdt = 1;
			for (int casa = 1; casa <=64; casa++) {
			System.out.println("Casa: " + casa + " - Quantidade: " + qdt + "- Soma: " + soma);
			qdt = qdt*2;
			soma = soma + qdt;
			}
	}

}
