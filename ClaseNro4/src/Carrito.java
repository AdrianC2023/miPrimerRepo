import java.time.LocalDate;

public class Carrito {

//Atributos
    private String persona;
    private Producto[] productos;
    private LocalDate fechaDeCompra;

//Constructor
    public Carrito(String persona, LocalDate fechaDeCompra) {
        this.persona = persona;
        this.productos = new Producto[3];
        this.fechaDeCompra = LocalDate.now();
    }

//Metodos
    public String getPersona() {
        return persona;
    }
    public Producto[] getProductos() {
        return productos;
    }
    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }
}
