package view;

import model.Dipendente;
import model.DipendenteDto;
import model.RuoloAziendale;
import model.TitoloStudio;
import java.util.ArrayList;

public class VistaDipendenti {

	public void menuDipendenti() {
		System.out.println("#### MENU DIPENDENTI ####");
		System.out.println("1) Inserisci ");
		System.out.println("2) Visualizza DAO");
		System.out.println("3) Visualizza DTO ");
		System.out.println("4) Cerca ");
		System.out.println("5) Elimina "); 
		System.out.println("6) Modifica "); // NUOVA OPZIONE
		System.out.println("7) Ritorna al Menu Principale"); // SPOSTATO A 7
		System.out.println("##############");
		System.out.println();
	}

	public void mascheraInserimento (
			VistaUtilita vistaUtilita, 
			ArrayList<TitoloStudio> titoli, 
			ArrayList<RuoloAziendale> ruoli, 
			Dipendente dipendente) {

		dipendente.setId(vistaUtilita.leggiIntero("ID: "));
		dipendente.setNome(vistaUtilita.leggiStringa("Nome: "));
		dipendente.setCognome(vistaUtilita.leggiStringa("Cognome: "));
		dipendente.setLuogoNascita(vistaUtilita.leggiStringa("Luogo di Nascita: "));
		dipendente.setDataNascita(vistaUtilita.leggiStringa("Data di Nascita: "));
		dipendente.setCodiceFiscale(vistaUtilita.leggiStringa("Codice Fiscale: "));
		dipendente.setSesso(vistaUtilita.leggiStringa("Sesso (m/f/a): "));
		dipendente.setStipendio(vistaUtilita.leggiDecimale("Stipendio: "));

		System.out.println("----- SCEGLI TITOLO DI STUDIO -----");
		for (TitoloStudio titolo : titoli) {
			System.out.println(titolo.getId() + " - " + titolo.getTitoloStudio());
		}

		int idTitolo;
		boolean titoloValido = false;
		do {
			idTitolo = vistaUtilita.leggiIntero("Inserisci ID titolo scelto: ");
			for (TitoloStudio titolo : titoli) {
				if (titolo.getId() == idTitolo) {
					titoloValido = true;
					break;
				}
			}
			if (!titoloValido) {
				System.out.println("Inserisci un ID valido!");
			}
		} while (!titoloValido);
		dipendente.setIdTitolo(idTitolo);

		System.out.println("----- SCEGLI RUOLO AZIENDALE -----");
		for (RuoloAziendale ruolo : ruoli) {
			System.out.println(ruolo.getId() + " - " + ruolo.getRuoloAziendale());
		}

		int idRuolo;
		boolean ruoloValido = false;
		do {
			idRuolo = vistaUtilita.leggiIntero("Inserisci ID ruolo scelto: ");
			for (RuoloAziendale ruolo : ruoli) {
				if (ruolo.getId() == idRuolo) {
					ruoloValido = true;
					break;
				}
			}
			if (!ruoloValido) {
				System.out.println("Inserisci un ID valido!");
			}
		} while (!ruoloValido);
		dipendente.setIdRuolo(idRuolo);
	}
	
	// AGGIORNATO: Inseriti i parametri per ricevere le liste titoli e ruoli
	public void mascheraModifica(VistaUtilita vistaUtilita, Dipendente dipCopia, ArrayList<TitoloStudio> titoli, ArrayList<RuoloAziendale> ruoli) {
		int scelta;
		do {
			System.out.println("\n--- QUALI CAMPI VUOI MODIFICARE? ---");
			System.out.println("1) Nome (Attuale: " + dipCopia.getNome() +")");
			System.out.println("2) Cognome (Attuale: " + dipCopia.getCognome() +")");
			System.out.println("3) Stipendio (Attuale: " + dipCopia.getStipendio() +")");		
			System.out.println("4) Titolo di Studio (ID Attuale: " + dipCopia.getIdTitolo() + ")");
			System.out.println("5) Ruolo Aziendale (ID Attuale: " + dipCopia.getIdRuolo() + ")");   
			System.out.println("6) Fine modifiche campi");
			
			scelta = vistaUtilita.leggiIntero("Scegli il campo da modificare: ");
			
			switch(scelta) {
			case 1: 
				dipCopia.setNome(vistaUtilita.leggiStringa("Nuovo Nome: "));
				break;
			case 2: 
				dipCopia.setCognome(vistaUtilita.leggiStringa("Nuovo Cognome: "));
				break;
			case 3: 
				dipCopia.setStipendio(vistaUtilita.leggiDecimale("Nuovo Stipendio: "));
				break;
			case 4: 
				System.out.println("---- SCEGLI IL NUOVO TITOLO DI STUDIO ----");
				for (TitoloStudio titolo : titoli) {
					System.out.println(titolo.getId() + " - " + titolo.getTitoloStudio());
				}
				int idTitolo;
				boolean titoloValido = false;
				do {
					idTitolo = vistaUtilita.leggiIntero("Inserisci ID nuovo titolo: ");
					for (TitoloStudio titolo : titoli) {
						if (titolo.getId() == idTitolo) {
							titoloValido = true;
							break;
						}
					}
					if (!titoloValido) {
						System.out.println("Inserisci un ID valido!");
					}
				} while (!titoloValido);
				dipCopia.setIdTitolo(idTitolo);
				break;
				
			case 5: // AGGIORNATO: Aggiunto il caso completo per il ruolo aziendale
				System.out.println("---- SCEGLI IL NUOVO RUOLO AZIENDALE ----");
				for (RuoloAziendale ruolo : ruoli) {
					System.out.println(ruolo.getId() + " - " + ruolo.getRuoloAziendale());
				}
				int idRuolo;
				boolean ruoloValido = false;
				do {
					idRuolo = vistaUtilita.leggiIntero("Inserisci ID nuovo ruolo: ");
					for (RuoloAziendale ruolo : ruoli) {
						if (ruolo.getId() == idRuolo) {
							ruoloValido = true;
							break;
						}
					}
					if (!ruoloValido) {
						System.out.println("Inserisci un ID valido!");
					}
				} while (!ruoloValido);
				dipCopia.setIdRuolo(idRuolo);
				break;
				
			case 6:
				System.out.println("Uscita dalla modifica campi.");
				break;
			default:
				System.out.println("Scelta non valida.");
			}
		} while(scelta != 6);
	}

