package entites;

public class AdressePostale {

	int numeroDeRue;
	String nomDeRue;
	int codePostal;
	String ville;

	public AdressePostale(int nvnumeroDeRue, String nvnomDeRue, int nvcodePostal, String nvville) {
		numeroDeRue = nvnumeroDeRue;
		nomDeRue = nvnomDeRue;
		codePostal = nvcodePostal;
		ville = nvville;

	}
	@Override
	public String toString() {
		return "AdressePostale [numeroDeRue=" + numeroDeRue + ", nomDeRue=" + nomDeRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}

}
