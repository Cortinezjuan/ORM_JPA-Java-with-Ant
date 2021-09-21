package orm;


import controlador.GestorClinica;
import java.util.ArrayList;
import java.util.List;
import modelo.*;


public class Main {

    public static void main(String[] args) {
        try {
            GestorClinica gestor = new GestorClinica();
            
            DetalleHistoriaClinica nuevoDetalle = new DetalleHistoriaClinica("05/07/2021", "migrañas", "cervicalgia", "reposo por 24hs"); 
            
            List<DetalleHistoriaClinica> nuevoDetalles = new ArrayList<DetalleHistoriaClinica>();
            nuevoDetalles.add(nuevoDetalle);
            HistoriaClinica historiaClinica = new HistoriaClinica(2, "22/08/2021");
            historiaClinica.setDetallesHC(nuevoDetalles);
            Domicilio domicilioPaciente = new Domicilio("Mendoza","San Martin", 1200);
            Paciente nuevoPaciente = new Paciente();
            nuevoPaciente.setApellido("Perez");
            nuevoPaciente.setDomicilio(domicilioPaciente);
            nuevoPaciente.setNombre("Juan");
            
            nuevoPaciente.setDni(35652693);
            nuevoPaciente.setHistoriaClinica(historiaClinica);
            
            Medico nuevoMedico = new Medico();
            
           
            Domicilio domicilioMedico = new Domicilio("Lavalle", "Mitre", 255);
            nuevoMedico.setApellido("Gomez");
            nuevoMedico.setCelular(261360986);
            nuevoMedico.setDni(25369852);
            nuevoMedico.setMatricula(125963);
            nuevoMedico.setDomicilio(domicilioMedico);
            
            Turno nuevoTurno = new Turno("22/10/2021", 10, 30);
           List<Turno> turnosPaciente = new ArrayList<Turno>();
           turnosPaciente.add(nuevoTurno);
           nuevoPaciente.setTurnos(turnosPaciente);
           
           List<Turno> turnosMedico = new ArrayList<Turno>();
           turnosMedico.add(nuevoTurno);
           nuevoMedico.setTurnos(turnosMedico);
            
            gestor.guardar(nuevoPaciente);
            gestor.guardar(nuevoMedico);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
