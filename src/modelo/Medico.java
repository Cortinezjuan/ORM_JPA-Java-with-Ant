
package modelo;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author Cortinez Juan José
 */
@Entity
public class Medico extends Persona {

    private List<Especialidad> especialidades;
    private List<Turno> turnos;
    private int matricula;
    private long celular;
    
    public Medico() {
    }
    
     

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    @ManyToMany(fetch=FetchType.LAZY,
    targetEntity=Especialidad.class,
    cascade=CascadeType.ALL)
    @JoinTable(
    name="MEDICO_ESPECIALIDAD",
    joinColumns=@JoinColumn(name="MEDICO_ID"),
    inverseJoinColumns=@JoinColumn(name="ESPECIALIDAD_ID"))
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idMedico")
    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    
    
    

}
