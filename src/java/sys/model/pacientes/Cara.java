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
@Table(name = "cara")
public class Cara  implements java.io.Serializable {


     private Integer id;
     private String forma;
     private String labios;
     private String bordesBermellon;
     //private Set examenOrofacials = new HashSet(0);

    public Cara() {
    }

	
    public Cara(String forma, String labios, String bordesBermellon) {
        this.forma = forma;
        this.labios = labios;
        this.bordesBermellon = bordesBermellon;
    }
    /*
    public Cara(String forma, String labios, String bordesBermellon, Set examenOrofacials) {
       this.forma = forma;
       this.labios = labios;
       this.bordesBermellon = bordesBermellon;
       this.examenOrofacials = examenOrofacials;
    }*/
    
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "forma")
    public String getForma() {
        return this.forma;
    }
    
    public void setForma(String forma) {
        this.forma = forma;
    }
    
    @Column(name = "labios")
    public String getLabios() {
        return this.labios;
    }
    
    public void setLabios(String labios) {
        this.labios = labios;
    }
    
    @Column(name = "bordes_bermellon")
    public String getBordesBermellon() {
        return this.bordesBermellon;
    }
    
    public void setBordesBermellon(String bordesBermellon) {
        this.bordesBermellon = bordesBermellon;
    }
    /*
    @Column(name = "examen_orofacial")
    public Set getExamenOrofacials() {
        return this.examenOrofacials;
    }
    
    public void setExamenOrofacials(Set examenOrofacials) {
        this.examenOrofacials = examenOrofacials;
    }*/
}


