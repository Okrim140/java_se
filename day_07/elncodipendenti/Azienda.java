package day_07.elncodipendenti;

public class Azienda {

	public static void main(String[] args) {
		//String codiceFiscale, String nome, double stipendio
		Employee dipendente = new Employee();
		Employee mirko = new Employee("CF1", "Mirko", 1200 );
		Employee giovanni = new Employee("CF2", "Giovanni", 1500 );
		Employee marco = new Employee("CF3","Marco", 1700 );
		Employee anna = new Employee("CF4","Anna", 1300 );
		Employee francesco = new Employee("CF4","Francesco", 1900 );
		//System.out.println("Lo stipendio di mirko e: " + mirko.getStipendio());
		//System.out.println("Il codice fiscale di mirko e: " + mirko.getCodiceFiscale());
		//System.out.println("Il nome di mirko e: " + mirko.getNome());
		System.out.println(dipendente.toString());
		System.out.println(mirko.toString());
		System.out.println(giovanni.toString());
		System.out.println(marco.toString());
		System.out.println(anna.toString());
		System.out.println(francesco.toString());
		mirko.setCodiceFiscale("hfgjshdidufsi");
		giovanni.setCodiceFiscale("hfgjshdidufsi");
		francesco.setCodiceFiscale("hfgjshdidufsi");
		System.out.println(mirko.toString());
		System.out.println(giovanni.toString());
		System.out.println(francesco.toString());
		mirko.setCodiceFiscale("lcvmrk");
		mirko.setStipendio(38739);
		mirko.setNome("Carmelo");
		DipendenteController.raiseSalary(marco, 0.24);
	}

}
