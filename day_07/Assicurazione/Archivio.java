package day_07.Assicurazione;

import java.time.LocalDate;

public class Archivio {

	public static void main(String[] args) {
		Cliente mario = new Cliente("chkjshj", "Mario", "Rossi", LocalDate.of(1995, 12, 2));
		Cliente ciro = new Cliente("ffrthr", "ciro", "esposito", LocalDate.of(1995, 12, 2));
		Cliente giuseppe = new Cliente("cvxs3tg", "giuseppe", "sirio", LocalDate.of(1995, 12, 2));
		System.out.println(mario);
		System.out.println(ciro);
		System.out.println(ciro);
		Veicolo mezzo1 = new Veicolo("targa1", mario);
		Veicolo mezzo2 = new Veicolo("targa2", ciro);
		Veicolo mezzo3 = new Veicolo("targa3", giuseppe);
		System.out.println(mezzo1);
		System.out.println(mezzo2);
		System.out.println(mezzo3);

		Veicolo[] archivio = {mezzo1, mezzo2, mezzo3};
		for (int i = 0; i < archivio.length; i++) {
			System.out.println(archivio[i]);
		}
	}

}
