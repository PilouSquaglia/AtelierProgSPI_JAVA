package EX1;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employe extends Personne{
	
	private int salaire;
	private final GregorianCalendar dateEmbauche;
	 
	 
	//Constructeur
	protected Employe(int salaire, GregorianCalendar dateEmbauche, String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse) {
		super(leNom, lePrenom, laDate, lAdresse);
		this.dateEmbauche=dateEmbauche;
		this.salaire=salaire;
	}
	
	//Méthodes
	
	public static Employe createEmploye(int salaire, GregorianCalendar dateEmbauche, String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse) {
		int age =dateEmbauche.get(Calendar.YEAR)-laDate.get(Calendar.YEAR);
		if (age>16 && age<65) {
			Employe employe = new Employe(salaire, dateEmbauche, leNom, lePrenom, laDate, lAdresse);
			return employe;
		}
		else {
			return null;
		}
	}
	
	public double augmenterLeSalaire(double augmentation) {
		if (augmentation>1)
			return getSalaire()*augmentation;
		else {
			return getSalaire();
		}
	}
	
	public int calculAnnuite() {
		int anne = YearMonth.now().getYear();
		return anne-this.dateEmbauche.get(Calendar.YEAR);
	}
	
	public String toString() {
		String res = "Salaire : "+salaire+" \nEmbauché(e) le : "
				+dateEmbauche.get(Calendar.DAY_OF_MONTH)+"\n"+ 
				"-"+dateEmbauche.get(Calendar.MONTH)+"\n" + 
				"-"+dateEmbauche.get(Calendar.YEAR)+"\nNom : "+nom+"\n"
				+"Prénom : "+prenom+"\n"+
				"Né(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
				"-"+dateNaissance.get(Calendar.MONTH)+
				"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
				"Adresse : "+
				adresse.toString();
		return res;
	}
	
	public int getSalaire() {
		return salaire;
	}

}
