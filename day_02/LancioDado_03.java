package day_02;

/*
Gioco del lancio del dado
Traccia: Scrivi un programma Java che simuli il lancio di un dado a sei facce.
Il programma dovrà generare casualmente un numero compreso tra 1 e 6 e
stamparlo a schermo.

 */

import java.util.Random;

public class LancioDado_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int risultato = random.nextInt(6) +1 ;
		System.out.println("hai rollato: " + risultato);
		

	}

}
