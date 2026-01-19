public class Venta {
    // atributos
    private String idVenta;
    private Cliente cliente;
    private Empleado empleado;
    private videojuego videojuego;
    private String fechaVenta;

    // constructor
    public Venta(String idVenta, Cliente cliente, Empleado empleado, videojuego videojuego, String fechaVenta) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.videojuego = videojuego;
        this.fechaVenta = fechaVenta;
    }

    // metodos

    // metodo para tener ticket de venta
    public void generarTicket() {
        System.out.println("------- Ticket de Venta -------");
        System.out.println("ID de la Venta: " + idVenta);
        System.out.println("Fecha de Venta: " + fechaVenta);
        cliente.mostrarInfo();
        empleado.mostrarInfo();
        videojuego.mostrarInfo();
        System.out.println("-------------------------------");
    }
}