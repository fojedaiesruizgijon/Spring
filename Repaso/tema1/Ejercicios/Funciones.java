public class Funciones {

    // Ejercicio a)
    public static void mostrarEntre(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }

    // Ejercicio b)
    public static int sumarImpares(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo.");
        }
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += 2 * i + 1;
        }
        return suma;
    }

    // Ejercicio c)
    public static double areaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo.");
        }
        return Math.pow(radio, 2) * Math.PI;
    }

    public static double areaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("La base y la altura no pueden ser negativas.");
        }
        return (base * altura) / 2;
    }

    public static double areaCuadrado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("El lado no puede ser negativo.");
        }
        return lado * lado;
    }
}