import java.time.LocalDate;

public class Persona {

//Atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    //rivate int fechaDeNacimiento;

//Constructor
    public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

//Metodos
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    //public int getFechaDeNacimiento() {
        //return fechaDeNacimiento;
    //}
}