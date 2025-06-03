package day_03;

import java.util.Scanner;

/*
 * Esercizio_03
Verifica se un numero è pari o dispari
Implementa un programma che chieda all'utente di inserire un numero
intero e verifichi se è pari o dispari utilizzando l'operatore modulo.

 */
public class NumeriParioDispari_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int numero = input.nextInt();
		if (numero % 2 == 0) {
			System.out.println("il numero " + numero + " è pari");
		} else {
			System.out.println("il numero " + numero + " è dispari " );
		}
		input.close();
	}	
}
