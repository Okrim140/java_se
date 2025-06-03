package day_04;

import java.util.Scanner;

/*
 * Esercizio_04: Inversione di una stringa
Scrivi un programma Java che inverte una stringa data.
 */

public class Inversione_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String frase = scanner.nextLine();
//ciao
//0123
		for (int i = frase.length() -1; i > -1; i--) {
			System.out.print(frase.charAt(i));
			scanner.close();
		}
	}

}
