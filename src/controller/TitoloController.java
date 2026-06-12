package controller;


import model.TitoloStudio;
import repository.TitoloService;
import view.VistaTitoli;
import view.VistaUtilita;

public class TitoloStudioController {

	private TitoloService titoloService;
	private VistaUtilita vistaUtilita;

	public TitoloStudioController(TitoloService titoloService, VistaUtilita vistaUtilita) {
		this.titoloService = titoloService;
		this.vistaUtilita = vistaUtilita;
	}

	public void avvio() {
		int scelta;
		TitoloStudio titolo;
		VistaTitoli vistaTitoli = new VistaTitoli(vistaUtilita);
		do {
			vistaTitoli.menuTitoli();
			scelta=vistaUtilita.leggiIntero("Scegli: ");
			switch(scelta) {
			case 1:
				titolo = new TitoloStudio();
				vistaTitoli.mascheraInserimento(titolo);
				titoloService.inserisciTitolo(titolo);
				vistaUtilita.visualizzaMessaggio("Titolo inserito correttamente.");
				vistaUtilita.leggiStringa("Premi un tasto per Continuare.");
				break;
			case 2:
				vistaTitoli.visualizza(titoloService.leggiTitolo());
				vistaUtilita.leggiStringa("Premi un tasto per Continuare.");
				break;
			case 3:
				int id = vistaUtilita.leggiIntero("Inserisci ID da cercare: ");
				TitoloStudio trovato = titoloService.cercaPerId(id);
				if (trovato != null)
					vistaTitoli.scheda(trovato);
				else
					vistaUtilita.visualizzaMessaggio("Titolo non trovato.");
					vistaUtilita.leggiStringa("Premi un tasto per Continuare.");
					break;
			case 4:
				vistaUtilita.visualizzaMessaggio("Ritorno al menu principale.");
				break;	
			default:
				vistaUtilita.visualizzaMessaggio("Scelta non valida");

			}

		}
		while(scelta != 4);
	}

}
