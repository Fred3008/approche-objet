package fr.diginamic.jdr;

import java.util.Random;

public class Wolf extends Creature {

	public Wolf() {
		super();
		setName("Gobelin");
		Random random = new Random();
		setForce(3 + random.nextInt(6));
		setVie(10 + random.nextInt(6));

	}

}
