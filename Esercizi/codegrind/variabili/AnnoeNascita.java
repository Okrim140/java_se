package Esercizi.codegrind.variabili;

public class AnnoeNascita {

	/*
	 * Scrivi un programma Java che dichiara una variabile intera chiamata
	 * "annoDiNascita" e le assegna il valore 1990. Calcola l'età basandoti
	 * sull'anno corrente (supponi che sia il 2023) e stampa il risultato.
	 */

	public static void main(String[] args) {
		int annoDiNascita = 1990;
		int eta = 2023 - annoDiNascita;
		System.out.println("la sua eta e: " + eta);

	}

}
