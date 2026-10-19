public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor solo con titular (cantidad opcional)
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Si la cantidad es negativa, no se hace nada
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Si el resultado es negativo, la cuenta queda a 0
    public void retirar(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        double resultado = this.cantidad - cantidad;
        this.cantidad = (resultado < 0) ? 0 : resultado;
    }

    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }
}
