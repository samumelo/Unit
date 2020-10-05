package Biblioteca;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private ArrayList<Livro> livro = new ArrayList<Livro>();
	
	public Pessoa() {

	}
	
	public Pessoa(String nome, int idade, String sexo, ArrayList<Livro> livro) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.livro = livro;
	}
	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void fazerAniversario() {
		this.idade = idade++;
		
	}
	public ArrayList<Livro> getLivro() {
		return livro;
	}
	public void setLivro(ArrayList<Livro> livro) {
		this.livro = livro;
	}

}
