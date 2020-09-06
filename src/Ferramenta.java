
public class Ferramenta extends ItemDeLoja {

	// Atributos
	private String categoria;
	private Integer serial;

	// Construtor padrão
	public Ferramenta() {

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	public int getIdentificador() {
		return getSerial();
	}

	public void separar() {

	}

	public void separar(String valor) {
		
	}
}
