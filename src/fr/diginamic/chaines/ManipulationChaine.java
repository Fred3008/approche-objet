package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";

		String[] split = chaine.split("\\;");
		for (int i = 0; i < split.length; i++) {

			System.out.println(split[i]);

		}

		// extrait du salaire et remplace l'espace vide
		double montant = Double.parseDouble(split[2].replace(" ", ""));

		Salarie salaire = new Salarie(split[0], split[1], montant);

		System.out.println(salaire);

		char premierCaractere = chaine.charAt(0);

		System.out.println("1er caractere: " + premierCaractere);

		System.out.println(chaine.length());

		int index = chaine.indexOf(";");
		System.out.println(index);

		String portion = chaine.substring(1, 21);

		System.out.println(portion);

		String name = chaine.substring(0, 6);

		System.out.println(name);

		String nameup = name.toUpperCase();
		System.out.println(nameup);

		String lower = name.toLowerCase();
		System.out.println(lower);

		String[] words = chaine.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

	}

}
