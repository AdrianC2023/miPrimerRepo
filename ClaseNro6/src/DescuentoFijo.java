public class DescuentoFijo extends Descuento {

    //Atributos
    private double monto;

    //Constructor
    /*public double DescuentoFijo(double monto) {
        this.monto = monto;
        //calcularDescuento();
    }*/

    //Metodos
    @Override
    //por que es public y no potected?
    public double calcularDescuento(double importe) {
        return importe-this.getDesc();
    }

}