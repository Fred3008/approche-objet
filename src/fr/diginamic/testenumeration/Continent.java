package fr.diginamic.testenumeration;

public enum Continent {

	ASIE("Asie", 1), AMERIQUE("Amerique", 2), AFRIQUE("Afrique", 3), EUROPE("Europe", 4), Oceanie("Oceanie", 5);

	private String libelle;
	private int ordre;

	private Continent(String libelle, int ordre) {
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

	
}
