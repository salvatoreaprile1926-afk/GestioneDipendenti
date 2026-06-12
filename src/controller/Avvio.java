import view.*;
import controller.*;
import repository.*;

public class Avvio {

	public static void main(String[] args) {

		VistaUtilita vistaUtilita = new VistaUtilita();

		DipendenteService dipendenteService = new DipendenteService();
		RuoloService ruoloService = new RuoloService();
		TitoloService titoloService = new TitoloService();


		DipendenteController dipendenteController = new DipendenteController(dipendenteService, titoloService, ruoloService, vistaUtilita);
		RuoloAziendaleController ruoloController = new RuoloAziendaleController(ruoloService, vistaUtilita);
		TitoloStudioController titoloController = new TitoloStudioController(titoloService, vistaUtilita);

		int scelta;
		do {
			vistaUtilita.menuPrincipale();
			scelta = vistaUtilita.leggiIntero("Scegli: ");
			switch(scelta) {
			case 1:
				dipendenteController.avvia();
				break;
			case 2:
				ruoloController.avvio();
				break;
			case 3:
				titoloController.avvio();
				break;
			case 4:
				vistaUtilita.visualizzaMessaggio("Programma Terminato");
				break;
			default:
				vistaUtilita.visualizzaMessaggio("Scelta non valida");
			}

		}
		while(scelta != 4 );
	}



}
