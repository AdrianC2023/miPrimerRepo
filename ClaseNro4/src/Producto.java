import java.time.LocalDate;

public class Producto {

//Atributos
    private String nombre;
    private Double precio;

//Constructor
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

//Metodos
    public String getNombre(){
        return this.nombre;
    }
   //public void setNombre(String nombre) {
   //     this.nombre = nombre;
   // }
    public Double getPrecio() {
        return precio;
    }

    //public void setPrecio(Double precio) {
    //    this.precio = precio;
    //}

    //public String mostrarDatos(){
    //    return nombre+" "+precio+"\n";
    //}
}
