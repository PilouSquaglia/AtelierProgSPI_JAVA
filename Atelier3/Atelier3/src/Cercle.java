public class Cercle extends Forme2D  {

    private int rayon;
    private static final double PI=Math.PI;

    public Cercle(String nom, int rayon){
        super(nom);
        this.rayon=rayon;
    }
    public int getRayon() {
        return rayon;
    }
    
    @Override
    public double CalculSurface() {
        return PI*(Math.pow(rayon, 2));
    }
    @Override
    public double perimetre() {
        return 2*PI*rayon;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCet objet est un Cercle avec un rayon de "+rayon+
        " mm\n L'aire est de "+CalculSurface()+" mm²\n Le perimètre est de "+perimetre()+" mm";
    }
}
