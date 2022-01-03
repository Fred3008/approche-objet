package entites2;

import entites.AdressePostale;

public class Perssone {

	public String name;
	public String surname;
	public AdressePostale adresse;
	
	public Perssone(String nvname, String nvsurname, AdressePostale nvadresse) {
		name = nvname;
		surname = nvsurname;
		adresse = nvadresse;
		
	}

	@Override
	public String toString() {
		return "Perssone [name=" + name + ", surname=" + surname + ", adresse=" + adresse + "]";
	}
	
		 public String afficher() {
			 
			String print = name + " " +  surname + "" + adresse; 
			return print;
		}
		 public void affichageIdentite() {
			 System.out.println(name.toUpperCase() + " " + surname);
		 }
		 

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public AdressePostale getAdresse() {
			return adresse;
		}

		public void setAdresse(AdressePostale adresse) {
			this.adresse = adresse;
		}

		
		 
	

}


