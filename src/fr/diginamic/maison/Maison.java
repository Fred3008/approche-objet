
package fr.diginamic.maison;

public class Maison {

	/** pieces : tableau de pièces de la maison */

	private Piece[] pieces;

	// Initialisation du tableau de pièces
	public Maison() {
		pieces = new Piece[0];
	}

	public void ajouterPiece(Piece nvPiece) {

		// agrandir le tableau initial de 1 à chaque ajout
		// d'une nouvelle pièce

		// On commence donc par créer un tableau temporaire appelé newPiece
		// qui a une taille égale au tableau du tableau pieces+1

		Piece[] newPiece = new Piece[pieces.length + 1];

		// On déverse toutes les pièces du tableau pieces dans newPiece
		for (int i = 0; i < pieces.length; i++) {
			newPiece[i] = pieces[i];
		}

		// On place en dernière position dans le nouveau tableau la nouvelle
		// pièce
		newPiece[newPiece.length -1] = nvPiece;

		// Enfin on affecte newPiece a pieces
		this.pieces = newPiece;

	}

// retourne la superficie d'un etage
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			if(choixEtage == this.pieces[i].getNumEtage()) {
				superficieEtage = superficieEtage + this.pieces[i].getSuperficie();
			}
		}

		return superficieEtage;

	}
//	Retourne la superficie total pour un type de pièce donné
//	type de pièce

	public double superficieTypePiece(String typePiece) {
		double superficie = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			if(typePiece != null && typePiece.equals(this.pieces[i].getType())){
				superficie = superficie + this.pieces[i].getSuperficie();
				
			}
			
		
			
		}
		return superficie;
	
		
}
		
		// retourne la supercie total
		public double superficieTotal() {
			double superficieTot = 0;
			for (int i = 0; i < pieces.length; i++) {
				superficieTot = superficieTot + this.pieces[i].getSuperficie();
			}

			return superficieTot;

	}
}
