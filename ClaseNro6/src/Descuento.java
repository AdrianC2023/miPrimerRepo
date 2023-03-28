public abstract class Descuento {

    //Atributos
    protected double desc;
    //Contrsuctor

    //Metodos get
    public double getDesc() {
        return desc;
    }
    //Metodos Abstractos
    protected abstract void calcularDescuento();
}
