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
@Table(name = "habitos_tension")
public class HabitosTension  implements java.io.Serializable {


     private Integer id;
     private String habitosTension;
     private String bruxismo;
     private String seccionLabial;
     private String respiradorBucal;
     private String unicofagia;
     private String succionLingual;
     private String objetos;
     //private Set atms = new HashSet(0);

    public HabitosTension() {
    }

	
    public HabitosTension(String habitosTension, String bruxismo, String seccionLabial, String respiradorBucal, String unicofagia, String succionLingual, String objetos) {
        this.habitosTension = habitosTension;
        this.bruxismo = bruxismo;
        this.seccionLabial = seccionLabial;
        this.respiradorBucal = respiradorBucal;
        this.unicofagia = unicofagia;
        this.succionLingual = succionLingual;
        this.objetos = objetos;
    }
    /*
    public HabitosTension(String habitosTension, String bruxismo, String seccionLabial, String respiradorBucal, String unicofagia, String succionLingual, String objetos, Set atms) {
       this.habitosTension = habitosTension;
       this.bruxismo = bruxismo;
       this.seccionLabial = seccionLabial;
       this.respiradorBucal = respiradorBucal;
       this.unicofagia = unicofagia;
       this.succionLingual = succionLingual;
       this.objetos = objetos;
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
    
    @Column(name = "habitos_tension")
    public String getHabitosTension() {
        return this.habitosTension;
    }
    
    public void setHabitosTension(String habitosTension) {
        this.habitosTension = habitosTension;
    }
    
    @Column(name = "bruxismo")
    public String getBruxismo() {
        return this.bruxismo;
    }
    
    public void setBruxismo(String bruxismo) {
        this.bruxismo = bruxismo;
    }
    
    @Column(name = "seccion_labial")
    public String getSeccionLabial() {
        return this.seccionLabial;
    }
    
    public void setSeccionLabial(String seccionLabial) {
        this.seccionLabial = seccionLabial;
    }
    
    @Column(name = "respirador_bucal")
    public String getRespiradorBucal() {
        return this.respiradorBucal;
    }
    
    public void setRespiradorBucal(String respiradorBucal) {
        this.respiradorBucal = respiradorBucal;
    }
    
    @Column(name = "unicofagia")
    public String getUnicofagia() {
        return this.unicofagia;
    }
    
    public void setUnicofagia(String unicofagia) {
        this.unicofagia = unicofagia;
    }
    
    @Column(name = "succion_lingual")
    public String getSuccionLingual() {
        return this.succionLingual;
    }
    
    public void setSuccionLingual(String succionLingual) {
        this.succionLingual = succionLingual;
    }
    
    @Column(name = "objetos")
    public String getObjetos() {
        return this.objetos;
    }
    
    public void setObjetos(String objetos) {
        this.objetos = objetos;
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


