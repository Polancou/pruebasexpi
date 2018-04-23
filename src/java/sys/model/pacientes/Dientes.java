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
@Table(name = "dientes")
public class Dientes  implements java.io.Serializable {


     private Integer id;
     private int clave;
     private String nombre;
     //private Set estadoDientes = new HashSet(0);

    public Dientes() {
    }

	
    public Dientes(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }
    
    /*
    public Dientes(int clave, String nombre, Set estadoDientes) {
       this.clave = clave;
       this.nombre = nombre;
       this.estadoDientes = estadoDientes;
    }*/
    
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "clave")
    public int getClave() {
        return this.clave;
    }
    
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    @Column(name = "nombre")
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
    @Column(name = "estado_diente")
    public Set getEstadoDientes() {
        return this.estadoDientes;
    }
    
    public void setEstadoDientes(Set estadoDientes) {
        this.estadoDientes = estadoDientes;
    }*/
}


