package Atelier4.src;
import java.util.ArrayList;

public class Joueur {

    private String nom;
    private String code;
    private static int nbJoueurs=0;
    private int nbPoints;
    private ArrayList<Personnage> listePersos = new ArrayList<Personnage>();

    //Constructeur
    public Joueur(String nom){
        this.nom=nom;
        nbJoueurs++;
        code="J"+nbJoueurs;
        nbPoints=0;
    }

    //Méthodes

    public void ajouterPersonnage(Personnage p){
        listePersos.add(p);
    }

    public void modifierPoints(int nb){
            nbPoints+=nb;
    }

    public boolean peutJouer(){
        return listePersos.size()>=1;
    }
    
    public int getNbPoints() {
        return nbPoints;
    }

    @Override
    public String toString() {
        String res;
        if (listePersos.size()==0)
            res = code+" "+nom+" ("+nbPoints+" point) aucun personnage";
        else{
            res = code+" "+nom+" ("+nbPoints+" points) avec "+listePersos.size()+" personnages";
        }
        return res;
    }
}
