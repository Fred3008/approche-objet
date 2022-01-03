package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

	public Troll() {
		super();
		setName("Gobelin");
		Random random = new Random();
		setForce(10 + random.nextInt(6));
		setVie(20 + random.nextInt(11));

	}
}
