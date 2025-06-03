package day_04;

import java.util.Scanner;

/*Esercizio_01: Calcolo del numero di parole in una stringa
Scrivi un programma Java che calcola il numero di parole presenti in una
stringa data. Si considera una parola come una sequenza di caratteri
separati da spazi.
*/

public class NumerodiParole_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci una frase");
		String frase = input.nextLine();
		char carattere = ' ';
		boolean interruttore = true;
		int count = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			carattere = frase.charAt(i);
			if (Character.isAlphabetic(carattere) && interruttore) {
				count = count + 1;// Oppure scrivere count++
				interruttore = false;
			} else {
				if (!Character.isAlphabetic(carattere)) {
					interruttore = true;
				}
			}
		}
		System.out.println("Numero Parole che compongono la frase " + count);
		input.close();
	}
}