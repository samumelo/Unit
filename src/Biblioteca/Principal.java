package Biblioteca;

public class Principal {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Samuel Melo");
		p1.setIdade(38);
		p1.setSexo("m");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Silvio Melo");
		p2.setIdade(26);
		p2.setSexo("m");
					
		Livro livro1 = new Livro();
		livro1.setTitulo("Sistemas Colaborativos");
		livro1.setAutor("Silvio Meira");
		livro1.setTotalPaginas(100);
		livro1.setPaginaAtual(20);
		livro1.setPessoa(p1);
		
		Livro livro2 = new Livro();
		livro2.setTitulo("Campo de Batalha da Mente");
		livro2.setAutor("Joice Meyer");
		livro2.setTotalPaginas(200);
		livro2.setPaginaAtual(50);
		livro2.setPessoa(p2);
		
		Livro livro3 = new Livro();
		livro3.setTitulo("A Arte de SEO");
		livro3.setAutor("John French");
		livro3.setTotalPaginas(300);
		livro3.setPaginaAtual(100);
		livro3.setPessoa(p1);
		
		Almanaque al1 = new Almanaque();
		al1.setTitulo("O Poder do Coaching");
		al1.setAutor("Colaborativo");
		al1.setTotalPaginas(40);
		al1.setPaginaAtual(10);
		al1.setPessoa(p1);
		
		Almanaque al2 = new Almanaque();
		al2.setTitulo("A Cabana");
		al2.setAutor("P. Young");
		al2.setTotalPaginas(20);
		al2.setPaginaAtual(15);
		al2.setPessoa(p2);
	
			
		livro1.abrir();
		livro1.avancarPagina();
		livro1.voltarPagina();
		livro1.avancarPagina();
		livro1.avancarPagina();
		livro1.folhear(2);
		livro1.fechar();
		livro1.abrir();
		livro1.avancarPagina();
		System.out.println(livro1.detalhes());
		livro2.abrir();
		livro2.avancarPagina();
		livro2.avancarPagina();
		livro2.voltarPagina();
		livro2.folhear(2);
		System.out.println(livro2.detalhes());
		livro3.abrir();
		livro3.avancarPagina();
		livro3.avancarPagina();
		livro3.voltarPagina();
		livro3.folhear(2);
		System.out.println(livro3.detalhes());


	}

}
