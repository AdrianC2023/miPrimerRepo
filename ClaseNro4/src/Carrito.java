import java.time.LocalDate;
import java.util.Scanner;

public class Carrito {

//Atributos
    private Persona persona;
    private Producto tipoProducto[];
    //private Double total;
    private int cantProducto;

//Constructor
    public Carrito(Persona persona) {
        //this.total = 0.0;
        this.cantProducto = 0;
        this.persona = persona;
        this.tipoProducto = new Producto[3];
    }

//Metodos
    public Persona getPersona() {
        return persona;
    }

    public boolean agregarProducto(Producto producto) {
        if (cantProducto < 3) {
            tipoProducto[cantProducto] = producto;
            cantProducto++;
            return true;
        } else{
            return false;
        }
    }

    public Double importeTotal() {
        Double total = 0.0;
        for (int i=0; i<cantProducto; i++) {
            total = total + tipoProducto[i].getPrecio();
        }
        return total;
    }
}
