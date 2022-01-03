package tri;

public class Ville implements Comparable<Ville> {

	
	private String nom;
	private int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;

	}

	@Override
	public int compareTo(Ville autre) {

		if (this.nbHabitants < autre.getNbHabitants()) {
			return 1;
		} else if (this.nbHabitants > autre.getNbHabitants()) {
			return -1;
		} else {

		}
		return 0;

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

	@Override
	public String toString() {
		return "ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}

}
