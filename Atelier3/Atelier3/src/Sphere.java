public class Sphere extends Forme3D  {

    private int rayon;
    private static final double PI=Math.PI;

    public Sphere(String nom, int rayon){
        super(nom);
        this.rayon=rayon;
    }
    
    @Override
    public double CalculSurface() {
        return 4*PI*(Math.pow(rayon, 2));
    }
    @Override
    public double volume() {
        return (4/3)*PI*Math.pow(rayon, 3);
    }

    @Override
    public String toString() {
        return super.toString()+"\nCet objet est une Sphère avec un rayon de "+rayon+
        " mm\n La surface est de "+CalculSurface()+" mm²\n Le volume est de "+volume()+" mm³";
    }
}
