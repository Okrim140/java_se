package day_10.veicolo;

public class Veicolo {
	private String targa;
	private String nome;
	private String modello;
	public Veicolo() {
		super();
	}
	public Veicolo(String targa, String nome, String modello) {
		super();
		this.targa = targa;
		this.nome = nome;
		this.modello = modello;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	@Override
	public String toString() {
		return "Veicolo [targa=" + this.targa + ", nome=" + this.nome + ", modello=" + this.modello + "]";
	}
	
}
