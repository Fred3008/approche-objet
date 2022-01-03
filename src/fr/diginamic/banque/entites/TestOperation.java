package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		Credit c1 = new Credit("30.08.2021", 1500);
		Credit c2 = new Credit("30.08.2021", 150);

		Debit d1 = new Debit("10.2.2021", 300);
		Debit d2 = new Debit("10.2.2021", 300);

		Operation[] operations = { c1, c2, d1, d2 };

		double montant = 0.0;

		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);

			if (operations[i].getType().equals("debit")) {
				montant -= operations[i].getMontant();

			} else {
				montant += operations[i].getMontant();

			}
			System.out.println("Montant global : " + montant);
		}

	}

}
