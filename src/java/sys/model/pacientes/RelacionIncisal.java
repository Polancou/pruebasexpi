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
@Table(name = "relacion_incisal")
public class RelacionIncisal  implements java.io.Serializable {


     private Integer id;
     private int horizontal;
     private int vertical;
     //private Set analisisOclusions = new HashSet(0);

    public RelacionIncisal() {
    }

	
    public RelacionIncisal(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }
    /*
    public RelacionIncisal(int horizontal, int vertical, Set analisisOclusions) {
       this.horizontal = horizontal;
       this.vertical = vertical;
       this.analisisOclusions = analisisOclusions;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "horizontal")
    public int getHorizontal() {
        return this.horizontal;
    }
    
    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }
    
    @Column(name = "vertical")
    public int getVertical() {
        return this.vertical;
    }
    
    public void setVertical(int vertical) {
        this.vertical = vertical;
    }
    /*
    public Set getAnalisisOclusions() {
        return this.analisisOclusions;
    }
    
    public void setAnalisisOclusions(Set analisisOclusions) {
        this.analisisOclusions = analisisOclusions;
    }*/
}


