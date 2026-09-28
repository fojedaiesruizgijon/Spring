package Repaso.tema1;
import java.util.*;
/*

Ejercicio a) Función a la que se le pasan dos enteros y muestra todos los números 
comprendidos entre ellos, ambos incluidos. (Ten en cuenta que el usuario puede poner 
el valor más pequeño en el 1º número o en el 2º número)
*/
public class Ej0 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("introduce los dos numeros");
        int n1=s.nextInt();
        int n2=s.nextInt();
        metodo(n1, n2);
       
        
    }
     public static void metodo( int a , int b){
            if (a>b) {
                for (int i = b; i < a; i++) {
                System.out.println(i);
                }
            }
            else{
                if (a<b) {
                for (int i = a; i < b; i++) {
                System.out.println(i);
                }
            }
            }
        }
}
