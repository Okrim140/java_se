package day_07.CampoTennis;

/*
 * Fare una classe Prenotazione (di un campo da tennis) contenente il nome del 
cliente e l'ora della sua prenotazione. Implementare una classe Campo in cui ci 
sono i seguenti metodi: public boolean addPren(int inizio, int fine, 
String unNomeCliente), per prenotare il campo (controlla se i dati inseriti 
sono giusti e se il campo è disponibile dopodichè salva la prenotazione e 
restituisce true se il campo è stato prenotato);
 public boolean removePren (int inizio, int fine, String unNomeCliente ), 
per cancellare una prenotazione (controlla se il campo è stato prenotato dal 
cliente che vuole cancellare la prenotazione dopodichè la cancella e 
restituisce true se la prenotazione è stata cancellata); public String 
toString(); public double utilizzo(), per trovare la percentuale 
dell'utilizzo del campo.
 */
public class Prenotazione {
	private String nome;
	private String cognome;
	private String ora[];
	public Prenotazione() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prenotazione(String nome, String cognome, String ora) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.ora = ora;
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
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora = ora;
	}
	@Override
	public String toString() {
		return "Campo [nome=" + this.nome + ", cognome=" + this.cognome + ", ora=" + this.ora + "]";
	}

}
