import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<FormeGeo> formes_geo=new ArrayList<FormeGeo>();

        formes_geo.add(new Ellipse("test", 10, 8));
        FormeGeo c1 = new Cercle("test", 10);
        FormeGeo r1 = new Rectangle("test", 10, 8);
        FormeGeo s1 = new Sphere("test", 10);
        FormeGeo s2 = new Sphere("test", 10);
        FormeGeo cy1 = new Cylindre("test", 10, 10);
        FormeGeo cy2 = new Cylindre("test", 10, 8);
    

        //System.out.println(r1.isBigger(s1));
        //System.out.println(s2.equals(s1));
        //System.out.println(cy2.equals(s1));
        //System.out.println(e1.equals(c1));

    }
}
