package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


//import java.util.HashSet;
//import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "medico_paciente")
public class MedicoPaciente  implements java.io.Serializable {


     private Integer id;
     private String nombreMedico;
     private String telefonoMedico;
     private String direccionMedico;
     //private Set pacientes = new HashSet(0);

    public MedicoPaciente() {
    }

	
    public MedicoPaciente(String nombreMedico, String telefonoMedico, String direccionMedico) {
        this.nombreMedico = nombreMedico;
        this.telefonoMedico = telefonoMedico;
        this.direccionMedico = direccionMedico;
    }
    /*
    public MedicoPaciente(String nombreMedico, String telefonoMedico, String direccionMedico, Set pacientes) {
       this.nombreMedico = nombreMedico;
       this.telefonoMedico = telefonoMedico;
       this.direccionMedico = direccionMedico;
       this.pacientes = pacientes;
    }*/
   
    @Id
    @Column(name = "id")
    @GeneratedValue
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "nombre_medico")
    public String getNombreMedico() {
        return this.nombreMedico;
    }
    
    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }
    
    @Column(name = "telefono_medico")
    public String getTelefonoMedico() {
        return this.telefonoMedico;
    }
    
    public void setTelefonoMedico(String telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }
    
    @Column(name = "direccion_medico")
    public String getDireccionMedico() {
        return this.direccionMedico;
    }
    
    public void setDireccionMedico(String direccionMedico) {
        this.direccionMedico = direccionMedico;
    }
    /*
    public Set getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Set pacientes) {
        this.pacientes = pacientes;
    }*/
}


