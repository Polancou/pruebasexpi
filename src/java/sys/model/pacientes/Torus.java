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
@Table(name = "torus")
public class Torus  implements java.io.Serializable {


     private Integer id;
     private String maxilar;
     private String madibula;
     //private Set atms = new HashSet(0);

    public Torus() {
    }

	
    public Torus(String maxilar, String madibula) {
        this.maxilar = maxilar;
        this.madibula = madibula;
    }
    /*
    public Torus(String maxilar, String madibula, Set atms) {
       this.maxilar = maxilar;
       this.madibula = madibula;
       this.atms = atms;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "maxilar")
    public String getMaxilar() {
        return this.maxilar;
    }
    
    public void setMaxilar(String maxilar) {
        this.maxilar = maxilar;
    }
    
    @Column(name = "mandibula")
    public String getMadibula() {
        return this.madibula;
    }
    
    public void setMadibula(String madibula) {
        this.madibula = madibula;
    }
    /*
    public Set getAtms() {
        return this.atms;
    }
    
    public void setAtms(Set atms) {
        this.atms = atms;
    }*/
}


