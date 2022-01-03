package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle creerCercle(double Cercle) {

		Cercle cercle = new Cercle(Cercle);
		return cercle;

	}
}