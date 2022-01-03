package maps;

import java.util.HashMap;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {

		HashMap<String, Ville> mapVilles = new HashMap<>();

		mapVilles.put("Nice", new Ville("Nice", 343000));
		mapVilles.put("Carcassone", new Ville("Carcassonne", 47800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
		mapVilles.put("Lyon", new Ville("Lyon", 484000));
		mapVilles.put("Foix", new Ville("Foix", 9700));
		mapVilles.put("Paux", new Ville("Paux", 43000));
		mapVilles.put("Marseille", new Ville("Marseille", 850700));

		int minHabitant = Integer.MAX_VALUE;
		String cleMin = null;

		// retourne la ville la moins peuplé
		for (String cle : mapVilles.keySet()) {
			Ville ville = mapVilles.get(cle);

			if (ville.getNbHabitants() < minHabitant) {
				minHabitant = ville.getNbHabitants();
				cleMin = cle;
				System.out.println(" Ville a suprimer : " +cleMin);
			}
		}
		mapVilles.remove(cleMin);
		System.out.println(cleMin);
		for (Ville ville : mapVilles.values()) {
			System.out.println(ville);

		}

	}

}
