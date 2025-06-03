package day_03;

import java.util.Scanner;

/*
 * Esercizio_02
Calcolo del valore assoluto di un numero
Implementa un programma che chieda all'utente di inserire un numero e
calcoli il suo valore assoluto utilizzando il metodo abs() della classe Math.

 */

public class ValoreAssoluto_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci il numero da calcorare il valore assoluto");
		double numero = input.nextDouble();
		double valoreassoluto = Math.abs(numero);
		System.out.println("Il valore assoluto e: " +  valoreassoluto);
		input.close();

	}

}
