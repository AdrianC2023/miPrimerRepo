import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Producto productoPan = new Producto("Pan");
        System.out.println(productoPan.getNombre());

        productoPan.setDescripcion("integral en molde");
        System.out.println(productoPan.getDescripcion());

        productoPan.setPrecio(300.20);
        System.out.println(productoPan.getPrecio());


    }
}