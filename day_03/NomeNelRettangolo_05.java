package day_03;

import java.util.Scanner;

public class NomeNelRettangolo_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome e cognome: ");
		String nome = input.nextLine();
		String base = "+" + "-".repeat(nome.length() + 2) + "+";
		base = base + "\n";
		base = base + "| " +  nome + " |\n";
		base = base + "+" + "-".repeat(nome.length() + 2) + "+";
		System.out.println(base);
		
		input.close();
	}

}
