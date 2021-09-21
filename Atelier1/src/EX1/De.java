package EX1;

public class De {
	
	private String nom;
	private int nbFaces;
	
	public De(String nom, int nbFaces) {
		this.nom=nom;
		this.nbFaces=nbFaces;
	}
	public int getNbFaces() {
		return nbFaces;
	}
	public void setNbFaces(int nbFaces) {
		this.nbFaces=nbFaces;
	}
	
	public boolean testNbFaces(int nbFaces) {
	boolean res=false;
	
	if (nbFaces>3 && nbFaces<120) {
		System.out.println("Nombre correct");
		res=true;
	}
	else{
		System.err.println("Erreur dans la saisie du nombre de faces");
	}
	return res;
}
}
