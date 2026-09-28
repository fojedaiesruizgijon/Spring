import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- Ejercicio a) ----------
        System.out.println("--- Ejercicio a) ---");
        try {
            System.out.print("Primer número: ");
            int n1 = sc.nextInt();

            System.out.print("Segundo número: ");
            int n2 = sc.nextInt();

            Funciones.mostrarEntre(n1, n2);
        } catch (Exception e) {
            System.out.println("Error: debes introducir un número entero.");
            sc.close();
            return;
        }

        // ---------- Ejercicio b) ----------
        System.out.println("\n--- Ejercicio b) ---");
        try {
            System.out.print("¿Cuántos números impares quieres sumar?: ");
            int n = sc.nextInt();

            System.out.println("La suma de los " + n + " primeros impares es: "
                    + Funciones.sumarImpares(n));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            sc.close();
            return;
        } catch (Exception e) {
            System.out.println("Error: debes introducir un número entero.");
            sc.close();
            return;
        }

        // ---------- Ejercicio c) ----------
        System.out.println("\n--- Ejercicio c) ---");
        try {
            System.out.print("Radio del círculo: ");
            double radio = sc.nextDouble();

            System.out.print("Lado del cuadrado: ");
            double lado = sc.nextDouble();

            System.out.print("Base del triángulo: ");
            double base = sc.nextDouble();

            System.out.print("Altura del triángulo: ");
            double altura = sc.nextDouble();

            double areaCirculo = Funciones.areaCirculo(radio);
            double areaCuadrado = Funciones.areaCuadrado(lado);
            double areaTriangulo = Funciones.areaTriangulo(base, altura);

            System.out.println("\n--- Resultados ---");
            System.out.printf("Área del círculo: ", areaCirculo);
            System.out.printf("Área del cuadrado: ", areaCuadrado);
            System.out.printf("Área del triángulo:      ", areaTriangulo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: debes introducir un número válido.");
        }

        sc.close();
    }
}