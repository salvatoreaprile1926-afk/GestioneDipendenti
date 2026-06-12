package controller;

import repository.RuoloService;
import repository.TitoloService;
import view.VistaRuoli;
import view.VistaTitoli;
import view.VistaUtilita;

public class RuoloController {
	
	private RuoloService ruoloService;
	private VistaRuoli vistaRuoli;
	private VistaUtilita vistaUtilita;
	
	public RuoloController (RuoloService ruoloService, VistaRuoli vistaruoli, VistaUtilita vistaUtilita) {
		
		this.ruoloService = ruoloService;
	    this.vistaRuoli = vistaRuoli;
	    this.vistaUtilita = vistaUtilita;
	}
}
