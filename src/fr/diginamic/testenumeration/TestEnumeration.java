package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saison = Saison.values();
		
		for (Saison saison2 : saison) {
			System.out.println(saison2);
		}
		Saison saison1 = Saison.ETE;
		System.out.println(saison1);
		
		Saison saison2 = Saison.Hiver;
		System.out.println(saison2);
		
		System.out.println(Saison.getBylibelle("Hiver"));
	}

}
