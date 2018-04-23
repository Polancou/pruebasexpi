package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


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
@Table(name = "examen_oral")
public class ExamenOral  implements java.io.Serializable {


     private Integer id;
     private Dolor dolor;
     private PruebaPercusion pruebaPercusion;
     private PruebasTermicas pruebasTermicas;
     private String lesionPulpar;
     private String exposicionPulpar;
     private String inflamacion;
     //private Set sistemaEstomatognaticos = new HashSet(0);

    public ExamenOral() {
    }

	
    public ExamenOral(Dolor dolor, PruebaPercusion pruebaPercusion, PruebasTermicas pruebasTermicas, String lesionPulpar, String exposicionPulpar, String inflamacion) {
        this.dolor = dolor;
        this.pruebaPercusion = pruebaPercusion;
        this.pruebasTermicas = pruebasTermicas;
        this.lesionPulpar = lesionPulpar;
        this.exposicionPulpar = exposicionPulpar;
        this.inflamacion = inflamacion;
    }
    /*
    public ExamenOral(Dolor dolor, PruebaPercusion pruebaPercusion, PruebasTermicas pruebasTermicas, String lesionPulpar, String exposicionPulpar, String inflamacion, Set sistemaEstomatognaticos) {
       this.dolor = dolor;
       this.pruebaPercusion = pruebaPercusion;
       this.pruebasTermicas = pruebasTermicas;
       this.lesionPulpar = lesionPulpar;
       this.exposicionPulpar = exposicionPulpar;
       this.inflamacion = inflamacion;
       this.sistemaEstomatognaticos = sistemaEstomatognaticos;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "dolor")
    public Dolor getDolor() {
        return this.dolor;
    }
    
    public void setDolor(Dolor dolor) {
        this.dolor = dolor;
    }
    
    @Column(name = "pruebas_sens_periodontal")
    public PruebaPercusion getPruebaPercusion() {
        return this.pruebaPercusion;
    }
    
    public void setPruebaPercusion(PruebaPercusion pruebaPercusion) {
        this.pruebaPercusion = pruebaPercusion;
    }
    
    @Column(name = "pruebas_sens_termica")
    public PruebasTermicas getPruebasTermicas() {
        return this.pruebasTermicas;
    }
    
    public void setPruebasTermicas(PruebasTermicas pruebasTermicas) {
        this.pruebasTermicas = pruebasTermicas;
    }
    
    @Column(name = "lesion_pulpar")
    public String getLesionPulpar() {
        return this.lesionPulpar;
    }
    
    public void setLesionPulpar(String lesionPulpar) {
        this.lesionPulpar = lesionPulpar;
    }
    
    @Column(name = "exposicion_pulpar")
    public String getExposicionPulpar() {
        return this.exposicionPulpar;
    }
    
    public void setExposicionPulpar(String exposicionPulpar) {
        this.exposicionPulpar = exposicionPulpar;
    }
    
    @Column(name = "inflamacion")
    public String getInflamacion() {
        return this.inflamacion;
    }
    
    public void setInflamacion(String inflamacion) {
        this.inflamacion = inflamacion;
    }
    /*
    @Column(name = "sistema_estomatognatico")
    public Set getSistemaEstomatognaticos() {
        return this.sistemaEstomatognaticos;
    }
    
    public void setSistemaEstomatognaticos(Set sistemaEstomatognaticos) {
        this.sistemaEstomatognaticos = sistemaEstomatognaticos;
    }*/
}


