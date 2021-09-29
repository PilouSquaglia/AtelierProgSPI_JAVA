public class Rectangle extends Forme2D  {

    private int longueur;
    private int largeur;

    public Rectangle(String nom, int longueur, int largeur){
        super(nom);
        this.longueur=longueur;
        this.largeur=largeur;
    }
    
    @Override
    public double CalculSurface() {
        return longueur*largeur;
    }
    @Override
    public double perimetre() {
        return 2*longueur+2*largeur;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCet objet est un Rectangle avec une longueur de "+longueur+
        " mm et une largeur de "+largeur+" mm\n L'aire est de "+
        CalculSurface()+" mm²\n Le perimètre est de "+perimetre()+" mm";
    }
}
