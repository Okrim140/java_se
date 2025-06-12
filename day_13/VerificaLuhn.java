package day_13;

import java.util.Scanner;

public class VerificaLuhn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una sequenza di numerrica intera di 16 cifre: ");
		String numeri = input.nextLine();
		numeri = numeri.replace(" ","");
		numeri = numeri.replace("-","");
		int somma = 0;
		
		for (int i =  numeri.length()-1; i >= 0; i--) {
			int prodotto = (numeri.charAt(i)  - '0');
			if(i % 2 == 0) { 			//identifica i numeri pari					// != diverso
				prodotto = prodotto * 2;
				if (prodotto > 9) {
					prodotto = prodotto - 9;
				}
			}
			somma = somma + prodotto;
		}
		if (somma % 10 == 0) {
			System.out.println("Numero di Luhn valido");
			}
		else {
			System.out.println("Numero di Luhn non valido");
			}
		}

	}


