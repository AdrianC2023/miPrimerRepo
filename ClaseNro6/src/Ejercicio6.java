import java.time.LocalDate;

public class Ejercicio6 {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Adrian","Colque",LocalDate.of(1991,11,9));

        Carrito carrito1 = new Carrito(persona1);

        Producto producto1 = new Producto("Jabon en polvo",40.0, true, false);
        Producto producto2 = new Producto("Esponja", 10.0, false, true);
        Producto producto3 = new Producto("Chocolaes", 100.0, false, false);

        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto2);
        carrito1.agregarProducto(producto3);

        //Por que no muestra los productos con los valores?
        /*System.out.println("Producto: "+carrito1.getTipoProducto(producto1));
        System.out.println("Producto: "+carrito1.getTipoProducto(producto2));
        System.out.println("Producto: "+carrito1.getTipoProducto(producto3));*/

        System.out.println("productos: "+carrito1.getTipoProducto(0));
        System.out.println("productos: "+carrito1.getTipoProducto(1));
        System.out.println("productos: "+carrito1.getTipoProducto(2));
        //System.out.println("Producto:"+producto1.getNombre()+"\nPrecio: "+producto1.getPrecio()+"\nTiene descuento? "+producto1.getDescPorc());

        System.out.println("El importe total: "+carrito1.importeTotal());

        Descuento desc1 = new DescuentoFijo();
        desc1.setDesc(14.0);
        System.out.println(desc1.calcularDescuento(carrito1.importeTotal()));

        Descuento desc2 = new DescuentoPorcentaje();
        desc2.setDesc(0.3);
        System.out.println(desc2.calcularDescuento(carrito1.importeTotal()));
    }
}