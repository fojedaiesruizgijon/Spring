package Repaso.tema1.clas_String;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String s1="holaz";
        String s2="adiosz";
        String [] s1n= s1.split("");
        String [] s2n= s2.split("");
        String s1out="";
      for (String string : s1n) {
        System.out.println(string);
        for (String string2 : s2n) {
            if (!(string.contains(string2))) {
                 s1out+=string;
                
            }
        }
      }
     System.out.println(s1out);
    }
}
