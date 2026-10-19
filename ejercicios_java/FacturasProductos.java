import java.util.Scanner;

// Ejercicio c) Igual que b), pero el precio depende del producto:
// 1 -> 0,6 €/l   2 -> 3 €/l   3 -> 1,25 €/l
public class FacturasProductos {

    private static double precioPorLitro(int codigo) {
        switch (codigo) {
            case 1:
                return 0.6;
            case 2:
                return 3;
            case 3:
                return 1.25;
            default:
                return -1; // código no válido
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double facturacionTotal = 0;
        double litrosArticulo1 = 0;
        int facturasMas600 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura " + i);
            int codigo;
            double precio;
            do {
                System.out.print("Código del artículo (1, 2 o 3): ");
                codigo = sc.nextInt();
                precio = precioPorLitro(codigo);
                if (precio < 0) {
                    System.out.println("Código no válido.");
                }
            } while (precio < 0);

            System.out.print("Cantidad vendida (litros): ");
            double litros = sc.nextDouble();

            double importe = litros * precio;
            facturacionTotal += importe;
            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importe > 600) {
                facturasMas600++;
            }
        }

        System.out.println("Facturación total: " + facturacionTotal + " €");
        System.out.println("Litros vendidos del artículo 1: " + litrosArticulo1);
        System.out.println("Facturas de más de 600 €: " + facturasMas600);
        sc.close();
    }
}
