package EX1;

public class DePipe extends De{
	
	private final int nbMini;
	
	public DePipe(String nom, int nbFaces, int nbMini) {
		super(nom, nbFaces);
		if (testNbFaces(nbFaces))
			this.nbFaces=nbFaces;
		this.nbMini=nbMini;
	}
	
	public int lancer(int nbLancer) {
		int max=nbMini;
		for (int i = 0 ; i<nbLancer ; i++) {
			int res=lancer();
			if (res>nbMini)
				max=res;
		}
		return max;
		
	}
}