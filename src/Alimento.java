
public class Alimento extends ItemDeLoja {

	private Integer selo;

	// Construtor padr�o
	public Alimento() {

	}

	public Integer getSelo() {
		return selo;
	}

	public void setSelo(Integer selo) {
		this.selo = selo;
	}

	public int getIdentificador() {
		return getSelo();
	}
}
