package fr.objet;

public abstract class Fruit {
	
	private String name;
	
	public Fruit(String name) {
		this.setName(name);
	}
	
 public abstract void taste();
 
 public abstract int getSize();
 
 public abstract boolean hasSeed();
 
   public void miam () {
	   System.out.println("Miam manger 5 fruits et legumes par jour / nom du fruit " + getName());
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
 
}
