package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparateurVille implements Comparator<Ville> {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 34300));
		villes.add(new Ville("Paux", 343000));
		villes.add(new Ville("Marseille", 850700));

		Collections.sort(villes, new ComparateurVille());

		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}

	@Override
	public int compare(Ville v1, Ville v2) {
		if (v1.getNbHabitants() < v2.getNbHabitants()) {
			return 1;
		} else if (v1.getNbHabitants() > v2.getNbHabitants()) {
			return -1;
		} else {

		}
		return 0;
		
	}

	

	

}
