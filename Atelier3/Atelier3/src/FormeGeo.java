abstract public class FormeGeo {

    private static int nbFormes = 0;
    private final String id;
    private int surface;

    public FormeGeo(String nom){
        nbFormes++;
        id=nom+"_"+nbFormes;
   }

   public abstract double CalculSurface();

   public boolean isBigger(FormeGeo forme){
        return this.surface>forme.surface;
   }
   public int getSurface() {
       return surface;
   }

    @Override
   public String toString() {
       return "Forme : " + id;
   }
   @Override
   public boolean equals(Object obj) {
       return obj!=null && obj instanceof FormeGeo && ((FormeGeo) obj).getSurface() == this.surface;
   }
}
