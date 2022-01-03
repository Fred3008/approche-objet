package fr.objet;

public class Main {

	public static void main(String[] args) {
		
		 Apple a = new Apple();
		 a.taste();
		 a.miam();  
		 
		 PineApple pen = new PineApple();
		 pen.taste();
		 pen.miam();
		
	
		 Player player1 = new Player("Fred", 20.0, 300.0);
		 System.out.println("name : " + player1.getName());
		 System.out.println("vie : " + player1.getHealth());
		 player1.damage(200);
		 System.out.println("vie : " + player1.getHealth());
		 
		 
			 Player player2 = new Player("bill", 15.0, 200.0);
			 player2.getName();
			 player2.damage(player1.getAttack());
			 System.out.println("vie : " + player2.getHealth());
			 

			 int money = 2000;
			 int pricephone =800;
			 boolean hasPhone = false;
			 
			 sendMessage("la difference est de : " + getResultat(money, pricephone, hasPhone)); 
	}
	private static void sendMessage (String message) {
		System.out.println( message);
	}

	private static int getResultat(int money, int pricephone, boolean hasPhone) {

		if (money >= pricephone || !hasPhone) {
			System.out.println("tu peux acheter ce phone");

		} else {
			System.out.println("tu n'a pas assez d'argent");

		}
		return money - pricephone;

	}

}

