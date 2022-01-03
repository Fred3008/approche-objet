package fr.diginamic.testexecptions;

import java.lang.reflect.Field;

import fr.diginamic.testexecptions.error.ReflectionExecption;

public class ReflectionUtils {

	public static void afficherAttributs(Object obj) throws  IllegalArgumentException, IllegalAccessException, ReflectionExecption {
		
		if(obj == null) {
			throw new ReflectionExecption("interdiction d'appeler le méthode avec null");
		}
		
		
		
		// On commence par récupérer la classe de l'objet passée en paramètre.
		// la classe fournit toutes les informations sur la structure d'un objet.
		Class<?> classe = obj.getClass();
		// Sur cette classe on récupère le tableau des variables d'instance
		Field[] fields = classe.getDeclaredFields();
		// On fait une boucle sur ce tableau
		for (Field field : fields) {
			// On force l'accès à l'attribut depuis une classe externe.
			// Un peu comme si je forçais l'attribut en lisibilité public.
			field.setAccessible(true);
			// Affichage
			System.out.println("La valeur de l'attribut " + field.getName() + " est " + field.get(obj).toString());
		}
	}
}
