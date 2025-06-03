package day_07.car;

public class car {
	private String targa;
	private String marca;
	private String modello;
	private double serbatoio;
	private double consumomedio;

	public car() {
		super();
	} // costruttore di default

	public car(String targa, String marca, String modello, double serbatoio, double consumomedio) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.serbatoio = serbatoio;
		this.consumomedio = consumomedio;
		// costruttore parametrico
	}

	public String getTarga() {
		return this.targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getSerbatoio() {
		return this.serbatoio;
	}

	public void setSerbatoio(double serbatoio) {
		this.serbatoio = serbatoio;
	}

	public double getConsumomedio() {
		return this.consumomedio;
	}

	public void setConsumomedio(double consumomedio) {
		this.consumomedio = consumomedio;
	}

	public String toString() {
		return "[" + "targa: " + this.targa + " marca " + this.marca + " modello " + this.modello + " serbatorio "
				+ this.serbatoio + " consumo Medio " + this.consumomedio + "]";
	}
	/*
	 * public static void main(String[] args) { car panda = new car(); car ferrari =
	 * new car("ev423ss","ferrari","sf90", 100.0, 1); car bmw = new car("gm546tv",
	 * "bmw", "180d", 60.0, 0.8); }
	 */
}
