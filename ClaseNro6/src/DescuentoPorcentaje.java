public class DescuentoPorcentaje extends Descuento {

    //Atributos
    private double porcentaje;

    //Costructor
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
        calcularDescuento();
    }

    //Metodos
    @Override
    protected void calcularDescuento() {
        desc=(porcentaje);
    }
}