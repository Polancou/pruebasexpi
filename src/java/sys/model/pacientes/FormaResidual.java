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
@Table(name = "forma_residual")
public class FormaResidual  implements java.io.Serializable {


     private Integer id;
     private ResidualMandibular residualMandibular;
     private ResidualMaxilar residualMaxilar;
     //private Set atms = new HashSet(0);

    public FormaResidual() {
        residualMandibular=new ResidualMandibular();
        residualMaxilar = new ResidualMaxilar();
    }

	
    public FormaResidual(ResidualMandibular residualMandibular, ResidualMaxilar residualMaxilar) {
        this.residualMandibular = residualMandibular;
        this.residualMaxilar = residualMaxilar;
    }
    /*
    public FormaResidual(ResidualMandibular residualMandibular, ResidualMaxilar residualMaxilar, Set atms) {
       this.residualMandibular = residualMandibular;
       this.residualMaxilar = residualMaxilar;
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
    
    @Column(name = "mandibular")
    public ResidualMandibular getResidualMandibular() {
        return this.residualMandibular;
    }
    
    public void setResidualMandibular(ResidualMandibular residualMandibular) {
        this.residualMandibular = residualMandibular;
    }
    
    @Column(name = "maxiliar")
    public ResidualMaxilar getResidualMaxilar() {
        return this.residualMaxilar;
    }
    
    public void setResidualMaxilar(ResidualMaxilar residualMaxilar) {
        this.residualMaxilar = residualMaxilar;
    }
    /*
    @Column(name = "atm")
    public Set getAtms() {
        return this.atms;
    }
    
    public void setAtms(Set atms) {
        this.atms = atms;
    }*/
}


