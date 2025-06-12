package day_10.veicolo;

public class Auto extends Veicolo{
	private boolean aRoulotte;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String nome, String modello, boolean aRoulotte) {
		super(nome, modello);
		this.aRoulotte = aRoulotte;
	}

	@Override
	public String toString() {
		return "Auto [" + super.toString() + " + aRoulotte +" + "]" ;
	}

	}

