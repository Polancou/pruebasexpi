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
@Table(name = "pruebas_termicas")
public class PruebasTermicas  implements java.io.Serializable {


     private Integer id;
     private PruebasCalor pruebasCalor;
     private PruebasFrio pruebasFrio;
     //private Set examenOrals = new HashSet(0);

    public PruebasTermicas() {
    }

	
    public PruebasTermicas(PruebasCalor pruebasCalor, PruebasFrio pruebasFrio) {
        this.pruebasCalor = pruebasCalor;
        this.pruebasFrio = pruebasFrio;
    }
    /*
    public PruebasTermicas(PruebasCalor pruebasCalor, PruebasFrio pruebasFrio, Set examenOrals) {
       this.pruebasCalor = pruebasCalor;
       this.pruebasFrio = pruebasFrio;
       this.examenOrals = examenOrals;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "calor")
    public PruebasCalor getPruebasCalor() {
        return this.pruebasCalor;
    }
    
    public void setPruebasCalor(PruebasCalor pruebasCalor) {
        this.pruebasCalor = pruebasCalor;
    }
    
    @Column(name = "frio")
    public PruebasFrio getPruebasFrio() {
        return this.pruebasFrio;
    }
    
    public void setPruebasFrio(PruebasFrio pruebasFrio) {
        this.pruebasFrio = pruebasFrio;
    }
    /*
    public Set getExamenOrals() {
        return this.examenOrals;
    }
    
    public void setExamenOrals(Set examenOrals) {
        this.examenOrals = examenOrals;
    }*/
}


