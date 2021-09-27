package EX1;

public class TestDe {
	
	public static void main(String[] args){
		
		//De D1 = new De("Dé 1", 2);
		/*System.out.println("Le dé s'appelle "+D1.getNom());
		System.out.println("Le dé a "+D1.getNbFaces()+" faces");*/
		//De D2 = new De("Dé 1");
		/*System.out.println("Le dé s'appelle "+D2.getNom());
		System.out.println("Le dé a "+D2.getNbFaces()+" faces");
		System.out.println("On lance le dé "+ D2.getNom() + " et on obtient "+D2.lancer());
		*/
		De D3 = new De(3);
		/*System.out.println("Le dé s'appelle "+D3.getNom());
		System.out.println("Le dé a "+D3.getNbFaces()+" faces");*/
		De D4 = new De(7);
		/*System.out.println("Le dé s'appelle "+D4.getNom());
		System.out.println("Le dé a "+D4.getNbFaces()+" faces");
		System.out.println("On lance le dé "+ D4.getNom() + " et on obtient "+D4.lancer(10));
		System.out.println(D4.toString());
		System.out.println(D4.equals(D3));*/
		//DePipe D5 = new DePipe("De Pipe", 6,20);
		//System.out.println("On lance le dé "+ D5.getNom() + " et on obtient "+D5.lancer(10));
		DeMemoire D6 = new DeMemoire("De Mémoire", 6);
		System.out.println("On lance le dé "+ D6.getNom() + " et on obtient "+D6.lancer(10));
	}

}
