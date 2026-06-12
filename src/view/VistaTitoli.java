package view;

import java.util.ArrayList;

import model.RuoloAziendale;
import model.TitoloStudio;

public class VistaTitoli {

	private VistaUtilita vistaUtilita;

	public void menuTitoli() {
		System.out.println("#### MENU TITOLI DI STUDIO ####");
		System.out.println("1) Inserisci ");
		System.out.println("2) Visualizza ");
		System.out.println("3) Cerca ");
		System.out.println("4) Ritorna al Menu Principale");
		System.out.println("##############");
		System.out.println();
	}

	public void mascheraInserimento (TitoloStudio titolo) {
		titolo.setId(vistaUtilita.leggiIntero("ID: "));
		titolo.setTitoloStudio(vistaUtilita.leggiStringa("Titolo di Studio: "));
	}
	
	public void scheda (TitoloStudio titolo) {
		System.out.println("\nID: " + titolo.getId() +
				"\nRuolo: " + titolo.getTitoloStudio());
	}
	
	public void visualizza(ArrayList<TitoloStudio> titoli) {
		if (titoli.isEmpty()) {
			System.out.println("Nessuna titolo di studio inserito.");
		} else {
			for (int i = 0; i < titoli.size(); i++) {
				scheda(titoli.get(i));

				System.out.println("------------------");
			}
		}
	
	}
	
	public VistaTitoli(VistaUtilita vistaUtilita) {
		this.vistaUtilita=vistaUtilita;
	}
	

}
