public class Main {
    public static void main(String[] args) {

        Producto productoPan = new Producto("Pan");
        System.out.println(productoPan.getNombre());

        productoPan.setDescripcion("integral en molde");
        System.out.println(productoPan.getDescripcion());
    }
}