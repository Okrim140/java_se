package day_02;

import java.util.Scanner;

/*
 * Conversione di temperatura
Traccia: Scrivi un programma Java che chieda all'utente di inserire una
temperatura in gradi Celsius e stampi la corrispondente temperatura in
gradi Fahrenheit. Utilizza la formula: Fahrenheit = Celsius * 9/5 + 32.

 */

public class GradiFahrenheit_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci la temperatura in gradi Celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = celsius * 9/5 + 32;
		System.out.println("L'equivalente della temperatura in Fahrenheit è: " + fahrenheit);
		input.close();
	}

}
