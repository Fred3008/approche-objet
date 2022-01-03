package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
	
		Salarie salarie = new Salarie("Olivier", "Pires", 2333);
		Pigiste pigiste = new Pigiste("Francois", "Duchene", 230, 13);
		
		System.out.println("salarie: " + salarie.getSalaire());
		System.out.println("Pigiste: " + pigiste.getSalaire());
		
		salarie.afficherDonnees();
		pigiste.afficherDonnees();
	}

}
