package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;
import fr.diginamic.maison.Cuisine;

public class TestMaison {

	public static void main(String[] args) {

		Maison maison = new Maison();

		maison.ajouterPiece(new Chambre(12.2, 0));
		maison.ajouterPiece(new Salon(23.2, 0));
		maison.ajouterPiece(new Wc(2.3, 0));
		maison.ajouterPiece(new SalleDeBain(10.2, 0));
		maison.ajouterPiece(new SalleDeBain(10.2, 1));
		maison.ajouterPiece(new Cuisine(13.2, 0));
		maison.ajouterPiece(new Chambre(15.3, 1));
		maison.ajouterPiece(new Chambre(18.1, 1));
		maison.ajouterPiece(new Salon(38.3, 1));

		System.out.println("Superficie Totale: " + maison.superficieTotal()+"m2");
		System.out.println("Superficie des chambre: " + maison.superficieTypePiece(Piece.TYPE_CHAMBRE)+"m2");
		System.out.println("Superficie de l'etage 0: " + maison.superficieEtage(1)+"m2");
		System.out.println("Superficie de l'etage 1: " + maison.superficieEtage(1)+"m2");
		System.out.println("Superficie Salon: " + maison.superficieTypePiece(Piece.TYPE_SALON)+"m2");
		System.out.println("Superficie Salle de Bain: " + maison.superficieTypePiece(Piece.TYPE_SALLEDEBAIN)+"m2");
		System.out.println("Superficie Cuisine: " + maison.superficieTypePiece(Piece.TYPE_CUISINE)+"m2");
		System.out.println("Superficie wc: " + maison.superficieTypePiece(Piece.TYPE_WC)+"m2");
	}

}
