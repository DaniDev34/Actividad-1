public class Registrarventa {
    public static void main(String[] args) {

    //venta 1 
        Cliente cliente1 = new Cliente("91234", "Carla Martinez", "carla.martinez@email.com");
        Empleado empleado = new Empleado("812735", "Juan Casiano", "Vendedor");
        videojuego videojuego = new videojuego("F9826", "Doom Eternal", "FPS Shooter", 600.99);
        Venta venta = new Venta("746554", cliente1, empleado, videojuego, "18 /01/2026");

        venta.generarTicket();

        System.out.println("Venta registrada con éxito.");
        System.out.println("-------------------------");
        // generar mas ventas
//venta 2
        Cliente cliente2 = new Cliente("72365", "Carlos Gonzales", "carlos.martinez@email.com");
        Empleado empleado2 = new Empleado("812735", "Juan Casiano", "Vendedor");
        videojuego videojuego2 = new videojuego("F2345", "Mario Kart", "Juego de carreras", 1599.99);
        Venta venta2 = new Venta("948458", cliente2, empleado2, videojuego2, "18 /01/2026");

        venta2.generarTicket();

        System.out.println("Venta registrada con éxito.");
        System.out.println("-------------------------");
    //venta 3
        Cliente cliente3 = new Cliente("28376", "Daniel Perez", "daniel.perez@email.com");
        Empleado empleado3 = new Empleado("812735", "Juan Casiano", "Vendedor");
        videojuego videojuego3 = new videojuego("F7263", "Resident Evil 4 Remake", "Survival Horror", 699.99);
        Venta venta3 = new Venta("923865", cliente3, empleado3, videojuego3, "13 /12/2025");


        venta3.generarTicket();

        System.out.println("Venta registrada con éxito.");
        System.out.println("-------------------------");
    }
}