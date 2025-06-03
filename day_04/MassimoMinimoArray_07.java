package day_04;

/*
 * Esercizio_07: Calcolo del massimo e del minimo in un array
Scrivi un programma Java che calcola il valore massimo e il valore minimo
presenti in un array di interi.
 */

public class MassimoMinimoArray_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeri = new int[5];
		numeri[0] = 16;
		numeri[1] = 15;
		numeri[2] = 78;
		numeri[3] = 35;
		numeri[4] = 345;

		//int min = numeri[0];
		//int min = numeri[0];
		// oppure
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < numeri.length; i++) {
			if (min > numeri[i]) {
				min = numeri[i];
			}
			if (max < numeri[i]) {
				max = numeri[i];
			}
		}
		System.out.println("numeri min e max " + min + "e" + max );

	}

}
