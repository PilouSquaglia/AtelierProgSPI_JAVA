abstract public class Forme2D extends FormeGeo{

    public Forme2D(String nom){
        super(nom);
    }

    public abstract double perimetre();

    public boolean isBigger(Forme2D forme2D) {
        return super.isBigger(forme2D) && this.perimetre()>forme2D.perimetre();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && this.perimetre() == ((Forme2D)obj).perimetre();
    }
}
