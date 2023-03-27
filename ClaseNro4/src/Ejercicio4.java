import java.time.LocalDate;

public class Ejercicio4 {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Adrian","Colque",LocalDate.of(1991,11,9));

        Carrito carrito1 = new Carrito(persona1);

        Producto producto1 = new Producto("Jabon en polvo",40.0);
        Producto producto2 = new Producto("Esponja", 10.0);
        Producto producto3 = new Producto("Chocolaes", 100.0);

        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto2);
        carrito1.agregarProducto(producto3);

        System.out.println("Importe total: "+carrito1.importeTotal());
    }
}