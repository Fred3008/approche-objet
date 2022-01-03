package fr.diginamic.testexecptions;

import fr.diginamic.testenumeration.Continent;
import fr.diginamic.testenumeration.Ville;
import fr.diginamic.testexecptions.error.ReflectionExecption;

public class TestReflectionUtils {

	public static void main(String[] args) {
		Ville ville = new Ville("Paris", 10, Continent.EUROPE);

		try {
			ReflectionUtils.afficherAttributs(ville);
			
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionExecption e) {
			System.err.println(e.getMessage());

		}
		try {
			ReflectionUtils.afficherAttributs(null);
			
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionExecption e) {
			System.err.println(e.getMessage());

		}

		//System.out.println(ville);

	}

}
