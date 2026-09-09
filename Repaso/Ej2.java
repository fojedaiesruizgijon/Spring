package Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("dime tu nombre ");
        String nomb=s.next();
        System.out.println("dime los numeros ");
       
        double num1=s.nextDouble();
        double num2=s.nextDouble();
        System.out.println("nombre "+nomb+" division: "+num1/num2);
        // 1. Crear la instancia de Random
        Random random = new Random();

        // Número entero entre 0 (inclusive) y 10 (exclusive) -> [0, 9]
        int numeroEntero = random.nextInt(10);

        // Número entero en un rango específico, por ejemplo de 1 a 6 (como un dado)
        int dado = random.nextInt(6) + 1;

        // desde el numero 6 hasta el 15
        
        int numero = random.nextInt(6) + 15;

        // Imprimir resultados
        System.out.println("Número aleatorio (0-9): " + numeroEntero);
        System.out.println("Tirada de dado (1-6): " + dado);
      
    }
}
