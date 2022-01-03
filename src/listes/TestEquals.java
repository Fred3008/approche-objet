package listes;

public class TestEquals {

	public static void main(String[] args) {

		Ville v1 = new Ville("Paux", 343000);
		Ville v2 = new Ville("Paux", 343000);

		boolean result = v1.equals(v2);
		System.out.println(result);

		v1 = new Ville("Paux", 343000); // utiliser methode equals pour les objets
		v2 = new Ville("Paux", 344000);

		result = v1.equals(v2);

		System.out.println(v1.equals(v2));

		Ville v3 = new Ville("Paux", 343000);
		Ville v4 = new Ville("Marseille", 354000);

		System.out.println(v3.equals(v4)); // pas operateur new donc villememe pointe vers le meme objet le == pour
											// types primitifs
		Ville villememe = v1;
		System.out.println(villememe == v1);

	}

}
