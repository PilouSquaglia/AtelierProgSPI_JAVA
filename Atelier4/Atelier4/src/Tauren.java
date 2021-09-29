package Atelier4.src;


public class Tauren extends Personnage{

    private int taille;

    //Constructeur
    public Tauren(String nom, int age, int taille ){
        super(nom, age);
        this.taille=taille;
    }

    @Override
    public int positionSouhaitee() {
        return position+=(int)Math.random()*taille;
    }
    @Override
    public String toString() {
        return "Tauren "+nom;
    }
}
