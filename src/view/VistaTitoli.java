package view;

import model.TitoloStudio;

public class VistaTitoli {
	
	VistaUtilita vistaUtilita= new VistaUtilita();

	public void menuTitoli() {
		System.out.println("#### MENU RUOLI AZIENDALI ####");
		System.out.println("1) Gestisci ");
		System.out.println("2) Visualizza ");
		System.out.println("3) Cerca ");
		System.out.println("4) Ritorna al Menu Principale");
		System.out.println("##############");
		System.out.println();
	}
	
	public void mascheraInserimento (TitoloStudio titolo) {
		titolo.setId(vistaUtilita.leggiIntero("ID: "));
		titolo.setTitolo(vistaUtilita.leggiStringa("Titolo Studio: "));
		}
}
 