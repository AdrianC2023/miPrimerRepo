public class Carrito {

//Atributos
    private Persona persona;
    private Producto tipoProducto[];
    private int cantProducto;

//Constructor
    public Carrito(Persona persona) {
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

    public double importeTotal() {
        Double total = 0.0;
        for (int i=0; i<cantProducto; i++) {
            total = total + tipoProducto[i].getPrecio();
        }
        return total;
    }

    /*public Producto[] getTipoProducto(Producto prod[]) {
        for(int i=0; i<cantProducto; i++) {
            prod[i] = tipoProducto[i];
        }
        return prod;
    }*/

    public Producto getTipoProducto(int j) {
        return tipoProducto[j];
    }
}