	public void scheda(Dipendente dipendente) {
		System.out.println(
				"\nID: " + dipendente.getId() +
				"\nNome: " + dipendente.getNome() +
				"\nCognome: " + dipendente.getCognome() +
				"\nLuogo nascita: " + dipendente.getLuogoNascita() +
				"\nData nascita: " + dipendente.getDataNascita() +
				"\nCF: " + dipendente.getCodiceFiscale() +
				"\nSesso: " + dipendente.getSesso() + 
				"\nStipendio: " + dipendente.getStipendio() +
				"\nIdTitolo: " + dipendente.getIdTitolo() +
				"\nIdRuolo: " + dipendente.getIdRuolo() 
				);
	}

	public void visualizza(ArrayList<Dipendente> dipendenti) {
		if (dipendenti.isEmpty()) {
			System.out.println("Nessun dipendente inserito.");
		} else {
			for (int i = 0; i < dipendenti.size(); i++) {
				scheda(dipendenti.get(i));
				System.out.println("------------------");
			}
		}
	}

	public void schedaCompleta(DipendenteDto dipendente) {
		System.out.println(
				"\nID: " + dipendente.getId() +
				"\nNome: " + dipendente.getNome() +
				"\nCognome: " + dipendente.getCognome() +
				"\nLuogo nascita: " + dipendente.getLuogoNascita() +
				"\nData nascita: " + dipendente.getDataNascita() +
				"\nCF: " + dipendente.getCodiceFiscale() +
				"\nSesso: " + dipendente.getSesso() + 
				"\nStipendio: " + dipendente.getStipendio() +
				"\nTitolo: " + dipendente.getTitolo() +
				"\nRuolo: " + dipendente.getRuolo() 
				);
	}

	public void visualizzazioneCompleta(ArrayList<Dipendente> dipendenti, ArrayList<TitoloStudio> titoli, ArrayList<RuoloAziendale> ruoli) {
		if (dipendenti.isEmpty()) {
			System.out.println("Nessun dipendente inserito.");
			return;
		}
		
		for (Dipendente dipendente : dipendenti) {
			DipendenteDto dipDto = new DipendenteDto(); 
			dipDto.setId(dipendente.getId());
			dipDto.setNome(dipendente.getNome());
			dipDto.setCognome(dipendente.getCognome());
			dipDto.setLuogoNascita(dipendente.getLuogoNascita());
			dipDto.setDataNascita(dipendente.getDataNascita());
			dipDto.setCodiceFiscale(dipendente.getCodiceFiscale());
			dipDto.setSesso(dipendente.getSesso());
			dipDto.setStipendio(dipendente.getStipendio());
			
			for(TitoloStudio titolo : titoli) {
				if(titolo.getId() == dipendente.getIdTitolo()) {
					dipDto.setTitolo(titolo.getTitoloStudio());
					break;
				}
			}
			for(RuoloAziendale ruolo : ruoli) {
				if(ruolo.getId() == dipendente.getIdRuolo()) {
					dipDto.setRuolo(ruolo.getRuoloAziendale());
					break;
				}
			}
			schedaCompleta(dipDto);
			System.out.println("------------------");
		}
	}
}
