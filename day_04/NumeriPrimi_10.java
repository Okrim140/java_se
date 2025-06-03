package day_04;

import java.util.Scanner;

/*
 * Esercizio_10: Verifica se un numero è primo
Scrivi un programma Java che verifica se un numero dato è primo o meno.
 */

public class NumeriPrimi_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero intero maggiore di 1: ");
		int numero = input.nextInt();
		
		boolean primo = false;
		
		if (numero <= 1) {
			primo = false;
		}else {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {    // 4/2 = 2 resto = 0 es. 5/2 = 2 resto 1
					primo = false;
					break;
				}
			}
		}
		System.out.println("Il numero: " + numero + (primo? "è primo" : "non è primo"));
		input.close();
}
}
