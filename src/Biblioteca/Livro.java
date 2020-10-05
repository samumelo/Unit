package Biblioteca;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto ;
	private Pessoa pessoa;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto, Pessoa pessoa) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.pessoa = pessoa;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPaginaAtual() {
		return paginaAtual;
	}
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public String detalhes() {
		return this.titulo + ", " + this.autor + ", " + this.totalPaginas + ", " + this.paginaAtual + ", " + this.aberto + ", " + this.pessoa.getNome() ;
	}
	@Override
	public void abrir() {
		
		for (Livro livro : pessoa.getLivro()) {
			if (livro.aberto = true){
				System.out.println("Você já possui um livro emprestado.");
				return;
			}
			System.out.println("Livro aberto");
		}
		
	}
	@Override
	public void fechar() {
		this.aberto = false;
		System.out.println("Livro fechado");
		
	}
	@Override
	public void folhear(int pagina) {
		if(this.aberto = true) {
			if((pagina <= totalPaginas) && (pagina >=1)) {
				this.paginaAtual = pagina;
				System.out.println("Você esta na página: " + this.paginaAtual);
			}
				
			
		}else
			System.out.println("Livro concluido");
	}
	@Override
	public void avancarPagina() {
		if(this.aberto = true) {
			if(this.paginaAtual < this.totalPaginas) {
				
				System.out.println("Página atual: " + this.paginaAtual++);	
			}
					
		}else
		System.out.println("Você não pode avançar a página");	
	}
	@Override
	public void voltarPagina() {
			if(this.aberto = true) {
			if(this.paginaAtual >= 1) {
				System.out.println("Página anterior: " + this.paginaAtual--);
			}
					
		}else
			System.out.println("Você fechou o livro");	
	}
		
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
