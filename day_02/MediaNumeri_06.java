package day_02;

import java.util.Scanner;

/*
 * Esercizio_06
Calcolo della media di tre numeri
Traccia: Scrivi un programma Java che chieda all'utente di inserire tre
numeri e stampi la loro media.

 */

public class MediaNumeri_06 {

	// (double): questo si chiama cast, nel calcolo la parte dopo la virgola viene
	// persa perche vengono calcolati come interi aggiungendo questo cast recuperi
	// il calcolo con la virgola.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci il primo numero: ");
		int numero1 = input.nextInt();
		System.out.println("inserisci il secondo numero: ");
		int numero2 = input.nextInt();
		System.out.println("inserisci il terzo numero: ");
		int numero3 = input.nextInt();
		double media = (double) (numero1 + numero2 + numero3) / 3;
		System.out.println("La media dei 3 numeri è: " + media);
		input.close();

	}

}
