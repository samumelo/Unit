
public class Terrestre extends MeioDeTransporte {

	private int qtdeRodas;
	private double potencia;

	// Construtor padrão
	public Terrestre() {

	}

	// Metodos get e set
	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	// Metodos publicos
	public double consumo() {
		return ((potencia * getCarga_maxima()) * 100);
	}
}
