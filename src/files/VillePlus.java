package files;

public class VillePlus {
	
	private String name;
	private int departement;
	private double population;
	
	
	public VillePlus(String name, int departement, double population) {
		super();
		this.name = name;
		this.departement = departement;
		this.population = population;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDepartement() {
		return departement;
	}


	public void setDepartement(int departement) {
		this.departement = departement;
	}


	public double getPopulation() {
		return population;
	}


	public void setPopulation(double population) {
		this.population = population;
	}

}
