import java.time.LocalDate;
import java.util.ArrayList;


public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom="SQUAGLIA"; 
		String prenom="Pierre-Louis";
		String nom2="MUZIO";
		String prenom2="Thomas";
		LocalDate dateNaissance=LocalDate.of(2001,11,14);
		LocalDate dateEmb=LocalDate.of(2019,2,4);
		LocalDate dateNaissance2=LocalDate.of(2001,01,19);
		LocalDate dateEmb2=LocalDate.of(2020,3,25);
		Adresse adresse=new Adresse(9,"Lot Belle île en mer","20620","Biguglia");
		Adresse adresse2=new Adresse(8,"Lot Test","20600","Bastia");
		//Personne P1 = new Personne("SQUAGLIA", "Pilou", 14, 11, 2001,9,"Lot Belle île en mer", "20620", "Biguglia");
		//Personne P2 = new Personne("SQUAGLIA", "Christophe", 18, 02, 2005,9,"Lot Belle �le en mer", "20620", "Biguglia");
		//System.out.println(P1.plusAgee(P2));
		//System.out.println(Personne.plusAgee(P1, P2));
		//System.out.println(P1.equals(P3));
		//System.out.println(P1.equals(P2));
		Employe e1=Employe.createEmploye(nom, prenom, dateNaissance, adresse, 2000, dateEmb);
		System.out.println(e1);
		//System.out.println("Nombre d'années passé dans l'entreprise : "+e1.calculAnnuite());
		Manager m1=Manager.createManager(nom, prenom, dateNaissance, adresse, 2000, dateEmb);
		Manager m2=Manager.createManager(nom2, prenom2, dateNaissance, adresse, 2000, dateEmb);
		//System.out.println(m1);
		ArrayList<Manager> managers=new ArrayList<Manager>();
		managers.add(m1);
		managers.add(m2);
		Secretaire s1=Secretaire.createSecretaire(nom2, prenom2, dateNaissance2, adresse, 1500, dateEmb2, managers);
		Secretaire s2=Secretaire.createSecretaire("Girard", "Malo", LocalDate.of(2001,11,29), adresse2, 1500, dateEmb2, managers);
		m1.setSecretaire(s1);
		/*for(int i=0;i<managers.size();i++) {
			System.out.println(managers.get(i).salaire);
		}*/
		m1.augmenterLeSalaire(10);
		m2.augmenterLeSalaire(10);
		/*for(int i=0;i<managers.size();i++) {
			System.out.println(managers.get(i).salaire);
		}*/
		//int age=dateEmb.compareTo(dateNaissance);
		//System.out.println(age);
		System.out.println(m1.getSecretaire());
		m1.setSecretaire(s2);
		System.out.println(m1.getSecretaire());
		
		
	}

}