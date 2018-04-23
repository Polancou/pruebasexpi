package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "examen_orofacial")
public class ExamenOrofacial  implements java.io.Serializable {


     private Integer id;
     private Cara cara;
     private Paciente paciente;
     private SistemaEstomatognatico sistemaEstomatognatico;
     private Date fecha;

    public ExamenOrofacial() {
    }

    public ExamenOrofacial(Cara cara, Paciente paciente, SistemaEstomatognatico sistemaEstomatognatico, Date fecha) {
       this.cara = cara;
       this.paciente = paciente;
       this.sistemaEstomatognatico = sistemaEstomatognatico;
       this.fecha = fecha;
    }
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "cara")
    public Cara getCara() {
        return this.cara;
    }
    
    public void setCara(Cara cara) {
        this.cara = cara;
    }
    
    @Column(name = "paciente")
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    @Column(name = "sistema_estomatognatico")
    public SistemaEstomatognatico getSistemaEstomatognatico() {
        return this.sistemaEstomatognatico;
    }
    
    public void setSistemaEstomatognatico(SistemaEstomatognatico sistemaEstomatognatico) {
        this.sistemaEstomatognatico = sistemaEstomatognatico;
    }
    
    @Column(name = "fecha")
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}


