import java.time.LocalDate;


public class Employe extends Personne {
	
	protected double salaire;
	private LocalDate dateEmbauche;
	
	protected Employe(String leNom,String lePrenom, LocalDate laDate, Adresse lAdresse, 
			double salaire, LocalDate dateEmbauche) {
		super(leNom,lePrenom,laDate,lAdresse);
		this.salaire=salaire;
		this.dateEmbauche=dateEmbauche;	
	}
	
	/**
	 * @param leNom
	 * @param lePrenom
	 * @param laDate
	 * @param lAdresse
	 * @param salaire
	 * @param dateEmbauche
	 */
	public static Employe createEmploye(String leNom,String lePrenom, LocalDate laDate, Adresse lAdresse, 
			double salaire, LocalDate dateEmbauche){
		int age=dateEmbauche.getYear()-laDate.getYear();
		if(age>16 && age<65) {
			Employe employe=new Employe(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
			return employe;
		}
		else {
			return null;
		}
		
	}
	/**
	 * @param pourcentage
	 */
	public void augmenterLeSalaire(double pourcentage) {
		if(pourcentage>0) {		
			salaire*=1+(pourcentage/100);
		}
		else {
			System.out.println("Le pourcentage doit etre positif");
		}
	}
	
	/**
	 * @return difference des années
	 */
	public int calculAnnuite() {
		LocalDate now=LocalDate.now();
		return now.getYear()-dateEmbauche.getYear()+1;
	}

}
