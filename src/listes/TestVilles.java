package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 34300));
		villes.add(new Ville("Paux", 343000));
		villes.add(new Ville("Marseille", 850700));

		//Collections.sort(villes, new ComparateurVille());
		
		Collections.sort(villes);

		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}
}
//}
//		int max = villes.get(0).getNbHabitants();
//		ville villeMax = null;
//		for (int i = 0; i < villes.size(); i++) {
//			if (villes.get(i).getNbHabitants() > max) {
//				max = villes.get(i).getNbHabitants();
//				villeMax = villes.get(i);
//			}
//			System.out.println(villeMax);

// afficher la ville la plus peuplée
//
//			Ville villeMax = villes.get(0);
//			for (int i = 0; i < villes.size(); i++) {
//				if (villes.get(i).getNbHabitants() > villeMax.getNbHabitants()) {
//					villeMax = villes.get(i);
//				}
//			}
//			System.out.println("ville la plus peuplée: " + villeMax);
//			
//			//supprimer la ville la moins peuplée
//			
//			
//		Ville villeMin = villes.get(0);
//			int index =0;
//			for (int i =1; i < villes.size(); i++) {
//				if (villes.get(i).getNbHabitants() < villeMin.getNbHabitants()) {
//					villeMin = villes.get(i);
//					
//				}
//				System.out.println("ville la plus petite :" + villeMin);
//				villes.remove(villeMin);
//				
//				//afficher enfin la liste resultante
//				
//				for(Ville v : villes) {
//					System.out.println(v);
//				}
//			}
//				// modifier les villes de plus de 100000 habitants
////				for( Ville vi : villes) {
////					if(Ville.getNbHabitants() > 100000) {
////						Ville.setNom(Ville.getNom().toUpperCase());
////					}
////				}
//					for ( Ville  v: villes) {
//						System.out.println(v);
//					}
//				
//			}
//
//}
