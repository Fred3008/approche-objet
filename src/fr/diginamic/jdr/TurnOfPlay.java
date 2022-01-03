package fr.diginamic.jdr;

import fr.diginamic.jdr.Creature;
import fr.diginamic.jdr.Goblin;
import fr.diginamic.jdr.Troll;
import fr.diginamic.jdr.Wolf;

import java.util.Random;

public class TurnOfPlay {

	public static void newTurn() {
		// random de 0 a 2
		Random random = new Random();
		int points = 0;
		int creatureRandom = random.nextInt(3);
		Creature creature = null;
		// switch pour affectation de la créature
		if (creatureRandom == 0) {
			creature = new Goblin();
			points = 2;
		} else if (creatureRandom == 1) {
			creature = new Troll();
			points = 5;
		} else if (creatureRandom == 2) {
			creature = new Wolf();
			points = 1;
		}
		System.out.println("Vous affrontez un " + creature.getName() + ", avec force = " + creature.getForce()
				+ ", vie = " + creature.getVie());
		// BOUCLE TANT QUE LA CREATURE ET LE CHARACTER SONT VIVANTS
		while (creature.getVie() > 0 && Game.getPersonnage().getVie() > 0) {
			// calcule de l'attaque du personnage et de la créature
			double creatureAttack = Game.getPersonnage().getAttackValue();
			double personnageAttack = creature.getAttackValue();

			if (personnageAttack > creatureAttack) {
				double damages = personnageAttack - creatureAttack;
				System.out.println(Game.getPersonnage().getName() + " il est plus rapide il inflige " + damages + "à"
						+ creature.getName());
				creature.setVie(creature.getVie() - damages);
				
				System.out.println("il lui reste " + creature.getVie());
			} else if (personnageAttack == creatureAttack) {
				System.out.println("La creature ebvite votre coups");
				continue;
			} else {
				double damages = creatureAttack - personnageAttack;
				System.out.println(creature.getName() + "est plus rapide il inflige " + damages + "à" + Game.getPersonnage().getName());
			}
		}
	}
}