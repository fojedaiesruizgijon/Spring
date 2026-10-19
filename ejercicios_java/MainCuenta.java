public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana");
        Cuenta c2 = new Cuenta("Luis", 150.50);

        c1.ingresar(100);
        c1.ingresar(-20);      // no hace nada
        c2.retirar(50.25);
        System.out.println(c1);
        System.out.println(c2);

        c2.retirar(1000);      // se queda a 0
        System.out.println(c2);
    }
}
