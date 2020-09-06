import java.util.Date;

public class Produto {

	// Atributos
	private Integer id;
	private String nome;
	private String descricao;
	private Date validade;

	// Metodos get e set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	// Metodo publico
	public Integer getCod() {
		return id = 5;
	}
}
