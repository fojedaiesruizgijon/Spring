import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainOrdenacion1 {
    public static void main(String[] args) {
        // Apartado 1: ordenar por precio
        List<Movil> lista1 = new ArrayList<>();
        lista1.add(new Movil("iPhone 12 Pro Max", 1259));
        lista1.add(new Movil("Xiaomi Mi 10 Pro", 999));
        lista1.add(new Movil("Huawei P40 Pro+", 1399));
        lista1.add(new Movil("Samsung Z Flip 5G", 1550));
        lista1.add(new Movil("Samsung S20", 1500));
        lista1.add(new Movil("LG V50", 899));

        Collections.sort(lista1); // usa compareTo (precio)
        System.out.println("Apartado 1: ordenados por precio");
        for (Movil m : lista1) {
            System.out.println(m);
        }

        // Apartado 2: por precio y, a igual precio, por marca alfabéticamente
        List<Movil> lista2 = new ArrayList<>();
        lista2.add(new Movil("Xiaomi Mi 10 Pro", 999));
        lista2.add(new Movil("Huawei P40 Pro+", 1399));
        lista2.add(new Movil("Samsung Z Flip 5G", 1550));
        lista2.add(new Movil("Samsung S30", 1300));
        lista2.add(new Movil("Huawei P50 Pro+", 1399));
        lista2.add(new Movil("Samsung Z Flip 5G", 1550));

        lista2.sort(Comparator.comparingDouble(Movil::getPrecio)
                .thenComparing(Movil::getMarca));
        System.out.println("\nApartado 2: por precio y luego por marca");
        for (Movil m : lista2) {
            System.out.println(m);
        }
    }
}
