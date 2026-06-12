package view;

import java.util.Scanner;

public class VistaUtilita {
	
	private Scanner scanner = new Scanner(System.in);
	
	public int menuPrincipale(String messaggio) {
		System.out.println("#### MENU PRINCIPALE ####");
		System.out.println("1) Gestisci Dipendenti");
		System.out.println("2) Gestisci Ruoli ");
		System.out.println("3) Gestisci Titoli di Studio");
		System.out.println("4) Esci");
		System.out.println("##############");
		System.out.println();
		
		int scelta = scanner.nextInt();
	    scanner.nextLine(); 
	    return scelta;
	}

	public int leggiIntero(String suggerimento) {
		System.out.println(suggerimento);
		Scanner input = new Scanner(System.in);
		return Integer.parseInt(input.nextLine());
	}
	public String leggiStringa(String suggerimento) {
		System.out.println(suggerimento);
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public double leggiDecimale(String suggerimento) {
		System.out.println(suggerimento);
		Scanner input = new Scanner(System.in);
		return Double.parseDouble(input.nextLine());
	}
	
	public void visualizzaMessaggio(String messaggio) {
		System.out.println(messaggio);
	}

}

	