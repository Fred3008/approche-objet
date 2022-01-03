package fr.diginamic.jdr;

public abstract class Creature {

	protected double vie;
	protected double force;
	protected String name;

	public Creature() {
		
	}
	public final double getAttackValue() {
		return force + 1 + (int) (Math.random() * 9);
	}
	public double getVie() {
		return vie;
	}
	public void setVie(double vie) {
		this.vie = vie;
	}
	public double getForce() {
		return force;
	}
	public void setForce(double force) {
		this.force = force;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
