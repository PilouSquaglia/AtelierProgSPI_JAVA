import java.time.LocalDate;


public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private static final int AGE_MAJORITE = 18;
    private static int nbPersonnes=0;
    private String nom;
    private String prenom;
    private int ageDernierDiplome;
    private final LocalDate dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
    private static String nomDernierePersonneCree;
    
    
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, LocalDate laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nomDernierePersonneCree=leNom;
		nbPersonnes++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'ann�e de naissance
	 * @param numero le n� de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, LocalDate.of(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}
	
	public static String getNomDernierePersonne() {
		return nomDernierePersonneCree;
	}
	
	public static int getAGE_MAJORITE() {
		return AGE_MAJORITE;
	}
	
	public int getAgeDernierDiplome() {
		return ageDernierDiplome;
	}
	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le pr�nom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public static int getNbPersonnes() {
		return nbPersonnes;
	}
	
	public void setAdresse(Adresse a) {
		adresse=a;
	}
	
	/**
	 * @param p1
	 * @param p2
	 * @return true si p2 plus vieux que p1
	 */
	public static boolean plusAgee(Personne p1, Personne p2) {
		return p1.getDateNaissance().isAfter(p2.getDateNaissance());
	}
	
	/**
	 * @param personne
	 * @return true si this plus age que personne
	 */
	public boolean plusAgeeQue(Personne personne) {
		return personne.getDateNaissance().isAfter(this.dateNaissance);
	}
		
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Pr�nom : "+prenom+"\n"+
		"N�(e) le : "+dateNaissance+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	
	public boolean equals(Object obj) {
		boolean res=false;
		if(obj instanceof Personne) {
			Personne objPersonne=(Personne)obj;
			res=(objPersonne.getNom().equals(this.nom) && objPersonne.getPrenom().equals(this.prenom));
		}
		return res;
	}
}

