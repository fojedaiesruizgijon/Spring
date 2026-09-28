public class Ejercicio1 {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- Ejercicio a) ----------
        System.out.println("--- Ejercicio a) ---");
        System.out.print("Escribe la primera cadena (str1): ");
        String str1 = sc.nextLine();
        System.out.print("Escribe la segunda cadena (str2): ");
        String str2 = sc.nextLine();

        String out1 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str2.indexOf(str1.charAt(i)) == -1) {
                out1 += str1.charAt(i);
            }
        }

        String out2 = "";
        for (int i = 0; i < str2.length(); i++) {
            if (str1.indexOf(str2.charAt(i)) == -1) {
                out2 += str2.charAt(i);
            }
        }

        System.out.println("out1=" + out1);
        System.out.println("out2=" + out2);
    }}