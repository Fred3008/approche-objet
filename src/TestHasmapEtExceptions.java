
import java.util.HashMap;
import java.util.Map.Entry;

public class TestHasmapEtExceptions {

	public static void main(String[] args) {
		HashMap<String,Integer> ages = new HashMap<>();
		ages.put("fred", 41);
		ages.put("Celine", 49);
		ages.put("Jimmy", 37);
		
		int moyenne = 0;
		
		// calcule la moyenne d'ages avec hasMapp
		for(Entry<String, Integer> element : ages.entrySet()) {
			
			moyenne +=element.getValue();
			
		}
		moyenne =(moyenne / ages.size());

		System.out.println(moyenne);
		
		int[] numbers = {3, 6, 9,2};
		int calcul = 5+ 2;
		
		//contourner une exception arithmetic
		try {
		System.out.println(numbers[4]);
		calcul /=0;
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
			System.out.println("L'erreur est ici");
		} finally {
			System.out.println("Finalement la vie est belle");
		}
		
		double balance = 5000;
		double price = 5200;
		try {
			buy(balance,price);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
// faire une exception negative
	private static void buy(double balance, double price) throws noMoneyException {
		double b = balance - price;
		
		if(b <0) {
			throw new noMoneyException();
		}
		System.out.println(b);
	}
	
}
