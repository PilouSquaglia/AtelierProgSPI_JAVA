package Atelier4.src;

public class Case {

    private int gain;
    private Personnage perso;
    private Obstacle obs;
    
    //Constructeurs
    public Case(Obstacle obs, int gain){
        this.obs=obs;
        this.gain=gain;
    }

    public Case(int gain){
        this.gain=gain;
        obs=null;
    }

    //Méthodes
    public int getPenalite(){
        int res;
        if (obs==null)
            res=0;
        else{
            res=obs.getPenalite();
        }
        return res;
    }

    public void placerPersonnage(Personnage perso){
        this.perso=perso;
    }

    public void placerObstacle(Obstacle obs){
        this.obs=obs;
    }

    public void enleverPersonnage(){
        this.perso=null;
    }

    public boolean estLibre(){
        return obs==null && perso==null;
    }

    public boolean sansObstacle(){
        return obs==null;
    }
    
    public boolean sansPerso(){
        return perso==null;
    }

    @Override
    public String toString() {
        String res;
        if (estLibre())
            res="Libre (gain = "+gain+")";
        else if (!sansObstacle() && perso==null)
            res="Obstacle (pénalité = -"+getPenalite()+")";
        else{
            res=perso.toString()+" (pénalité = -"+getPenalite()+")";
        }
        return res;
    }
}
