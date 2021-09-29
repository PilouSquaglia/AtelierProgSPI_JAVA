package Atelier4.src;

public class App {
    public static void main(String[] args) throws Exception {
       
        Joueur j = new Joueur("Pilou");
        Joueur j2 = new Joueur("Thomas");
        Personnage p1 = new Tauren("Allain", 16, 2);
        Personnage p2 = new Tauren("Henri", 40, 3);
        j.ajouterPersonnage(p1);
        j.ajouterPersonnage(p2);
        j.modifierPoints(15);
        System.out.println(j);
        System.out.println(j2);
        //System.out.println(j.peutJouer());
        //System.out.println(j2.peutJouer());
        Obstacle o = new Obstacle(40);
        //Case c = new Case(28);
        Case c2 = new Case(o,28);
        c2.placerPersonnage(p1);
        System.out.println(c2);
    }
}
