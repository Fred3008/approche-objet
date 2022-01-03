package fr.diginamic.entites;

public class Cercle {

	double rayon; // varaiables d'instance 

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double perimetre() {

		return 2 * Math.PI * rayon;
	}

	public double surface() {

		return Math.PI * rayon * rayon;
		
		

	}

	@Override
	public String toString() {
		return "Cercle [rayon = " + rayon + " perimetre " + perimetre() + " surface " + surface() + "]";
	}

}
