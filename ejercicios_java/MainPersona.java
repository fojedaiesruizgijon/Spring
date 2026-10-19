import java.util.Scanner;

public class MainPersona {

    private static void mostrarPeso(Persona p) {
        if (!p.tieneDatosFisicos()) {
            System.out.println("  Peso: no hay datos de peso/altura.");
            return;
        }
        switch (p.calcularIMC()) {
            case -1:
                System.out.println("  Peso: está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("  Peso: está en su peso ideal.");
                break;
            default:
                System.out.println("  Peso: tiene sobrepeso.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Sexo (H/M): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        // Objeto 1: todos los datos pedidos por teclado
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        // Objeto 2: sin peso ni altura
        Persona p2 = new Persona(nombre, edad, sexo);
        // Objeto 3: por defecto, rellenado con setters
        Persona p3 = new Persona();
        p3.setNombre("Pedro");
        p3.setEdad(17);
        p3.setSexo('H');
        p3.setPeso(70);
        p3.setAltura(1.75);

        Persona[] personas = {p1, p2, p3};
        for (int i = 0; i < personas.length; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            mostrarPeso(personas[i]);
            System.out.println("  Mayor de edad: " + (personas[i].esMayorDeEdad() ? "sí" : "no"));
        }

        System.out.println("\nInformación de cada objeto:");
        for (Persona p : personas) {
            System.out.println(p);
        }
        sc.close();
    }
}
