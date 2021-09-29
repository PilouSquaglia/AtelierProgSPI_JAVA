public class Cylindre extends Forme3D {

    //private int rayon;
    private int hauteur;
    private Cercle cercle;

    public Cylindre(String nom, int rayon, int hauteur){
        super(nom);
        this.hauteur=hauteur;
        cercle = new Cercle(nom, rayon);
    }
    
    @Override
    public double CalculSurface() {
        return 2*cercle.CalculSurface()+hauteur*cercle.perimetre();
    }
    @Override
    public double volume() {
        return cercle.CalculSurface()*hauteur;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCet objet est un Cylindre avec un rayon de "+cercle.getRayon()+
        " mm et une hauteur de "+hauteur+" mm\n La surface est de "+
        CalculSurface()+" mm²\n Le volume est de "+volume()+" mm³ ";
    }

}
