package day_02;

import java.util.Scanner;

/*
 * Calcolo dell'area di un rettangolo
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire
 * lalunghezza e la larghezza di un rettangolo e stampi l'area corrispondente.

 */

public class AreaRettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci la base del rettangolo");
		double base = input.nextDouble();
		System.out.println("Inserisci l'altezza del rettangolo");
		double altezza = input.nextDouble();
		double area=base*altezza;
		System.out.println("L'area del rett angolo e: " +area);
		input.close();
		
	}

}
