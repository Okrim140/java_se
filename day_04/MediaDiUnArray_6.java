package day_04;

/*
 * Esercizio_06: Calcolo della media di un array
Scrivi un programma Java che calcola la media dei valori presenti in un
array di numeri in virgola mobile (double).
 */

public class MediaDiUnArray_6 {

	public static void main(String[] args) {

		// primo modo per dichiarare un array
		double[] numeri = { 10.15, 15.2, 10.1 };

		// secondo modo di dichiarare gli array
		double[] numeri1 = new double[5];

		numeri1[0] = 15.00;
		numeri1[1] = 10.2;
		numeri1[2] = 21.34;
		numeri1[3] = 53.3;
		numeri1[4] = 234.6;
		
		
		double somma = 0;
		for (int i = 0; i < numeri.length; ++i) {
			somma += numeri1[i];// somma = somma + numeri [i];
		}
			double media = somma /numeri.length;
			System.out.println("media arrai: " + media);


	}

}
