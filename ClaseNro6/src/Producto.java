public class Producto {

//Atributos
    private String nombre;
    private Double precio;
    private Boolean descPorc;
    private Boolean descFijo;
//Constructor
    public Producto(String nombre, Double precio, Boolean descPorc, Boolean descFijo) {
        this.nombre = nombre;
        this.precio = precio;
        this.descPorc = descPorc;

    }

//Metodos
    public String getNombre(){
        return this.nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Boolean getDescPorc() {
        return descPorc;
    }

    public Boolean getDescFijo() {
        return descFijo;
    }

}
