package fr.diginamic.jdr;

import java.util.Scanner;
import fr.diginamic.jdr.Personnage;


public class Interface {

	
	
		
		public static void showMenu(Scanner scanner) {
		
			System.out.println("Choisissez une option :");
			System.out.println("1 - Créer un personnage pour commencer une nouvelle partie");
			System.out.println("2 - Combattre une créature");
			System.out.println("3 - Afficher mon score");
			System.out.println("4 - Exit");
			
			String userChoice = scanner.nextLine();
			
			switch (userChoice) {
			case "1":
				createPersonnage(scanner);
				break;
			case "2":
				fightACreature();
				break;
			case "3":
				displayScore();
				break;
			case "4":
				Game.setRunning(false);
				break;
			}
//			
			
		}
		
		public static void createPersonnage(Scanner scanner) {
			
			System.out.println("Quel nom vouleez vous donner à votre personnage?");
			String name = scanner.nextLine();
			
			Personnage personnage = new Personnage(0,0, name);
			personnage.setName(name);
			Game.setPersonnage(personnage);
			
			Game.setAmountOfTurns(0);
			Game.setPersonnageAlive(true);
			
			
		}
		public static void fightACreature() {
			if (Game.getPersonnage() != null && Game.isPersonnageAlive()) {
				Game.setAmountOfTurns(Game.getAmountOfTurns()+1);
				System.out.println("TOUR DE JEU N°" + Game.getAmountOfTurns()+ "****");
				TurnOfPlay.newTurn();
				System.out.println("***FIN DU JEU****");
			}else {
				System.out.println("vous ne  pouvez pas combatre sans avoir créé un personnagen ou avec un personnage au préalble");
			}
		}
		
		public static void displayScore() {
			if(Game.getPersonnage() != null) {
				System.out.println("votre score: " + Game.getPersonnage().getScore());
			}else {
				System.out.println("Il faut avoir créé un personnage avant de pouvoir abotenir son score");
			}
		}
	}


