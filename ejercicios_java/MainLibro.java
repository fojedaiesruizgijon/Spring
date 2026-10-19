public class MainLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("978-84-376-0494-7", "Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro l2 = new Libro("978-84-204-8201-6", "Cien años de soledad", "Gabriel García Márquez", 471);

        System.out.println(l1);
        System.out.println(l2);

        if (l1.getNumPaginas() > l2.getNumPaginas()) {
            System.out.println("El libro con más páginas es: " + l1.getTitulo());
        } else if (l2.getNumPaginas() > l1.getNumPaginas()) {
            System.out.println("El libro con más páginas es: " + l2.getTitulo());
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}
