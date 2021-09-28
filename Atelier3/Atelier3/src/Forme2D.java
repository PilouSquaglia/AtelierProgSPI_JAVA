abstract public class Forme2D extends FormeGeo{

    private double perimetre=CalculPerimetre();
    
    public Forme2D(String nom){
        super(nom);
    }

    public abstract double CalculPerimetre();

    public boolean isBigger(Forme2D forme2D) {
        
        return super.isBigger(forme2D) && this.perimetre>forme2D.perimetre;
    }

    public double getPerimetre() {
        return perimetre;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && this.perimetre == ((Forme2D)obj).getPerimetre();
    }
}
