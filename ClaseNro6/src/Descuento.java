public abstract class Descuento {

    //Atributos
    protected double desc;
    //Contrsuctor

    //Metodos set y get
    public double getDesc() {
        return desc;
    }
    public void setDesc(double desc) {
        this.desc = desc;
    }

    //Metodos Abstractos
    //por que es public y no potected?
    public abstract double calcularDescuento(double importe);
}
