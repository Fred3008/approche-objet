package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps",1),ETE("Ete",2),AUTOMNE("Automne",3),Hiver("Hiver",4);
	
	private String libelle;
	private int ordre;
	
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}
	public String toString() {
		return libelle + " " + ordre;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public int getOrdre() {
		return ordre;
	}
	public static Saison getBylibelle(String libelle) {

		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}

		return null;
	}
	
}
