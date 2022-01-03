package fr.objet;

public class Apple extends Fruit {

	public Apple() {
		super("Pomme");
		
	}

	@Override
	public void taste() {
		System.out.println("la pomme a un gout sucré");
		super.miam();
		
	}

	@Override
	public int getSize() {
		
		return 1;
	}

	@Override
	public boolean hasSeed() {
		
		return true;
	}

}
