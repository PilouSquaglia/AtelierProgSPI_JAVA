package Atelier4.src;

public abstract class Personnage {
    
    protected String nom;
    protected int age;
    protected int position;
    private Joueur proprietaire;

    //Constructeur
    public Personnage(String nom, int age){
        this.nom=nom;
        this.age=age;
    }

    //Méthodes
    public void deplacer(int destination, int gain){
        this.position=destination;
        this.proprietaire.modifierPoints(gain);
    }
    public void penaliser(int penalite){
        this.proprietaire.modifierPoints(-penalite);
    }
    @Override
    public String toString() {
        return nom;
    }
    public abstract int positionSouhaitee();
}
