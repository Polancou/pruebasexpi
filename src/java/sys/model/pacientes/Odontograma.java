package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "odontograma")
public class Odontograma  implements java.io.Serializable {


     private Integer id;
     private Paciente paciente;
     private String estadoOdontograma;
     private Date fecha;
     //private Set estadoDientes = new HashSet(0);

    public Odontograma() {
    }

	
    public Odontograma(Paciente paciente, String estadoOdontograma, Date fecha) {
        this.paciente = paciente;
        this.estadoOdontograma = estadoOdontograma;
        this.fecha = fecha;
    }
    /*
    public Odontograma(Paciente paciente, String estadoOdontograma, Date fecha, Set estadoDientes) {
       this.paciente = paciente;
       this.estadoOdontograma = estadoOdontograma;
       this.fecha = fecha;
       this.estadoDientes = estadoDientes;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "id_paciente")
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    @Column(name = "estado_odontograma")
    public String getEstadoOdontograma() {
        return this.estadoOdontograma;
    }
    
    public void setEstadoOdontograma(String estadoOdontograma) {
        this.estadoOdontograma = estadoOdontograma;
    }
    
    @Column(name = "fecha")
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /*
    public Set getEstadoDientes() {
        return this.estadoDientes;
    }
    
    public void setEstadoDientes(Set estadoDientes) {
        this.estadoDientes = estadoDientes;
    }*/
}


