package Pilha;

public class Pilha <T extends Comparable<T>> {

	private No<T> primeiro;
	private No<T> ultimo;
	private Integer tamanho;

	public Pilha() {
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	public No<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No<T> primeiro) {
		this.primeiro = primeiro;
	}

	public No<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(No<T> ultimo) {
		this.ultimo = ultimo;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanhoe(Integer tamanho) {
		this.tamanho = tamanho;
	}

	
	public boolean isEmpty() {
		return (this.primeiro == null);
	}

	
	public void push(T elemento) {
		if(isEmpty()) {
			this.primeiro = new No<T>();
			this.ultimo = primeiro;
			No<T> novo = new No<T>();
			novo.setValor(elemento);
			novo.setProximo(this.primeiro);
			this.primeiro = novo;
			this.tamanho++;
		} else {
			No<T> novo = new No<T>();
			novo.setValor(elemento);
			novo.setProximo(this.primeiro);
			this.primeiro = novo;
			this.tamanho++;
		}

	}

	
	public void pop() {
		if(isEmpty()) {
			return ;
		}
		this.primeiro = primeiro.getProximo();
		this.tamanho--;
	}

	
	public void listar() {
		if(isEmpty()) {
			return ;
		}

		No<T> aux = this.primeiro;

		while(aux != null) {
			System.out.println(aux.getValor());
			aux = aux.getProximo();
		}
	}

	
	public void tamanhoPilha() {
		System.out.println("Tamanho da Pilha: " + this.getTamanho());
	}

	
	public void topo() {
		if(isEmpty()) {
			System.out.println("-");
			return;
		}

		System.out.println(this.getPrimeiro().toString());
	}
}