package fr.objet;

public class Player {

	private String name;
	private double health;
	private double attack;

	public Player(String name, double attack, double health) {
		this.name = name;
		this.attack = attack;
		this.health = health;
	}

	public void damage(double damage) {
		this.health -= damage;
		System.out.println(name + " viens de subir " + damage + " dégats ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

}
