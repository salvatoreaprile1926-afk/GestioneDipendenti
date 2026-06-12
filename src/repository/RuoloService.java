package repository;

import java.util.ArrayList;

import model.RuoloAziendale;

public class RuoloService {
	ArrayList<RuoloAziendale> ruoli = new ArrayList<>();

	public void inserisciRuolo(RuoloAziendale ruolo) {
		ruoli.add(ruolo);
	}

	//serve a restituire le persone salvate nella arraylist persone, diventa l'indirizzo di memoria dell'arraylist persone
	public ArrayList<RuoloAziendale> leggiRuolo(){
		return ruoli;
	}

	public RuoloAziendale cercaPerId(int id) {
		for (RuoloAziendale ruolo : ruoli) {
			if(ruolo.getId()==id) {
				return ruolo;
			}

		}
		return null;
	}
}
