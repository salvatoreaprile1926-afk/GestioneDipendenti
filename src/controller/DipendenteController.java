package controller;

import repository.DipendenteService;
import repository.TitoloService;
import repository.RuoloService;
import view.VistaDipendenti;
import view.VistaUtilita;


public class DipendenteController {
	
	private DipendenteService dipendenteService;
	private TitoloService titoloService;
	private RuoloService ruoloService;
	private VistaDipendenti vistaDipendenti;
	private VistaUtilita vistaUtilita;
	
	public DipendenteController (DipendenteService dipendenteService, TitoloService titoloService, RuoloService ruoloService, 
			VistaDipendenti vistaDipendenti, VistaUtilita vistaUtilita) {
		
		this.dipendenteService = dipendenteService;
	    this.titoloService = titoloService;
	    this.ruoloService = ruoloService;
	    this.vistaDipendenti = vistaDipendenti;
	    this.vistaUtilita = vistaUtilita;
	}

	public void avvia() {
		boolean esci = false;
	
			while (!esci) {
		// 1. Mostriamo il menu e prendiamo la scelta (metodo che dovrà essere nella tua Vista)
				int scelta = vistaDipendenti.menuDipendenti();
		
		// 2. Lo switch-case che decide cosa fare in base al numero premuto
				switch (scelta) {
					case 1:
				// codice per mostrare i dipendenti
				vistaUtilita.menuPrincipale("Hai scelto di vedere i dipendenti");
						break;
					case 2:
				// codice per aggiungere un dipendente
				vistaUtilita.menuPrincipale("Hai scelto di aggiungere un dipendente");
						break;
					case 0:
				vistaUtilita.menuPrincipale("Uscita dal programma...");
						esci = true; // Fa terminare il ciclo while
						break;
					default:
				vistaUtilita.menuPrincipale("Opzione non valida, riprova.");
}
	}
}

}