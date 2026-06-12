package view;

import model.Dipendente;
import java.util.Scanner;
import model.TitoloStudio;
import model.RuoloAziendale;
import java.util.ArrayList;

public class VistaDipendenti {
	
	private Scanner scanner;
	
	public int menuDipendenti() {
		System.out.println("#### MENU DIPENDENTE ####");
		System.out.println("1) Gestisci ");
		System.out.println("2) Visualizza ");
		System.out.println("3) Cerca ");
		System.out.println("4) Ritorna al Menu Principale");
		System.out.println("##############");
		System.out.println();
		
		int scelta = scanner.nextInt();
	    scanner.nextLine(); // Pulisce il canale
		
		return scelta;
	}
	
	public void mascheraInserimento (
			VistaUtilita vistaUtilita,
			ArrayList<TitoloStudio> titoli,
			ArrayList<RuoloAziendale> ruoli,
			Dipendente dipendente
			) {
		
		dipendente.setId(vistaUtilita.leggiIntero("ID: "));
		dipendente.setNome(vistaUtilita.leggiStringa("Nome: "));
		dipendente.setCognome(vistaUtilita.leggiStringa("Cognome: "));
		dipendente.setLuogoNascita(vistaUtilita.leggiStringa("Luogo di Nascita: "));
		dipendente.setDataNascita(vistaUtilita.leggiStringa("Datab di Nascita: "));
		dipendente.setCodiceFiscale(vistaUtilita.leggiStringa("Codice Fiscale: "));
		dipendente.setSesso(vistaUtilita.leggiStringa("Sesso: "));
		dipendente.setStipendio(vistaUtilita.leggiDecimale("Stipendio: "));
		
			System.out.println("---- SCEGLI TITOLO DI STUDIO ----");
				
				for (TitoloStudio titolo : titoli) {
					System.out.println(titolo.getId() + " - "+ titolo.getTitolo());
				}
				int idTitolo = vistaUtilita.leggiIntero("Inserisci ID titolo scelto: ");
				dipendente.setIdTitolo(idTitolo);
				
			System.out.println("---- SCEGLI RUOLO AZIENDALE ----");
				
				for (RuoloAziendale ruolo : ruoli) {
					System.out.println(ruolo.getId() + " - "+ ruolo.getRuolo());
				}
				int idRuolo = vistaUtilita.leggiIntero("Inserisci ID ruolo scelto: ");
				dipendente.setIdRuolo(idRuolo);
				
				
	}
				
	}


