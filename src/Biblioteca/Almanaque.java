package Biblioteca;

public class Almanaque extends Livro {
	
	public Almanaque() {
	  super();	
	}
			
	
	public Almanaque(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto, Pessoa pessoa) {
		super(titulo, autor, totalPaginas, paginaAtual, aberto, pessoa);
		
	}



	public void folhear() {
	
		if(super.getAberto() == true && super.getPaginaAtual() == 2) {
		
				super.setPaginaAtual(super.getPaginaAtual());
			}
			System.out.println("");
			
			
		}
		
		
	
	
	public void avancar() {
		if(super.getAberto() == true) {
			if(super.getPaginaAtual() < super.getTotalPaginas()) {
				super.setPaginaAtual(super.getPaginaAtual() + 2);
			}
			System.out.println("Você não pode avançar a pagina");	
			
		}
	}

}
