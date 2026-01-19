public class videojuego {
    // atributos
    private String idvideojuego;
    private String titulo;
    private String genero;
    private double precio;

    // constructor
    public videojuego(String idvideojuego, String titulo, String genero, double precio) {
        this.idvideojuego = idvideojuego;
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    // metodos
    public void mostrarInfo() {
        System.out.println("---------------------------");
        System.out.println("Información del Videojuego:");
        System.out.println("ID: " + idvideojuego);
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Precio: $" + precio);
    }
}