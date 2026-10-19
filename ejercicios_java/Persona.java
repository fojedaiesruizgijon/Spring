import java.util.Random;

public class Persona {
    public static final char HOMBRE = 'H';
    public static final char MUJER = 'M';
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = HOMBRE;
    private double peso = 0;
    private double altura = 0;

    // Constructor por defecto
    public Persona() {
        generaDNI();
    }

    // Nombre, edad y sexo; el resto por defecto
    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    // Todos los atributos
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    /** -1: por debajo del peso ideal, 0: peso ideal, 1: sobrepeso */
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Si el sexo no es correcto, será H
    private char comprobarSexo(char sexo) {
        char s = Character.toUpperCase(sexo);
        return (s == HOMBRE || s == MUJER) ? s : HOMBRE;
    }

    // Genera 8 cifras aleatorias y calcula la letra
    private void generaDNI() {
        int numero = new Random().nextInt(100_000_000);
        this.dni = String.format("%08d", numero) + calcularLetra(numero);
    }

    private char calcularLetra(int numero) {
        return LETRAS_DNI.charAt(numero % 23);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean tieneDatosFisicos() {
        return peso > 0 && altura > 0;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + dni
                + ", sexo=" + sexo + ", peso=" + peso + " kg, altura=" + altura + " m]";
    }
}
