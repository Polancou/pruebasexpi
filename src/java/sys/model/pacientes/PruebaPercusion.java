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
@Table(name = "prueba_percusion")
public class PruebaPercusion  implements java.io.Serializable {


     private Integer id;
     private String organo;
     private String vertical;
     private String horizontal;
     private String palpacion;
     //private Set examenOrals = new HashSet(0);

    public PruebaPercusion() {
    }

	
    public PruebaPercusion(String organo, String vertical, String horizontal, String palpacion) {
        this.organo = organo;
        this.vertical = vertical;
        this.horizontal = horizontal;
        this.palpacion = palpacion;
    }
    /*
    public PruebaPercusion(String organo, String vertical, String horizontal, String palpacion, Set examenOrals) {
       this.organo = organo;
       this.vertical = vertical;
       this.horizontal = horizontal;
       this.palpacion = palpacion;
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
    
    @Column(name = "organo")
    public String getOrgano() {
        return this.organo;
    }
    
    public void setOrgano(String organo) {
        this.organo = organo;
    }
    
    @Column(name = "vertical")
    public String getVertical() {
        return this.vertical;
    }
    
    public void setVertical(String vertical) {
        this.vertical = vertical;
    }
    
    @Column(name = "horizontal")
    public String getHorizontal() {
        return this.horizontal;
    }
    
    public void setHorizontal(String horizontal) {
        this.horizontal = horizontal;
    }
    
    @Column(name = "palpacion")
    public String getPalpacion() {
        return this.palpacion;
    }
    
    public void setPalpacion(String palpacion) {
        this.palpacion = palpacion;
    }
    /*
    public Set getExamenOrals() {
        return this.examenOrals;
    }
    
    public void setExamenOrals(Set examenOrals) {
        this.examenOrals = examenOrals;
    }*/
}


