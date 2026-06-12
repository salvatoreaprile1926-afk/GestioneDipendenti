package repository;

import java.util.ArrayList;
import model.TitoloStudio;

public class TitoloService {

	ArrayList<TitoloStudio> titoli = new ArrayList<>();
	
	public void inserisciDipendente(TitoloStudio titolo) {
		titoli.add(titolo);
	}
	
	public ArrayList<TitoloStudio> leggiTitolo(){
		return titoli;
	}
	
	public TitoloStudio cercaPerId(int id) {
		for( TitoloStudio titolo: titoli) {
			if(titolo.getId()==id) {
				return titolo;
				}
			
			}
		return null;
	}
}