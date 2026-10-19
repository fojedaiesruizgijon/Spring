// Ordenación natural: por marca (compareTo)
public class Boligrafo implements Comparable<Boligrafo> {
    private String marca;
    private String modelo;
    private double precio;

    public Boligrafo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }

    @Override
    public int compareTo(Boligrafo otro) {
        return this.marca.compareTo(otro.marca);
    }

    // Dos bolígrafos son iguales si coinciden marca, modelo y precio
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boligrafo)) return false;
        Boligrafo b = (Boligrafo) o;
        return marca.equals(b.marca) && modelo.equals(b.modelo)
                && Double.compare(precio, b.precio) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(marca, modelo, precio);
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + precio + "€";
    }
}
