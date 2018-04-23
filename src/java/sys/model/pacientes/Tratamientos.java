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
@Table(name = "tratamientos")
public class Tratamientos  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private float precio;
     //private Set planTratamientos = new HashSet(0);

    public Tratamientos() {
    }

	
    public Tratamientos(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /*
    public Tratamientos(String nombre, float precio, Set planTratamientos) {
       this.nombre = nombre;
       this.precio = precio;
       this.planTratamientos = planTratamientos;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "nombre")
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name = "precio")
    public float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /*
    public Set getPlanTratamientos() {
        return this.planTratamientos;
    }
    
    public void setPlanTratamientos(Set planTratamientos) {
        this.planTratamientos = planTratamientos;
    }*/
}


