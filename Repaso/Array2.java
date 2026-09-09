package Repaso;
import java.util.Random;
public class Array2 {
    public static void main(String[] args) {
            Random random = new Random();
        int[] num = new int[10];
           int[] n2 = new int[10];
           int[][] n3 = new int[5][4];
           int f=0;
          int c=0;

           int cont=0;
num[0] = 32;
 
num[1] = -2;
num[4] = 1;

num[6] = 14;

num[8] = 5;
num[9] = 120;
for (int i = 0; i < 10; i++) {
    System.out.println(num[i]);
}
for (int i = 0; i < 10; i++) {
     int numeroEntero = random.nextInt(100);
    n2[i]=numeroEntero;
}
for (int i = 0; i < 10; i++) {
    System.out.println("numero: "+n2[i]+ " cuadrado: "+n2[i]*n2[i]+" cubo: "+n2[i]*n2[i]*n2[i]);
}
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 4; j++) {
         n3[i][j] = random.nextInt(100);
    }
   
   System.out.println();
}

for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 4; j++) {
        f+= n3[i][j];
        cont+=n3[i][j];
    System.out.print(" " +n3[i][j]); 
    if (j==3) {
        System.out.print(" sumatorio  "+f);
 
       
    }   
    
    }
    
   System.out.println();
   f=0;
}

for (int j = 0; j < 4; j++) {
    for (int i = 0; i < 5; i++) {
        c += n3[i][j];
         
            }
            System.out.print(c + " "); // Imprimimos la suma de la columna j
            c = 0;

    }
    System.out.println("total:  "+cont);
}

    }


