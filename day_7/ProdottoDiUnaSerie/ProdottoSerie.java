package day_7.ProdottoDiUnaSerie;

import java.util.Scanner;

public class ProdottoSerie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una sequenza di cifre: ");
		String input = scanner.nextLine();
		
		System.out.println("Inserisci la lunghezza della sottostring(span): ");
		int span = scanner.nextInt();
		int prodotto = 1;
		int maxProdotto = 0;
		String serieTrovata = "";
		String serie = "";
		// 12345
		// es. numero di span = 1*2, 2*3, 3*4, 4*5
		// se numero sottostringa 3 = 1*2*3, 2*3*4, 3*4*5
		// sono i numeri 63915, quindi quello sopra con span 3: 6*3*9, 3*9*1, 9*1*5
		for(int i = 0; i <= input.length() - span; i++) {
			serie  = input.substring(i, i + span);
			prodotto = 1;
			for(char c : serie.toCharArray())  {  //converte la stringa in un arrey di caratteri  [6][3][9]
				if(!Character.isDigit(c)) { // c = 6 (controlla)
					throw new IllegalArgumentException("Contiene caratteri non numerici."); /// simile ad una syso ma da un errore al posto di una syso

				}
				prodotto = prodotto * (c - '0');   //se vogliamo fare il calcolo in caratte ri ascii 
				//prodotto = prodotto * Integer.parseInt(serie, i);
			}
			if(maxProdotto < prodotto) {
				maxProdotto = prodotto;
				serieTrovata = serie;
		}
		}
		System.out.println("Serie con prodotto piu grande: " + serieTrovata);
		System.out.println("Il prodotto piu grande della serie e: " + prodotto);
		scanner.close();
		
	}

}
