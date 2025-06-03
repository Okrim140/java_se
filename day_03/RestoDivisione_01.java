package day_03;

import java.util.Scanner;

/*
 * Esercizio_01
Calcolo del resto della divisione tra due numeri
Implementa un programma che chieda all'utente di inserire due numeri e
calcoli il resto della divisione tra il primo numero e il secondo numero
utilizzando l'operatore modulo.

 */

public class RestoDivisione_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("inserisci il primo numero: ");
		int numero1 = input.nextInt();
		System.out.println("per quale numero vuoi dividerlo? ");
		int numero2 = input.nextInt();
		//operatore  modulo % restituisce il resto della divisione es. 5 % 2 = 1
		double resto = numero1 % numero2;
		System.out.println("il resto tra" + numero1 + "e" + numero2 + "è" + resto);
		input.close();
	}

}
