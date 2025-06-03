package day_03;

import java.util.Scanner;

/*
 *Calcolo dell'area di un trapezio
Implementa un programma che chieda all'utente di inserire la lunghezza
delle basi e l'altezza di un trapezio e calcoli la sua area utilizzando le
formule geometriche.

 */
public class AreaTrapezio_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Inserisci la  base maggiore ");
		double B = input.nextDouble();
		
		System.out.print("Inserisici la base minore ");
		double b = input.nextDouble();
		
		System.out.print("Inserisci l'altezza ");
		double h = input.nextDouble();
		
		double area =(( b + B) * h) / 2;
		System.out.println("l'area del trapezio è: " + area);
		
		input.close();

	}

}
