package controller;

import repository.DipendenteService;
import repository.RuoloService;
import repository.TitoloService;
import view.VistaDipendenti;
import view.VistaTitoli;
import view.VistaUtilita;

public class TitoloController {
	
	private TitoloService titoloService;
	private VistaTitoli vistaTitoli;
	private VistaUtilita vistaUtilita;
	
	public TitoloController (TitoloService titoloService, VistaTitoli vistaTitoli, VistaUtilita vistaUtilita) {
		
	    this.titoloService = titoloService;
	    this.vistaTitoli = vistaTitoli;
	    this.vistaUtilita = vistaUtilita;
}
}
