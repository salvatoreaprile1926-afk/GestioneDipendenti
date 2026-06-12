package repository;

import java.util.ArrayList;
import model.Dipendente;

public class DipendenteService {

	private ArrayList<Dipendente> dipendenti = new ArrayList<>();

	public void inserisciDipendente(Dipendente dipendente) {
		dipendenti.add(dipendente);
	}

	// Serve a restituire i dipendenti salvati nell'arraylist dipendenti
	public ArrayList<Dipendente> leggiDipendente(){
		return dipendenti;
	}

	public Dipendente cercaPerId(int id) {
		for (Dipendente dipendente : dipendenti) {
			if(dipendente.getId() == id) {
				return dipendente;
			}
		}
		return null;
	}

	// METODO AGGIUNTO PER L'ELIMINAZIONE
	public void eliminaDipendente(Dipendente dipendente) {
		dipendenti.remove(dipendente);
	}

	// NUOVO METODO PER LA MODIFICA
	public void modificaDipendente(Dipendente dipCopia) {
		Dipendente originale = cercaPerId(dipCopia.getId());
		if (originale != null) {
			originale.setNome(dipCopia.getNome());
			originale.setCognome(dipCopia.getCognome());
			originale.setLuogoNascita(dipCopia.getLuogoNascita());
			originale.setDataNascita(dipCopia.getDataNascita());
			originale.setCodiceFiscale(dipCopia.getCodiceFiscale());
			originale.setSesso(dipCopia.getSesso());
			originale.setStipendio(dipCopia.getStipendio());
			originale.setIdTitolo(dipCopia.getIdTitolo());
			originale.setIdRuolo(dipCopia.getIdRuolo());
		}
	}
	
	// METODO PER CERCARE I DIPENDENTI TRAMITE IL NOME
//	public ArrayList<Dipendente> cercaPerNome(String nomeCercato){
//		// Creiamo una lista vuota per contenere i dipendenti trovati
//		ArrayList<Dipendente> risultati = new ArrayList<>();
//		
//		// Scorriamo tutti i dipendenti nel nostro archivio
//		for (Dipendente dipendente : dipendenti) {
//			// Usiamo equalsIgnoreCase così trova il nome sia se scritto maiuscolo che minuscolo
//			if (dipendente.getNome().equalsIgnoreCase(nomeCercato)) {
//					risultati.add(dipendente); // Trovato! Lo aggiungiamo alla lista dei risultati
//	
//			}
//		}
		// Restituiamo la lista (sarà vuota se non ha trovato nessuno)
//		return risultati;
//	}
	
	//NUOVO METODO: FILTRO PER NOME (Trova anche corrispondenze parziali)
	public ArrayList<Dipendente> filtraPerNome (String lettereCercate){
			ArrayList<Dipendente> risultati = new ArrayList<>();
			
			
			// Trasformiamo la stringa cercata in minuscolo per non fare confusione tra MAIUSCOLE e minuscole
			String ricercaMinuscola = lettereCercate.toLowerCase();
			
			for (Dipendente dipendente : dipendenti) {
				// Prendiamo il nome del dipendente, lo trasformiamo in minuscolo e vediamo se CONTIENE le lettere cercate
				if (dipendente.getNome().toLowerCase().contains(ricercaMinuscola)) {
						risultati.add(dipendente); // Se le contiene, lo aggiungiamo ai risultati
				}
			}
			
			return risultati;
	}
	
	}
