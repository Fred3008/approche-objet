package fr.diginamic.jdr;

import java.util.Random;

public class Goblin extends Creature {

	public Goblin() {
		super();
		setName("Gobelin");
		Random random = new Random();
		setForce(5 + random.nextInt(6));
		setVie(10 + random.nextInt(6));

	}

}
