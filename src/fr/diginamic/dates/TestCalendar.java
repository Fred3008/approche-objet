package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		// modifier la date
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		System.out.println(date);

		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormat = formater.format(date);
		System.out.println(dateFormat);

		Date date2 = new Date();

		String date1 = formater.format(date2);
		System.out.println(date1);

		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date3 = format2.format(date2);
		System.out.println(date3);

		SimpleDateFormat format3 = new SimpleDateFormat("EEE dd MMM 'à' HH:mm:ss", new Locale("ru", "RU"));
		SimpleDateFormat format4 = new SimpleDateFormat("EEE dd MMM 'à' HH:mm:ss", new Locale("us", "US"));

		SimpleDateFormat formatgr= new SimpleDateFormat("EEE dd MMM 'à' HH:mm:ss",Locale.GERMAN);
		SimpleDateFormat formatfr = new SimpleDateFormat("EEE dd MMM 'à' HH:mm:ss", new Locale("fr", "Fr"));
		SimpleDateFormat formatchina = new SimpleDateFormat("EEE dd MMM 'à' HH:mm:ss", Locale.CHINA);
		
		System.out.println(format3.format(date));
		System.out.println(format3.format(date));
		System.out.println(format4.format(date));
		System.out.println(formatfr.format(date));
		System.out.println(formatgr.format(date));
		System.out.println(formatchina.format(date2));

	}

}
