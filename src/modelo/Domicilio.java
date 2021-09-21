
package modelo;



import javax.persistence.Entity;





/**
 * @author Cortinez Juan José
 */
@Entity
public class Domicilio extends EntityBean implements java.io.Serializable {

    private String localidad;
    private String calle;
    private int numero;


    public Domicilio() {
    }

    public Domicilio(String localidad, String calle, int numero) {

        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }

  

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   

}
