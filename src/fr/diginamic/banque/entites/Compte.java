package fr.diginamic.banque.entites;

public class Compte {
	
	private long  numero;
	private double  solde;
	
	
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [numeroDeCompte = " + numero + ", soldeDuCompte = " + solde + " ]";
	}
	
	
	

}
