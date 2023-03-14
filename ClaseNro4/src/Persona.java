import java.time.LocalDate;

public class Persona {

//Atributos
    private String nombre;
    private String apellido;
    //private LocalDate fechaDeNacimiento;
    private int anios;

//Constructor
    public Persona(String nombre, String apellido, int anios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anios = anios;
    }

//Metodos
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getFechaDeNacimiento() {
        return anios;
    }
}