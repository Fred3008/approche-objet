package maps;

public class Pays {
	
	private String nom;
	private int nbHabitants;
	private String Continent;
	
	public Pays(String nom, int nbHabitants, String continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		Continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public String getContinent() {
		return Continent;
	}

	public void setContinent(String continent) {
		Continent = continent;
	}

}
