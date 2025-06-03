package day_06;

import java.util.Scanner;

/*
 * La Congettura di Collatz o problema 3x+1 può essere riassunta come segue:
Prendi qualsiasi numero intero positivo n. Se n è pari, dividi n per 2 per ottenere n / 2. Se n è
dispari, moltiplicare n per 3 e aggiungere 1 per ottenere 3n + 1. Ripetere il processo
indefinitamente. La congettura afferma che non importa con quale numero inizi, alla fine
raggiungerai sempre 1.
Dato un numero n, restituire il numero di passi necessari per raggiungere 1.
Esempi
A partire da n = 12, i passaggi sarebbero i seguenti:
12
6
3
10
5
16
8
4
2
1
Risultante in 9 passaggi. Quindi per l'input n = 12, il valore restituito sarebbe 9.

 */

public class CongettureDiCollatz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int numero = input.nextInt();

		int contatore = 0;

		while (numero > 1) {
			contatore++;
			if (numero % 2 == 0) {
				numero = numero / 2;
			} else {
				numero = numero * 3 + 1;
			}
			System.out.println(numero);
		}
		System.out.println(contatore); //questo se vogliamo contare quante volte
		// effettua il calcolo
		input.close();

	}

}
