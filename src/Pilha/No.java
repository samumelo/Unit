package Pilha;

public class No<T extends Comparable<T>> {

	private No<T> anterior;
	private No<T> proximo;
	private T valor;
	
	public No() {
	}
	
	public No<T> getAnterior() {
		return anterior;
	}
	
	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}
	
	public No<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
}