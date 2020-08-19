package Desafios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		String password = " jonata de arruda   francisco   ";
		System.out.println(password.length());
		System.out.println(password + " 123456");
		System.out.println(password.contains("a"));
		System.out.println("onde começa? " + password.indexOf("arruda"));
		System.out.println(password.lastIndexOf("francisco"));
		System.out.println(password.toUpperCase());
		System.out.println(password.toLowerCase());
		System.out.println(password.trim());
		System.out.println(password.substring(9));
		System.out.println(password.equals(" jonata de arruda   francisco   "));
		System.out.println("Digite a senha");
		Scanner Scanner = new Scanner(System.in);
		String pass = Scanner.nextLine();
		System.out.println(password.equals(pass));
		System.out.println(password == pass);
		System.out.println();
		String x = "123456";
		String y = "123456";
		System.out.println(x == y);

	}

}
