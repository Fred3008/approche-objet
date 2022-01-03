package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class comptageVille {

	public static void main(String[] args) {
		List<Ville> liste = new ArrayList<>();
 HashMap<Integer, Integer> comptage = new HashMap<>();
		 
		 for(Ville ville : liste) {
			Integer mesVilles = ville.getCodeRegion();
			 Integer popMax = comptage.get(ville.getCodeRegion());
			 if(popMax== null) {
				 comptage.put(ville.getCodeRegion(), ville.getPopulationTotal());
				 
			 } else {
				 popMax++;
				 comptage.put(mesVilles+popMax+ville.getPopulationTotal(),ville.getCodeRegion());
			 }
		 }
		 for(Integer cle : comptage.keySet()) {
			 System.out.println("Ville" + cle+ "=" +comptage.get(cle));
		 }

	}

}
