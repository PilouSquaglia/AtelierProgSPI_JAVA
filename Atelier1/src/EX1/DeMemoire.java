package EX1;

public class DeMemoire extends De{
	
	private int res_prec=0;
	
	public DeMemoire(String nom, int nbFaces) {
		super(nom, nbFaces);
	}
	
	public int lancer(int nbLancer) {
		int res=0;
		for (int i = 0 ; i<nbLancer ; i++) {
			res=lancer();
			while(res_prec==res) {
				res=lancer();
				res_prec=res;
			}
		}
		return res;
	}
	
}
