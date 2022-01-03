package fr.diginamic.formes;

public class TestForme {

	public static void main(String[] args) {

		Cercle cercle = new Cercle(5);
		Carre carre = new Carre(10);
		Rectangle rectangle = new Rectangle(5, 8);

		System.out.println("cercle : Perimetre = " + cercle.calculerPerimetre());
		System.out.println("cercle : Surface = " + cercle.calculerSurface());
		System.out.println("Carre : Surface = " + carre.calculerSurface());
		System.out.println("Rectangle : Perimetre = " + rectangle.calculerPerimetre());

	}

}
