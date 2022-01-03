package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int nbInscrits;
	private int capaciteMax;
	private double recetteTotal;

	public Theatre(String nom, int capaciteMax) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;

	}

	public void inscritClients(int nbClient, double prix) {
		if (nbInscrits + nbClient > capaciteMax) {
			System.out.println("vous depassez la limite de place disponible");

		} else if ( nbInscrits  < capaciteMax) {
			System.out.println("des places sont encore disponibles");

		} else {
			nbInscrits += nbClient;
			recetteTotal = recetteTotal + nbClient * prix;
		}

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbInscrits() {
		return nbInscrits;
	}

	public void setNbInscrits(int nbInscrits) {
		this.nbInscrits = nbInscrits;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public double getRecetteTotal() {
		return recetteTotal;
	}

	public void setRecetteTotal(double recetteTotal) {
		this.recetteTotal = recetteTotal;
	}

}
