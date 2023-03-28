public class DescuentoPorcentaje extends Descuento {

    //Atributos
    private double porcentaje;

    //Costructor
    /*public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
        //calcularDescuento();
    }*/

    //Metodos
    @Override
    //por que es public y no potected?
    public double calcularDescuento(double importe) {
        return importe-(importe*this.getDesc());
    }
}