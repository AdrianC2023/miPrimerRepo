public class DescuentoFijo extends Descuento {

    //Atributos
    private double monto;

    //Constructos
    public DescuentoFijo(double monto) {
        this.monto = monto;
        calcularDescuento();
    }

    //Metodos
    @Override
    protected void calcularDescuento() {
        desc = (monto);
    }

}