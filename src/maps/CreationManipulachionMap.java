package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationManipulachionMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		mapVilles.put(59, "Lille");

		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while (keysIte.hasNext()) {
			Integer integer = keysIte.next();
			System.out.println(integer);
		}
		
		Iterator<String> valuesIte = mapVilles.values().iterator();
		while (valuesIte.hasNext()) {
			String string = valuesIte.next();
			System.out.println(string);
		}
		
	}

}
