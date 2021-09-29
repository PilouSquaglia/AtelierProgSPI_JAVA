package Atelier4.src;
import java.util.ArrayList;

public class Jeu {

    private String titre;
    private static final int NBJOUEURMAX=6; //correspond au nombre maximum de joueurs pouvant être inscrits à un jeu
    private static final int NBCASES=50; //correspond au nombre de cases du tableau sur lequel se déplacent les personnages
    private ArrayList<Joueur>listeJoueurs = new ArrayList<Joueur>(); //représentant la liste des joueurs inscrits au jeu
    private Case[] cases; //représentant la liste des cases du jeu
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
        return 
    }
}
