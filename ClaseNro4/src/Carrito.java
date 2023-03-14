import java.time.LocalDate;
import java.util.Scanner;

public class Carrito {

//Atributos
    private Persona persona;
    private Producto[] tipoProducto;
    private Double total = 0.0;

//Constructor
    public Carrito(Persona persona) {
        this.persona = persona;
        this.tipoProducto = new Producto[3];
    }

//Metodos
    public Persona getPersona() {
        return persona;
    }
    public void agregarProducto(Producto producto) {

        total = total + producto.getPrecio();
       //for (int i=0; i<tipoProducto.length; i++) {
            //tipoProducto[3] = producto;
       //}
    }

    public Double importeTotal() {
        Double total = 0.0;
        for (int i=0; i<tipoProducto.length; i++) {
            Producto producto = tipoProducto[i];
            total = total + producto.getPrecio();
        }
        System.out.println("Importe Total: "+total);
        return total;
    }
}
