
public class Adotante {

	private int id;
	private String nome;
	private String telefoneFixo;
	private String telefoneCelular;
	private String email;
	private Endereco endereco;
	private boolean impedimento;
	private String motivoImpedimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isImpedimento() {
		return impedimento;
	}
	public void setImpedimento(boolean impedimento) {
		this.impedimento = impedimento;
	}
	public String getMotivoImpedimento() {
		return motivoImpedimento;
	}
	public void setMotivoImpedimento(String motivoImpedimento) {
		this.motivoImpedimento = motivoImpedimento;
	}
	
}
