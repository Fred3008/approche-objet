package entites;

import entites2.Perssone;

public class TestPersson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adress1 = new AdressePostale(8, "Les Mimosas", 83440, "Nice");

		AdressePostale adress2 = new AdressePostale(5, "rue de Montmartre", 75004, "Paris");

		Perssone pers1 = new Perssone("Robert", "Durant", adress1);

		Perssone pers2 = new Perssone("Robert", "Dupon", adress2);

		System.out.println(pers1 + " " + pers2);
		System.out.println(adress1 + " " + adress2);

		pers1.setName("lola");
		pers1.setSurname("Basil");
		pers2.setName("paul");
		pers2.setSurname("Bernard");
		pers1.setAdresse(adress2);
		pers2.setAdresse(adress1);
		
		 pers1.affichageIdentite();
		 pers2.affichageIdentite();
		 
		 String namePers1 = pers1.getName();
		 System.out.println(namePers1);

		String affichage = pers1.afficher();
		String affichage2 = pers2.afficher();
		String modifier = pers1.afficher();
		
		
		 

		System.out.println(affichage  + " " + affichage2 + " " + modifier);

	
	}
	

}
