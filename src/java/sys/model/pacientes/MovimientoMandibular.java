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
@Table(name = "movimiento_mandibular")
public class MovimientoMandibular  implements java.io.Serializable {


     private Integer id;
     private String protusivo;
     private String derecho;
     private String izquierdo;
     //private Set analisisOclusions = new HashSet(0);

    public MovimientoMandibular() {
    }

	
    public MovimientoMandibular(String protusivo, String derecho, String izquierdo) {
        this.protusivo = protusivo;
        this.derecho = derecho;
        this.izquierdo = izquierdo;
    }
    /*
    public MovimientoMandibular(String protusivo, String derecho, String izquierdo, Set analisisOclusions) {
       this.protusivo = protusivo;
       this.derecho = derecho;
       this.izquierdo = izquierdo;
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
    
    @Column(name = "protusivo")
    public String getProtusivo() {
        return this.protusivo;
    }
    
    public void setProtusivo(String protusivo) {
        this.protusivo = protusivo;
    }
    
    @Column(name = "derecho")
    public String getDerecho() {
        return this.derecho;
    }
    
    public void setDerecho(String derecho) {
        this.derecho = derecho;
    }
    
    @Column(name = "izquierdo")
    public String getIzquierdo() {
        return this.izquierdo;
    }
    
    public void setIzquierdo(String izquierdo) {
        this.izquierdo = izquierdo;
    }
    /*
    public Set getAnalisisOclusions() {
        return this.analisisOclusions;
    }
    
    public void setAnalisisOclusions(Set analisisOclusions) {
        this.analisisOclusions = analisisOclusions;
    }*/
}


