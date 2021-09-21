
package modelo;



import javax.persistence.Entity;



/**
 * @author Cortinez Juan José
 */
@Entity
public class Turno extends EntityBean implements java.io.Serializable {

    private int idTurno;
    private String fecha;
    private int hora;
    private int minutos;


    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Turno(String fecha, int hora, int minutos) {
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
    }

    
    public Turno() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }


    

}
