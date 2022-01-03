package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TestDates {

	public static void main(String[] args) throws ParseException{

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		Date date1 = new Date();
		String chaine1 = format.format(date1);

		System.out.println(chaine1);
		
		//Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30  secondes 

		Calendar cal = Calendar.getInstance();
		
		//modifier la date
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		System.out.println(date);
		
		SimpleDateFormat  formater = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateFormat = formater.format(date);
		System.out.println(dateFormat);
		
		SimpleDateFormat formater2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String chaine2 = formater2.format(date);
		System.out.println(chaine2);
		System.out.println(formater2.format(date1));
		
		
	}

}
