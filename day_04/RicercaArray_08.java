package day_04;

import java.util.Scanner;

/*
 * Esercizio_08: Ricerca di un elemento in un array
Scrivi un programma Java che ricerca un elemento specifico all'interno di un
array di interi e restituisce la sua posizione (indice).
 */

public class RicercaArray_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] numeri = {10, 47, 24, 85, 35};
		
		System.out.println("Inserisci il numero da cercare: ");
		int numero = input.nextInt();
		
		for (int i=0; i < numeri.length; i++) {
			if (numeri[i] == numero) {
				System.out.println("numero trovato");
			}
		}
	}

}
