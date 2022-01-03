package fr.diginamic.testenumeration;

import java.util.ArrayList;


public class TestContinentAvecEnum {

	public static void main(String[] args) {
	
		

		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Paris", 10,Continent.EUROPE));
		villes.add(new Ville("New York", 15,Continent.AMERIQUE));
		villes.add(new Ville("Pekin", 100,Continent.ASIE));
		villes.add(new Ville("Moscou", 18,Continent.ASIE));
		villes.add(new Ville("Berlin", 15,Continent.EUROPE));
		villes.add(new Ville("Sydney", 4,Continent.Oceanie));
		villes.add(new Ville("Sao Paolo", 85,Continent.AMERIQUE));
		villes.add(new Ville("Dakar", 5,Continent.AFRIQUE));
		
		for(Ville ville : villes ) {
			System.out.println(ville);
		}

	}

}
