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

        /*Scanner entrada = new Scanner(System.in);
        String nom;
        Double pre;
        int numeroProductos;
        Double sum = 0.0;

        System.out.print("Cantidad de productos: ");
        numeroProductos = entrada.nextInt();

        Producto prod[] = new Producto[numeroProductos];

        for (int i=0; i<prod.length; i++){
            entrada.nextLine();
            System.out.print("Nombre del producto "+(i+1)+": ");
            nom = entrada.nextLine();
            System.out.print("Precio: ");
            pre = entrada.nextDouble();

            prod[i] = new Producto(nom, pre);
            sum = sum + (prod[i].getPrecio());
        }
            System.out.print("Monto total: "+sum);*/

        //Producto productoPan = new Producto("Pan", 300.20);
        //System.out.println(productoPan.getNombre());
        //System.out.println(productoPan.getPrecio());

        //productoPan.setDescripcion("integral en molde");
        //System.out.println(productoPan.getDescripcion());

        //productoPan.setPrecio(300.20);
        //System.out.println(productoPan.getPrecio());
    }
}