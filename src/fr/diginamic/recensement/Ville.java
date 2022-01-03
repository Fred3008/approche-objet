package fr.diginamic.recensement;

public class Ville {

	private Integer codeRegion;
	private String nomRegion;
	private String codeCommune;
	private String codeDepartement;
	private String nomComune;
	private int populationTotal;

	public Ville(Integer codeRegion, String nomRegion, String codeCommune, String codeDepartement, String nomComune,
			int populationTotal) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeCommune = codeCommune;
		this.codeDepartement = codeDepartement;
		this.nomComune = nomComune;
		this.populationTotal = populationTotal;

	}

	public Integer getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(Integer codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomComune() {
		return nomComune;
	}

	public void setNomComune(String nomComune) {
		this.nomComune = nomComune;
	}

	public int getPopulationTotal() {
		return populationTotal;
	}

	public void setPopulationTotal(int populationTotal) {
		this.populationTotal = populationTotal;
	}

	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeCommune=" + codeCommune
				+ ", nomComune=" + nomComune + ", populationTotal=" + populationTotal + "]";

	}

	public void add(String villeAdd) {
		// TODO Auto-generated method stub

	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

}
