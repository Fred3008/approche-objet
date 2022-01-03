package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	
	private int nbrJourTravaille;
	private int montantJour;
	
	public Pigiste(String nom, String prenom, int nbrJourTravaille, int montantJour) {
		super(nom, prenom);
		this.nbrJourTravaille = nbrJourTravaille;
		this.montantJour = montantJour;
	}
	@Override
	public double getSalaire() {
		
		return nbrJourTravaille * montantJour;
	}

	@Override
	public String getStatus() {
		
		return "CDD";
	}

	
	
}
	

