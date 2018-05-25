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
@Table(name = "trabajo_paciente")
public class TrabajoPaciente  implements java.io.Serializable {


     private Integer id;
     private String ocupacion;
     private String lugarTrabajo;
     private String telefonoTrabajo;
     //private Set pacientes = new HashSet(0);

    public TrabajoPaciente() {
    }

	
    public TrabajoPaciente(String ocupacion, String lugarTrabajo, String telefonoTrabajo) {
        this.ocupacion = ocupacion;
        this.lugarTrabajo = lugarTrabajo;
        this.telefonoTrabajo = telefonoTrabajo;
    }
    /*
    public TrabajoPaciente(String ocupacion, String lugarTrabajo, String telefonoTrabajo, Set pacientes) {
       this.ocupacion = ocupacion;
       this.lugarTrabajo = lugarTrabajo;
       this.telefonoTrabajo = telefonoTrabajo;
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
    
    @Column(name = "ocupacion")
    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    @Column(name = "lugar_trabajo")
    public String getLugarTrabajo() {
        return this.lugarTrabajo;
    }
    
    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
    
    @Column(name = "telefono_trabajo")
    public String getTelefonoTrabajo() {
        return this.telefonoTrabajo;
    }
    
    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
    /*
    public Set getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Set pacientes) {
        this.pacientes = pacientes;
    }*/
}


