package controller;

import repository.DipendenteService;
import repository.TitoloService;
import repository.RuoloService;
import view.VistaDipendenti;
import view.VistaUtilita;

public class Avvio {
	
	public static void main(String[] args) {
		// 1. CREIAMO LE VISTE (Interfaccia utente)
        VistaUtilita vistaUtilita = new VistaUtilita();
        VistaDipendenti vistaDipendenti = new VistaDipendenti();

        // 2. CREIAMO I SERVIZI (Logica e gestione dati)
        DipendenteService dipendenteService = new DipendenteService();
        TitoloService titoloService = new TitoloService();
        RuoloService ruoloService = new RuoloService();
        
        // 3. CREIAMO IL CONTROLLER PRINCIPALE
        // Passiamo tutti i servizi e le viste al costruttore del DipendenteController
        DipendenteController dipendenteController = new DipendenteController(
            dipendenteService, 
            titoloService, 
            ruoloService, 
            vistaDipendenti, 
            vistaUtilita
        );
        
        // Se hai creato anche gli altri due controller (Titolo e Ruolo), 
        // in futuro potrai istanziarli qui sotto nello stesso modo.

        // 4. ACCENDIAMO IL PROGRAMMA
        vistaUtilita.mostraMessaggio("=== Benvenuto nel Sistema Gestionale 2026 ===");
        
        // Facciamo partire il ciclo del menu principale
        dipendenteController.avvia(); 
        
        // Quando l'utente decide di uscire dal menu, il programma arriverà qui e si chiuderà
        vistaUtilita.mostraMessaggio("Applicazione chiusa correttamente. Arrivederci!");
	}
	
}
