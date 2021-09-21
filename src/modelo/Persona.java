
package modelo;


import javax.persistence.CascadeType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;




/**
 * @author Cortinez Juan José
 */
@MappedSuperclass// clase padre de las entidades
@Inheritance(strategy = InheritanceType.JOINED)// joined: crea 2 tablas unidas por id
                                                // singletable: 1 tabla con todos los atributos de las demas
                                                // txclass: copia los atributos del padre=redundancia

public class Persona extends EntityBean implements java.io.Serializable {


    private String nombre;
    private String apellido;
    private long dni;
    private Domicilio domicilio;

    public Persona(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio) {
//        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public Persona() {
    }

    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @JoinColumn(name = "idDomicilio")
    @OneToOne(cascade = CascadeType.ALL)
    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    

}
