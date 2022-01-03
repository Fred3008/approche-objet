package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparateurVille implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		if (v1.getPopulationTotal() < v2.getPopulationTotal()) {
			return 1;
		} else if (v1.getPopulationTotal() > v2.getPopulationTotal()) {
			return -1;
		} else {

		}
		return 0;

	}

}
