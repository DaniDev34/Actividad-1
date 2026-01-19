public class Empleado {
    // atributos
    private String idempleado;
    private String nombre;
    private String puesto;

    // constructor
    public Empleado(String idempleado, String nombre, String puesto) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    // metodos
    public void mostrarInfo() {
        System.out.println("---------------------------");
        System.out.println("información del Empleado: ");
        System.out.println("ID: " + idempleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
    }
}