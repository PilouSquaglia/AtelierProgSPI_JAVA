import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<FormeGeo> formes_geo=new ArrayList<FormeGeo>();
        ArrayList<FormeGeo> formes_geo_big=new ArrayList<FormeGeo>();

        //Test affichage des formes (toString())
        formes_geo.add(new Ellipse("test", 10, 8));
        formes_geo.add(new Cercle("test", 10));
        formes_geo.add(new Rectangle("test", 10, 8));
        formes_geo.add(new Sphere("test", 10));
        formes_geo.add(new Cylindre("test", 10, 10));
        formes_geo.forEach(forme -> System.out.println(forme));

        //Test de la fonction isBigger()
        formes_geo_big.add(new Ellipse("test", 15, 8));
        formes_geo_big.add(new Cercle("test", 15));
        formes_geo_big.add(new Rectangle("test", 15, 8));
        formes_geo_big.add(new Sphere("test", 15));     
        formes_geo_big.add(new Cylindre("test", 15, 8));
        //formes_geo_big.forEach(forme -> System.out.println(forme.isBigger(formes_geo.get(formes_geo_big.indexOf(forme)))));
        
    }
}
