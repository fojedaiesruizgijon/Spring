import java.util.Scanner;

// Ejercicio b) 5 facturas: codigo, litros y precio por litro
public class Facturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double facturacionTotal = 0;
        double litrosArticulo1 = 0;
        int facturasMas600 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura " + i);
            System.out.print("Código del artículo: ");
            int codigo = sc.nextInt();
            System.out.print("Cantidad vendida (litros): ");
            double litros = sc.nextDouble();
            System.out.print("Precio por litro (€): ");
            double precio = sc.nextDouble();

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
