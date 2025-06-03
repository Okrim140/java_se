package day_04;

/*
Scrivi un programma Java che verifica se una stringa data è un palindromo
(cioè se può essere letta allo stesso modo da destra a sinistra e viceversa)
 */

import java.util.Scanner;

public class Palindromo_03 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Inserisci una frase");
			String frase = scanner.nextLine();
//radar
//01234	
			for (int i = 0; i < frase.length() / 2; i++) {
				if (!(frase.charAt(i) == frase.charAt(frase.length() - 1 - i))) {
					System.out.println("la frase non è palindroma");
					return;
				}
			}
			System.out.println("la frase è palindroma");
		}

	}
}
