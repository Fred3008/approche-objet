package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	private double salaire;

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this .salaire;
	}

	@Override
	public String getStatus() {
		
		return "CDI";
	}

}
