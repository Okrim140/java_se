package day_10.veicolo;

public class Moto extends Veicolo{
	private boolean aSidecar;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String nome, String modello, boolean aSidecar) {
		super(nome, modello);
		this.aSidecar = aSidecar;
	}

	@Override
	public String toString() {
		return "Moto ["+ super.toString() + "aSidecar=" + aSidecar + "]";
	}
	

}
