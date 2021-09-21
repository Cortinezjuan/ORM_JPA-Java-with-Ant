
package modelo;



import javax.persistence.Entity;


/**
 * @author Cortinez Juan José
 */
@Entity
public class DetalleHistoriaClinica extends EntityBean implements java.io.Serializable {

    private String fechaAtencion;
    private String sintomas;
    private String diagnostico;
    private String observaciones;


    public DetalleHistoriaClinica() {
    }

    public DetalleHistoriaClinica(String fechaAtencion, String sintomas, String diagnostico, String observaciones) {
        this.fechaAtencion = fechaAtencion;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
    }
    



    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    
    

}
