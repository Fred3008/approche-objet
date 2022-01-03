package maps;


import java.util.ArrayList;
import java.util.HashMap;



public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> liste = new ArrayList<>();

		liste.add(new Pays("France", 65, "Europe"));
		liste.add(new Pays("Allemagne", 80, "Europe"));
		liste.add(new Pays("Belgique", 10, "Europe"));
		liste.add(new Pays("Russie", 150, "Asie"));
		liste.add(new Pays("Chine", 1400, "Asie"));
		liste.add(new Pays("Indonesie", 220, "Oceanie"));
		liste.add(new Pays("Australie", 20, "Oceanie"));

		
		// utilisation hashMap pour faire du comptage
		HashMap<String, Integer> comptage = new HashMap<>();

		for (Pays pays : liste) {
			String continent = pays.getContinent();
			Integer compteur = comptage.get(continent);
			if (compteur==null) {
				comptage.put(continent, 1);

			} else {
				compteur++;
				comptage.put(continent, compteur);
			}
		}
		for (String cle : comptage.keySet()) {
			System.out.println("Nombre de Pays pour :" + cle+" = "+comptage.get(cle) );
		}

	}

}
