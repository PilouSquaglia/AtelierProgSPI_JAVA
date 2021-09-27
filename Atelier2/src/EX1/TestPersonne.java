package EX1;

import java.util.GregorianCalendar;

public class TestPersonne {

	public static void main(String[] args) {
		
	//Personne P1 = new Personne("SQUAGLIA", "Pilou", 14, 11, 2001,9,"Lot Belle île en mer", "20620", "Biguglia");
	//Personne P2 = new Personne("SQUAGLIA", "Christophe", 18, 02, 2005,9,"Lot Belle île en mer", "20620", "Biguglia");
	//Personne P3 = new Personne("SQUAGLIA", "Pilou", 14, 11, 2001,9,"Test", "20600", "Test");
	//System.out.println(P1.plusAgee(P2));
	//System.out.println(Personne.plusAgee(P1, P2));
	//System.out.println(P1.equals(P3));
	//System.out.println(P1.equals(P2));
	GregorianCalendar dateNaissance = new GregorianCalendar(2001, 11, 14);
	GregorianCalendar dateEmbauche = new GregorianCalendar(2020, 6, 1);
	Adresse adresse = new Adresse(9,"Lot Belle île en mer", "20620", "Biguglia");
	Employe Employe1 = Employe.createEmploye(2000, dateEmbauche, "SQUAGLIA", "Pilou", dateNaissance, adresse);
	//System.out.println(Employe1.toString());
	System.out.println(Employe1.augmenterLeSalaire(1.5));
	System.out.println(Employe1.calculAnnuite());
	}

}
