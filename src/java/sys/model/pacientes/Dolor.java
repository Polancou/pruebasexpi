package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
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
@Table(name = "dolor")
public class Dolor  implements java.io.Serializable {


     private Integer id;
     private String siNo;
     private String organo;
     private String ubicacion;
     private Date duracion;
     private String estimulo;
     //private Set examenOrals = new HashSet(0);

    public Dolor() {
    }

	
    public Dolor(String siNo, String organo, String ubicacion, Date duracion, String estimulo) {
        this.siNo = siNo;
        this.organo = organo;
        this.ubicacion = ubicacion;
        this.duracion = duracion;
        this.estimulo = estimulo;
    }
    /*
    public Dolor(String siNo, String organo, String ubicacion, Date duracion, String estimulo, Set examenOrals) {
       this.siNo = siNo;
       this.organo = organo;
       this.ubicacion = ubicacion;
       this.duracion = duracion;
       this.estimulo = estimulo;
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
    
    @Column(name = "si_no")
    public String getSiNo() {
        return this.siNo;
    }
    
    public void setSiNo(String siNo) {
        this.siNo = siNo;
    }
    
    @Column(name = "organo")
    public String getOrgano() {
        return this.organo;
    }
    
    public void setOrgano(String organo) {
        this.organo = organo;
    }
    
    @Column(name = "ubicacion")
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    @Column(name = "duracion")
    public Date getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }
    
    @Column(name = "estimulo")
    public String getEstimulo() {
        return this.estimulo;
    }
    
    public void setEstimulo(String estimulo) {
        this.estimulo = estimulo;
    }
    /*
    @Column(name = "examen_oral")
    public Set getExamenOrals() {
        return this.examenOrals;
    }
    
    public void setExamenOrals(Set examenOrals) {
        this.examenOrals = examenOrals;
    }*/
}


