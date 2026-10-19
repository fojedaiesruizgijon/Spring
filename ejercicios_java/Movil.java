// Ordenación natural: por precio (compareTo)
public class Movil implements Comparable<Movil> {
    private String marca;   // marca y modelo, p. ej. "Samsung S20"
    private double precio;

    public Movil(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() { return marca; }
    public double getPrecio() { return precio; }

    @Override
    public int compareTo(Movil otro) {
        return Double.compare(this.precio, otro.precio);
    }

    @Override
    public String toString() {
        return marca + " (" + precio + " euros)";
    }
}
