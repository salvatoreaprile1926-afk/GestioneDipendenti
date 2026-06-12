package controller;

import model.RuoloAziendale;
import repository.RuoloService;
import view.VistaRuoli;
import view.VistaUtilita;

public class RuoloAziendaleController {

	private RuoloService ruoloService;
	private VistaUtilita vistaUtilita;

	public RuoloAziendaleController(RuoloService ruoloService, VistaUtilita vistaUtilita) {
		this.ruoloService = ruoloService;
		this.vistaUtilita = vistaUtilita;
	}

	public void avvio () {
		int scelta;
		RuoloAziendale ruolo;
		VistaRuoli vistaRuoli = new VistaRuoli(vistaUtilita);
		do {
			vistaRuoli.menuRuoli();;
			scelta=vistaUtilita.leggiIntero("Scegli: ");
			switch(scelta) {
			case 1:
				ruolo = new RuoloAziendale();
				vistaRuoli.mascheraInserimento( ruolo);
				ruoloService.inserisciRuolo(ruolo);
				vistaUtilita.visualizzaMessaggio("Ruolo inserito correttamente.");
				vistaUtilita.leggiStringa("Premi un tasto per Continuare.");
				break;
			case 2:
				vistaRuoli.visualizza(ruoloService.leggiRuolo());
				vistaUtilita.leggiStringa("Premi un tasto per Continuare.");
				break;
			case 3:
				int id = vistaUtilita.leggiIntero("Inserisci ID da cercare: ");
				RuoloAziendale trovato = ruoloService.cercaPerId(id);
				if (trovato != null)
					vistaRuoli.scheda(trovato);
				else
					vistaUtilita.visualizzaMessaggio("Ruolo non trovato.");
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
