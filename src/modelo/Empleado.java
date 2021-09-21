
package modelo;

import javax.persistence.Entity;

/**
 * @author Cortinez Juan José
 */
@Entity
public class Empleado extends Persona {
    private static final long serialVersionUID = 1L;
    private int nroLegajo;
    private double sueldo;

    public Empleado() {
    }


    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    

}
