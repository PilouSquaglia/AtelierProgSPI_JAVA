public class TestDe {
	
	public static void main(String[] args){
		
		//De D1 = new De("D� 1", 2);
		/*System.out.println("Le d� s'appelle "+D1.getNom());
		System.out.println("Le d� a "+D1.getNbFaces()+" faces");*/
		//De D2 = new De("D� 1");
		/*System.out.println("Le d� s'appelle "+D2.getNom());
		System.out.println("Le d� a "+D2.getNbFaces()+" faces");
		System.out.println("On lance le d� "+ D2.getNom() + " et on obtient "+D2.lancer());
		*/
		De D3 = new De(3);
		/*System.out.println("Le d� s'appelle "+D3.getNom());
		System.out.println("Le d� a "+D3.getNbFaces()+" faces");*/
		De D4 = new De(7);
		/*System.out.println("Le d� s'appelle "+D4.getNom());
		System.out.println("Le d� a "+D4.getNbFaces()+" faces");
		System.out.println("On lance le d� "+ D4.getNom() + " et on obtient "+D4.lancer(10));
		System.out.println(D4.toString());
		System.out.println(D4.equals(D3));*/
		//DePipe D5 = new DePipe("De Pipe", 6,20);
		//System.out.println("On lance le d� "+ D5.getNom() + " et on obtient "+D5.lancer(10));
		DeMemoire D6 = new DeMemoire("De M�moire", 6);
		System.out.println("On lance le d� "+ D6.getNom() + " et on obtient "+D6.lancer(10));
	}

}
