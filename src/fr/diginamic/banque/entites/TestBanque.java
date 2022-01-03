package fr.diginamic.banque.entites;

public class TestBanque extends Compte {

	public static void main(String[] args) {

		Compte monCompte = new Compte();

		monCompte.setNumero(348849404);
		monCompte.setSolde(1.448);

		

		CompteTaux c2 = new CompteTaux(0.22, 3746589, 1.289);
		c2.setNumero(3746589);
		c2.setSold(12898);
		c2.setTaux(2.2);
		

		Compte[] tableauCompte = { monCompte, c2 };

		

		for (int i = 0; i < tableauCompte.length; i++) {

			System.out.println(tableauCompte[i]);
			
		}

	}

}
