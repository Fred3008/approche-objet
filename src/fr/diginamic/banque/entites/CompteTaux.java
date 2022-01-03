package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double taux;
	private long numero;
	private double solde;
	

	public CompteTaux(double taux, long numero, double solde) {
		super();
		this.taux = taux;
		

	}
	
	

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSold() {
		return solde;
	}

	public void setSold(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "CompteTaux =  % " + getTaux() + " numero = " + getNumero() + " sold = " + getSold() + "]";
	}

}
