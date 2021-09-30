package Atelier4.src;
import java.util.ArrayList;

public class Jeu {

    private String titre;
    private static final int NBJOUEURMAX=6; //correspond au nombre maximum de joueurs pouvant être inscrits à un jeu
    private static final int NBCASES=50; //correspond au nombre de cases du tableau sur lequel se déplacent les personnages
    private ArrayList<Joueur>listeJoueurs = new ArrayList<Joueur>(); //représentant la liste des joueurs inscrits au jeu
    private ArrayList<Case> cases; //représentant la liste des cases du jeu
    private int nbEtapes; //correspondantau nombre de déplacements à réaliser par chacun despersonnages au cours du déroulementdu jeu
    private int nbObstacles; //correspondantau nombre maximum d’obstacles présents dans le tableau des case
    private int scoreMax; //représentant  le  score  maximum  obtenusur l’ensemble des lancements de jeux

    //Constructeur

    public Jeu(String titre, int nbEtapes, int nbObstacles){
        this.titre=titre;
        this.nbEtapes=nbEtapes;
        this.nbObstacles=nbObstacles;
    }

    //Méthodes
    public void ajouterJoueur(Joueur j){
        listeJoueurs.add(j);
    }

    public ArrayList<Personnage> tousLesPersos(){
        ArrayList<Personnage> res=new ArrayList<Personnage>();
        for(Joueur j:listeJoueurs){
            ArrayList<Personnage> listePersos=j.getListePersos();
            if (listePersos!=null)
            res.addAll(listePersos);
        }
        return res;
    }

    public void initialiserCases(){
        int nbObsEff=0;
        for (int i=0;i<NBCASES;i++){
           int gain=(int)(Math.random()*NBCASES);
                if(gain%5==0 && nbObsEff<nbObstacles){
                    Obstacle o = new Obstacle(2*gain);
                    Case c = new Case(o, gain);
                    cases.add(c);
                    nbObsEff++;
                }
                else{
                    Case c = new Case(o, gain);
                    cases.add(c);
                }
        }
    }

    public void lancerJeu(){
        
    }
}
