package day_04;

import java.util.Scanner;

/*
 * Esercizio_02: Calcolo del numero di occorrenze di una lettera in
una stringa
Scrivi un programma Java che calcola il numero di occorrenze di una lettera
specificata all'interno di una stringa data.
 */

public class NumeroDiUnaLettera_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una frase: ");
		String frase = scanner.nextLine();

		System.out.println("Inserisci la lettera da contare: ");
		char lettera = scanner.nextLine().charAt(0);

		int conteggio = 0;// imposta il conteggio a 0

		for (int i = 0; i < frase.length(); i++)
		{
			if (frase.charAt(i) == lettera)
			conteggio++;
		}
		System.out.println("la " + lettera + " è presente " + conteggio + " volte all'interno della frase.");
		scanner.close();
	}
}