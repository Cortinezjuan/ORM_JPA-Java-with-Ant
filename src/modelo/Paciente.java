
package modelo;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * @author Cortinez Juan José
 */
@Entity

public class Paciente extends Persona {

    private int nroSocio;
    private List<Turno> turnos = new ArrayList();
    private HistoriaClinica historiaClinica;

    public Paciente() {
    }



    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_paciente")
    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    @JoinColumn(name = "id_historiaClinica")
    @OneToOne(cascade = CascadeType.ALL)
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    
}
