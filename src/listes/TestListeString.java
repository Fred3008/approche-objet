package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> villes = new ArrayList <>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille",
				"Tarbes"));
	 	int maxLettre =0;
		
		for( int i = 0; i<villes.size(); i++) {
			
			//System.out.println(list.get(i).length());
			if(maxLettre < villes.get(i).length()) {
				maxLettre = villes.get(i).length();
				
				
			}
			System.out.println(maxLettre);
		}

	}

}
