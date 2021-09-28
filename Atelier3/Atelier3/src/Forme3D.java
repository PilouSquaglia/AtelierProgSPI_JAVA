abstract public class Forme3D extends FormeGeo {
    
    public Forme3D(String nom){
        super(nom);
    }

    public abstract double volume();

    public boolean isBigger(Forme3D forme3D) {
        return super.isBigger(forme3D) && this.volume()>forme3D.volume();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && this.volume() == ((Forme3D)obj).volume();
    }
}
