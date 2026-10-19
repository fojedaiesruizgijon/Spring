import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOrdenacion2 {
    public static void main(String[] args) {
        Boligrafo boli1 = new Boligrafo("Pilot", "SuperGrip", 1);
        Boligrafo boli2 = new Boligrafo("Pilot", "G2", 1.3);
        Boligrafo boli3 = new Boligrafo("Bic", "Cristal", 0.5);
        Boligrafo boli4 = new Boligrafo("Pilot", "G2", 1.3);

        System.out.println("compareTo boli1 con boli2 (marca): " + boli1.compareTo(boli2));
        System.out.println("compareTo boli2 con boli4 (marca): " + boli2.compareTo(boli4));
        System.out.println("¿boli2 es igual a boli4? " + boli2.equals(boli4));
        System.out.println("¿boli1 es igual a boli2? " + boli1.equals(boli2));

        List<Boligrafo> bolis = new ArrayList<>();
        bolis.add(boli1);
        bolis.add(boli2);
        bolis.add(boli3);
        bolis.add(boli4);

        Collections.sort(bolis); // por marca
        System.out.println("\nOrdenados por marca:");
        for (Boligrafo b : bolis) {
            System.out.println(b);
        }
    }
}
