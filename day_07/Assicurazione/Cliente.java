package day_07.Assicurazione;

import java.time.LocalDate;

public class Cliente {
	private String codicefiscale;
	private String nome;
	private String cognome;
	private LocalDate data;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(String codicefiscale, String nome, String cognome, LocalDate data) {
		super();
		this.codicefiscale = codicefiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.data = data;
	}
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Cliente [codicefiscale=" + this.codicefiscale + ", nome=" + this.nome + ", cognome=" + this.cognome + ", data=" + this.data
				+ "]";
	}
	
	
}

