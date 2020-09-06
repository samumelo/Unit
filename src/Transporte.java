
public class Transporte {

	// Atributos
	private Integer id;
	private Integer ano;
	private String modelo;
	private double carga_maxima;
	private double potencia;

	// Construtor padrão
	public Transporte() {

	}

	// Construtor com assinatura
	public Transporte(Integer id, Integer ano, String modelo, double carga_maxima, double portencia) {

	}

	// Métodos get e set
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCarga_maxima() {
		return carga_maxima;
	}

	public void setCarga_maxima(double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	// Metodos Públicos

	public double consumo() {
		return ((potencia * carga_maxima) * 100);
	}

	public String leiaModelo() {
		return this.leiaModelo();
	}

	public void gravaModelo(String modelo) {
		return;
	}
}
