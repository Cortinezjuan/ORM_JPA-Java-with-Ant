
package modelo;



import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;




/**
 * @author Cortinez Juan José
 */
@Entity

public class HistoriaClinica extends EntityBean implements java.io.Serializable {

    private int numero;
    private String fechaAlta;
    private List<DetalleHistoriaClinica> detallesHC; 

    public HistoriaClinica() {
    }

    public HistoriaClinica(int numero, String fechaAlta) {
        this.numero = numero;
        this.fechaAlta = fechaAlta;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_historiaClinica")
    public List<DetalleHistoriaClinica> getDetallesHC() {
        return detallesHC;
    }

    public void setDetallesHC(List<DetalleHistoriaClinica> detallesHC) {
        this.detallesHC = detallesHC;
    }


    
    
    

}
