public class Ellipse extends Forme2D {
    
    private int demi_grand_axe;
    private int demi_petit_axe;
    private static final double PI=Math.PI;

    public Ellipse(String nom, int demi_grand_axe, int demi_petit_axe){
        super(nom);
        this.demi_grand_axe=demi_grand_axe;
        this.demi_petit_axe=demi_petit_axe;
    }

    @Override
    public double CalculSurface() {
        return PI*demi_grand_axe*demi_petit_axe;
    }
    @Override
    public double CalculPerimetre() {
        return 2*PI*(Math.sqrt(((Math.pow(demi_grand_axe, 2))+(Math.pow(demi_petit_axe, 2)))/2));
    }

    @Override
    public String toString() {
        return super.toString()+"\nCet objet est une Ellipse avec un demi-grand axe de "+demi_grand_axe+
        " mm et un demi-petit axe de "+demi_petit_axe+" mm\n L'aire est de "+
        CalculSurface()+"mm² \n Le perimètre est de "+CalculPerimetre()+" mm ";
    }
}
