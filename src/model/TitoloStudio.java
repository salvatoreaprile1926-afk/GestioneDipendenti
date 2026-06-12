package model;

public class TitoloStudio {
	
	private int id;
	private String titolo;
	
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getTitolo() {
		 return titolo;
	 }
	 public void setTitolo(String titolo) {
		 this.titolo = titolo;
	 }
	 
	 public TitoloStudio() {}
	 
	 public TitoloStudio(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	 }
	 public TitoloStudio(TitoloStudio titolo) {
			this.id = titolo.id;
			this.titolo = titolo.titolo;
		 }
}
