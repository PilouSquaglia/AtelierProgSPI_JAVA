import java.util.*;
public class De {
	
	protected String nom;
	protected int nbFaces;
	private static Random r = new Random();
	private static int nbDe = 0;
	
	public De(String nom, int nbFaces) {
		this.nom=nom;
		if (testNbFaces(nbFaces))
			this.nbFaces=nbFaces;
	}
	public De(String nom) {
		this.nom=nom;
		nbFaces=6;
	}
	public De(int nbFaces) {
		nbDe+=1;
		nom="De n�"+nbDe;
		if (testNbFaces(nbFaces))
			this.nbFaces=nbFaces;
		else {
			nbFaces=6;
		}
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public int getNbFaces() {
		return nbFaces;
	}
	public void setNbFaces(int nbFaces) {
		this.nbFaces=nbFaces;
	}
	
	public boolean testNbFaces(int nbFaces) {
	boolean res=false;
	
	if (nbFaces>=3 && nbFaces<=120) {
		System.out.println("Nombre correct");
		res=true;
	}
	else{
		System.err.println("Erreur dans la saisie du nombre de faces");
	}
	return res;
	}
	public int lancer() {
		int nbAleatoire= r.nextInt(6)+1;
		return nbAleatoire*nbFaces;
	}
	public int lancer(int nbLancer) {
		int meilleurLancer=0;
		int resultat=0;
		for (int i = 0 ; i<nbLancer ; i++) {
			resultat=lancer();
			if (resultat>meilleurLancer)
				meilleurLancer=resultat;
		}
		return meilleurLancer;
			
	}
	public String toString() {
		return this.nom+" "+this.nbFaces+" faces";
	}
	public boolean equals(Object objet) {
		return objet instanceof De && this.nbFaces==((De)objet).nbFaces;
			
	}
}
