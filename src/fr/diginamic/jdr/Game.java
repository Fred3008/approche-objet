package fr.diginamic.jdr;
import java.util.*;


public class Game {

	
	private static int amountOfTurns =0;
	
	private static boolean isPersonnageAlive;
	private static boolean isRunning = true;
	private static Personnage personnage = null;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******** JEU DE ROLE ********");
		while (isRunning) {
			Interface.showMenu(scanner);
		}
		scanner.close();
	}
	
	public static Personnage getPersonnage() {
		return personnage;
	}
	public static void setPersonnage(Personnage personnage) {
		Game.personnage = personnage;
	}
	public static int getAmountOfTurns() {
		return amountOfTurns;
	}
	public static void setAmountOfTurns(int amountOfTurns) {
		Game.amountOfTurns = amountOfTurns;
	}
	public static boolean isPersonnageAlive() {
		return isPersonnageAlive;
	}
	public static void setPersonnageAlive(boolean isPersonnageAlive) {
		Game.isPersonnageAlive = isPersonnageAlive;
	}
	public static boolean isRunning() {
		return isRunning;
	}
	public static void setRunning(boolean isRunning) {
		Game.isRunning = isRunning;
	}
}
