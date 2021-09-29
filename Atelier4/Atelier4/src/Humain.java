package Atelier4.src;

public class Humain extends Personnage{

    private int nbDeplacements;
    private int niveau;

    //Constructeur
    public Humain(String nom, int age){
        super(nom, age);
        nbDeplacements=0;
        niveau=1;
    }

    //Méthodes
    public void deplacer(int destination, int gain){
        nbDeplacements++;
        super.deplacer(destination, gain);
        if (nbDeplacements>3)
            niveau=2;
        else if(nbDeplacements>5)
            niveau=3;
    }

    public int positionSouhaitee(){
        return position+=niveau*nbDeplacements;
    }

    @Override
    public String toString() {
        return "Humain "+nom;
    }    
}
