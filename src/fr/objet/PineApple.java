package fr.objet;

public class PineApple extends Fruit {

	public PineApple() {
		super("Annanas");
		
	}

	@Override
	public void taste() {
		System.out.println("L'annanas donne des aphtes");
		
	}

	@Override
	public int getSize() {
		
		return 2;
	}

	@Override
	public boolean hasSeed() {
		
		return false;
	}

}
