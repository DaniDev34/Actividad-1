public class Cliente {
    // atributos
    private String idCliente;
    private String nombre;
    private String correo;

    // constructor
    public Cliente(String idCliente, String nombre, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
    }

    // metodos
    public void mostrarInfo() {
        System.out.println("---------------------------");
        System.out.println("información del Cliente: ");
        System.out.println("ID: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
    }
}