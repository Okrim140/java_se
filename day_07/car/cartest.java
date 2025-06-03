package day_07.car;

public class cartest {

	public static void main(String[] args) {
		car panda = new car();
		car ferrari = new car("ev423ss","ferrari","sf90", 100.0, 1);
		car bmw = new car("gm546tv", "bmw", "180d", 60.0, 0.8);
		System.out.println("numero di targa ferrari: " + ferrari.getTarga());
		ferrari.setTarga("aaaaaaa");
		System.out.println("numero di targa ferrari: " + ferrari.getTarga());
		
		panda.setTarga("gg956lk");
		System.out.println("numero targa panda: " + panda.getTarga());
		
		panda.setMarca("Fiat");
		System.out.println("numero marca panda: " + panda.getMarca());
		
		panda.setModello("panda");
		System.out.println("numero modello panda: " + panda.getModello());
		
		panda.setSerbatoio(100);
		
	    System.out.println("numero serbatoio panda: " + panda.getSerbatoio());
		
		panda.setConsumomedio(30);
		System.out.println("numero consumo medio panda: " + panda.getConsumomedio());
		
		System.out.println("bmw "+ bmw);
		System.out.println("panda " + panda);
		System.out.println("ferrari " + ferrari);
		CarController.aggiornocarburante(ferrari, 10);
		System.out.println(ferrari);
	}

}
