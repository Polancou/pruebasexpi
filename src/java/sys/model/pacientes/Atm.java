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
@Table(name = "atm")
public class Atm  implements java.io.Serializable {


     private Integer id;
     private Desviacion desviacion;
     private FormaResidual formaResidual;
     private HabitosTension habitosTension;
     private Torus torus;
     private String crepitacion;
     private String sensibilidad;
     private String dolor;
     private String subluxacion;
     private String tamanoLengua;
     //private Set sistemaEstomatognaticos = new HashSet(0);

    public Atm() {
    }

	
    public Atm(Desviacion desviacion, FormaResidual formaResidual, HabitosTension habitosTension, Torus torus, String crepitacion, String sensibilidad, String dolor, String subluxacion, String tamanoLengua) {
        this.desviacion = desviacion;
        this.formaResidual = formaResidual;
        this.habitosTension = habitosTension;
        this.torus = torus;
        this.crepitacion = crepitacion;
        this.sensibilidad = sensibilidad;
        this.dolor = dolor;
        this.subluxacion = subluxacion;
        this.tamanoLengua = tamanoLengua;
    }
    /*
    public Atm(Desviacion desviacion, FormaResidual formaResidual, HabitosTension habitosTension, Torus torus, String crepitacion, String sensibilidad, String dolor, String subluxacion, String tamanoLengua, Set sistemaEstomatognaticos) {
       this.desviacion = desviacion;
       this.formaResidual = formaResidual;
       this.habitosTension = habitosTension;
       this.torus = torus;
       this.crepitacion = crepitacion;
       this.sensibilidad = sensibilidad;
       this.dolor = dolor;
       this.subluxacion = subluxacion;
       this.tamanoLengua = tamanoLengua;
       this.sistemaEstomatognaticos = sistemaEstomatognaticos;
    }
    */
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "desviacion")
    public Desviacion getDesviacion() {
        return this.desviacion;
    }
    
    public void setDesviacion(Desviacion desviacion) {
        this.desviacion = desviacion;
    }
    
    @Column(name = "forma_residual")
    public FormaResidual getFormaResidual() {
        return this.formaResidual;
    }
    
    public void setFormaResidual(FormaResidual formaResidual) {
        this.formaResidual = formaResidual;
    }
    
    @Column(name = "habitos_tension")
    public HabitosTension getHabitosTension() {
        return this.habitosTension;
    }
    
    public void setHabitosTension(HabitosTension habitosTension) {
        this.habitosTension = habitosTension;
    }
    
    @Column(name = "torus")
    public Torus getTorus() {
        return this.torus;
    }
    
    public void setTorus(Torus torus) {
        this.torus = torus;
    }
    
    @Column(name = "crepitacion")
    public String getCrepitacion() {
        return this.crepitacion;
    }
    
    public void setCrepitacion(String crepitacion) {
        this.crepitacion = crepitacion;
    }
    
    @Column(name = "sensibilidad")
    public String getSensibilidad() {
        return this.sensibilidad;
    }
    
    public void setSensibilidad(String sensibilidad) {
        this.sensibilidad = sensibilidad;
    }
    
    @Column(name = "dolor")
    public String getDolor() {
        return this.dolor;
    }
    
    public void setDolor(String dolor) {
        this.dolor = dolor;
    }
    
    @Column(name = "subluxacion")
    public String getSubluxacion() {
        return this.subluxacion;
    }
    
    public void setSubluxacion(String subluxacion) {
        this.subluxacion = subluxacion;
    }
    
    @Column(name = "tamano_lengua")
    public String getTamanoLengua() {
        return this.tamanoLengua;
    }
    
    public void setTamanoLengua(String tamanoLengua) {
        this.tamanoLengua = tamanoLengua;
    }
    
    /*
    @Column(name = "sistema_estomatognaticos")
    public Set getSistemaEstomatognaticos() {
        return this.sistemaEstomatognaticos;
    }
    
    public void setSistemaEstomatognaticos(Set sistemaEstomatognaticos) {
        this.sistemaEstomatognaticos = sistemaEstomatognaticos;
    }
    */
}


