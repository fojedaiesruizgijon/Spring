package Repaso.tema1;

import java.util.Scanner;

/*
Ejercicio b) Escriba una función que sume los n primeros números impares de un valor 
elegido por el usuario

*/
public class Ej1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el numero");
        int n1=s.nextInt();
        System.out.println("introduce los numeros que desea que haga impares");
        int n2=s.nextInt();
        metodo2(n1 , n2);
        

    }
      public static void metodo2( int a , int b){
            int cont =0;
                for (int i = a; ; i++) {
                    if (!(i%2==0)) {
                           System.out.println(i);
                           cont++;
                        if (cont==b) {
                            break;
                        }
                        }
                }
            
        }
}
