package view;

import model.RuoloAziendale;

public class VistaRuoli {
	
	VistaUtilita vistaUtilita= new VistaUtilita();

	public void menuRuoli() {
		System.out.println("#### MENU RUOLI AZIENDALI ####");
		System.out.println("1) Gestisci ");
		System.out.println("2) Visualizza ");
		System.out.println("3) Cerca ");
		System.out.println("4) Ritorna al Menu Principale");
		System.out.println("##############");
		System.out.println();
	}
	
	public void mascheraInserimento (RuoloAziendale ruolo) {
		ruolo.setId(vistaUtilita.leggiIntero("ID: "));
		ruolo.setRuoloAziendale(vistaUtilita.leggiStringa("Ruolo Aziendale: "));
		}
	}
