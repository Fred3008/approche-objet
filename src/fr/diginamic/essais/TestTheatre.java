package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre("Theatre des champs Ellysés", 1200);
		theatre.inscritClients(200, 80);
		theatre.inscritClients(900, 60);
		
		System.out.println("recette " + theatre.getRecetteTotal());
		System.out.println("inscrits " + theatre.getNbInscrits());
	}

}
