package fr.diginamic.jdr;

import java.util.Random;

public  class Personnage  extends Creature {

	
	private int score;
	
	

	public Personnage(int vie, int force,  String name) {
		super();
		Random random = new Random();
		this.vie = 20 + random.nextInt(31);
		this.force = 12 + random.nextInt(7);
		
		this.name = name;
	}
	



	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}

}
