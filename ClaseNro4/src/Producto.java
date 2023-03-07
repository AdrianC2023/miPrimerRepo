import java.time.LocalDate;

public class Producto {

//Atributos
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;

    private static final Double minPrecio = 0.1;

//Constructor
    public Producto(String nombre){
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = minPrecio;
    }

//Metodos
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    public Double getPrecio() {
        return precio;
    }
}
