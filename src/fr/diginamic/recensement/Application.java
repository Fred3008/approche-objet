package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("/Library/Tamp/recensement.csv");
		List<String> lignes = Files.readAllLines(path);

		List<Ville> villes = new ArrayList<>();
		HashMap<String,Ville> villeMax = new HashMap<>();
		
		double max = Integer.MAX_VALUE;
		String cleMax = null;
		
		for(String cle : villeMax.keySet()) {
			Ville ville = villeMax.get(cle);
			
			if(ville.getPopulationTotal() < max) {
				max = ville.getPopulationTotal();
				cleMax = cle;
			}
		}
		System.out.println(cleMax);
		
	
		for (int i = 1; i < lignes.size(); i++) {

			String ligne = lignes.get(i);

			String[] colones = ligne.split(";");

			if (ligne.contains("Montpellier")) {

				// System.out.println(ligne);
			}

			int codeRegion = Integer.parseInt(colones[0]);

			String nomRegion = colones[1].trim().replace(" ", "");
			String codeDepartement = colones[2];
			String codeCommune = colones[5];
			String nomCommune = colones[6];
			String population = colones[9];

			int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

			Ville ville = new Ville(codeRegion, nomRegion, codeCommune, codeDepartement, nomCommune, populationTotale);

			villes.add(ville);

		}
		// System.out.println(villes.size());

		double population34 = 0;
		// recherche de la population Herault

		for (int i = 0; i < villes.size(); i++) {
			Ville vi = villes.get(i);
			if (vi.getCodeDepartement().equals("34")) {
				population34 = vi.getPopulationTotal() + population34;

			}

		}
		System.out.println("Population Total de l'Herault: " + population34);

		// Total population Occitanie
		double populationOccitanie = 0;

		for (int i = 0; i < villes.size(); i++) {
			Ville vi = villes.get(i);
			if (vi.getNomRegion().equals("Occitanie")) {
				populationOccitanie = vi.getPopulationTotal() + populationOccitanie;

			}

		}

		System.out.println("Population Total de la region Occitanie: " + populationOccitanie);

//aficher laville la plus petite de l'Herault
		HashMap<String, Ville> villeMin = new HashMap<>();

		double minHabitant = Integer.MAX_VALUE;
		String cleMin = null;

		for (String cle : villeMin.keySet()) {
			Ville ville = villeMin.get(cle);

			if (ville.getPopulationTotal() < minHabitant) {
				minHabitant = ville.getPopulationTotal();
				cleMin = cle;

			}

		}
		System.out.println(cleMin);
		for(Ville ville : villeMin.values()){
			System.out.println(ville);
		}
		
		List<Ville> villeMini = new ArrayList<>();
		Collections.sort(villeMini, new ComparateurVille());

		//affiche les 10 villes moins peupléé de France
		for (int i = 0; i < 10; i++) {
			Ville vi = villes.get(i);
			villeMini.add(vi);
		}
		 System.out.println(villeMini);
		List<Ville> villeMax1 = new ArrayList<>();
		Collections.sort(villeMax1, new ComparateurVille());
			for (int i = 0; i > 10; i++) {
				Ville vi = villes.get(i);
				villeMax1.add(vi);
			}
			System.out.println(villeMax1);

		// Aficher les 10 plus grandes villes
			List<Ville> ville34 = new ArrayList<>();
		Collections.sort(ville34, new ComparateurVille());
		for (int i = 0; i > 10; i++) {
			Ville vi = ville34.get(i);
			
			ville34.add(vi);

		}
		 System.out.println(ville34);

		List<Ville> region = new ArrayList<>();
		double population = 0;
		for (int i = 0; i < ville34.size(); i++) {
			Ville vi = villes.get(i);
			if (vi.getNomRegion().equals("Occitanie")) {
				population = vi.getPopulationTotal() + population;
				region.add(vi);
				
			}
		}
		 System.out.println(region);
		 
		 HashMap<String, Integer> comptage = new HashMap<>();
		 
		 for(String villes1 : lignes) {
			String mesVilles = villes1;
			 Integer compteur = comptage.get(mesVilles);
			 if(compteur== null) {
				 comptage.put(mesVilles, 1);
				 
			 } else {
				 compteur++;
				 comptage.put(mesVilles, compteur);
			 }
		 }
		 
	}

}
