package listes;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> entiers = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);

		Iterator<Integer> iterator = entiers.iterator();
		while (iterator.hasNext()) {
			Integer myInteger = iterator.next();
			System.out.println(myInteger);

//		
			for (int i = 0; i < entiers.size(); i++) {

				System.out.println(entiers.get(i));
			}
			System.out.println("Taille de la liste: " + entiers.size());

			for (Integer nb : entiers) {
				System.out.println(nb);
			}
		}
		int max = entiers.get(0);
		for (int i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) > max) {
				max = entiers.get(i);
			}
			
		}
		//suprimer le plus petit element du tableau
		
		int  min = entiers.get(0);
		int index =0;
		for (int i =1; i < entiers.size(); i++) {
			if (entiers.get(i) < min) {
				min = entiers.get(i);
				index =i;
			}
			
		}
		entiers.remove(index);
		System.out.println("resultat apes supression");
		for(Integer nb : entiers) {
			System.out.println(nb);
		}
		//rechercher tous negatifs de la liste
		for (int i = 0; i < entiers.size(); i++) {
			if(entiers.get(i) <0) {
				entiers.set(i, -entiers.get(i));
			}
		}
		System.out.println("resultat");
		for(Integer nb : entiers) {
			System.out.println(nb);
		}
		

	}

}
