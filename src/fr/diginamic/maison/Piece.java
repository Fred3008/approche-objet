package fr.diginamic.maison;

public abstract class Piece {

	
	private double superficie;
	private double numEtage;

	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.numEtage = etage;
	}

	public static final String TYPE_CHAMBRE = "Chambre";

	public static final String TYPE_SALON = "Salon";

	public static final String TYPE_CUISINE = "Cuisine";

	public static final String TYPE_WC = "Wc";

	public static final String TYPE_SALLEDEBAIN = "Salle de bain";
	
	public abstract String getType();

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

}
