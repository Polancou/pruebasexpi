package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


//import java.util.HashSet;
//import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "direccion_paciente")
public class DireccionPaciente  implements java.io.Serializable {


     private Integer id;
     private String pais;
     private String estado;
     private String ciudad;
     private String calle;
     private String colonia,folio;

    public DireccionPaciente() {
    }

	
    public DireccionPaciente(String folio,String pais, String estado, String ciudad, String calle, String colonia) {
        this.folio=folio;
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.calle = calle;
        this.colonia = colonia;
    }

    @Id
    @Column(name = "id")    
    @GeneratedValue
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "folio")
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }
   
    @Column(name = "pais")
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Column(name = "estado")
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Column(name = "ciudad")
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Column(name = "calle")
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    @Column(name = "colonia")
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    /*
    @Column(name = "paciente")
    public Set getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Set pacientes) {
        this.pacientes = pacientes;
    }*/
}


