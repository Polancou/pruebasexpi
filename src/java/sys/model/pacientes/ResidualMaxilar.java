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
@Table(name = "residual_maxilar")
public class ResidualMaxilar  implements java.io.Serializable {


     private Integer id;
     private String u;
     private String v;
     private String afilado;
     //private Set formaResiduals = new HashSet(0);

    public ResidualMaxilar() {
    }

	
    public ResidualMaxilar(String u, String v, String afilado) {
        this.u = u;
        this.v = v;
        this.afilado = afilado;
    }
    /*
    public ResidualMaxilar(String u, String v, String afilado, Set formaResiduals) {
       this.u = u;
       this.v = v;
       this.afilado = afilado;
       this.formaResiduals = formaResiduals;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "u")
    public String getU() {
        return this.u;
    }
    
    public void setU(String u) {
        this.u = u;
    }
    
    @Column(name = "v")
    public String getV() {
        return this.v;
    }
    
    public void setV(String v) {
        this.v = v;
    }
    
    @Column(name = "afilado")
    public String getAfilado() {
        return this.afilado;
    }
    
    public void setAfilado(String afilado) {
        this.afilado = afilado;
    }
    /*
    public Set getFormaResiduals() {
        return this.formaResiduals;
    }
    
    public void setFormaResiduals(Set formaResiduals) {
        this.formaResiduals = formaResiduals;
    }*/
}


