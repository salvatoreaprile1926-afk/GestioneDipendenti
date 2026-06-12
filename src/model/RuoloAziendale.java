package model;

public class RuoloAziendale {
	private int id;
	private String ruolo;
	
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getRuolo() {
		 return ruolo;
	 }
	 public void setRuoloAziendale(String ruolo) {
		 this.ruolo = ruolo;
	 }
	 
	 public RuoloAziendale() {}
	 
	 public RuoloAziendale(int id, String ruolo) {
		this.id = id;
		this.ruolo = ruolo;
	 }
	 public RuoloAziendale(RuoloAziendale ruolo) {
			this.id = ruolo.id;
			this.ruolo = ruolo.ruolo;
	 }	 
	 
}