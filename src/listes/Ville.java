package listes;

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
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville) object;
		return this.nom.equals(autre.getNom()) && this.nbHabitants == autre.getNbHabitants() ;
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
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants +  "]";
	}



	

}
