import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.security.PublicKey;
import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}