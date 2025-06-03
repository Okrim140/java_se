package day_04;

/*
 * Scrivi un programma Java che calcola il fattoriale di un numero dato.
es. 9! = 9*8*7*6*5*4*3*2*1
 */

public class FattorialeDiUnNumero_09 {
	int numero = 2;

	public static void main(String[] args) {
			System.out.println("fattoriale del numero" + numero + " : " + fattoriale(2));
	}

	// risoluzione del problema con metodo iterativo

	public static int fattoriale(int num) { // num si chiama parametro formale
		int fat = 1;
		// if (num <= 1 and num >= 0) {
		// return 1;
		// }
		for (int i = 1; i <= num; i++) {
			fat *= num; // sarebbe come scrivere fat = fat*num
		}
		return fat;

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("inserisci un numero");
		// int numero = scanner.nextInt();
		//
		// int fattoriale = 1;
		// for (int i = numero; i <= numero; numero--) {
		// fattoriale = numero * risultato;
		// System.out.println("il fattoriale di " + numero + " è " + fattoriale);
		// scanner.close();
	}

}
