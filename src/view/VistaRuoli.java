package view;

import java.util.ArrayList;


import model.RuoloAziendale;

public class VistaRuoli {
	
	private VistaUtilita vistaUtilita;


	public void menuRuoli() {
		System.out.println("#### MENU RUOLI AZIENDALI ####");
		System.out.println("1) Inserisci ");
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
	
	public void scheda (RuoloAziendale ruolo) {
			System.out.println("\nID: " + ruolo.getId() +
					"\nRuolo: " + ruolo.getRuoloAziendale());
		}
	
	public void visualizza(ArrayList<RuoloAziendale> ruoli) {
		if (ruoli.isEmpty()) {
			System.out.println("Nessuna ruolo aziendale inserito.");
		} else {
			for (int i = 0; i < ruoli.size(); i++) {
				scheda(ruoli.get(i));

				System.out.println("------------------");
			}
		}
	
	}
	
	public VistaRuoli(VistaUtilita vistaUtilita) {
		this.vistaUtilita=vistaUtilita;
	}
}

