package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		int count = 100000;

		long debut = System.currentTimeMillis();

		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < count; i++) {
			
			builder.append(count);
		}
		long fin = System.currentTimeMillis();
	
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

		
	}

}
