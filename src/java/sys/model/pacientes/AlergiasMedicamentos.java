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
@Table(name = "alergias_medicamentos")
public class AlergiasMedicamentos  implements java.io.Serializable {


     private Integer id;
     private String penicilina;
     private String barbituricos;
     private String aspirina;
     private String sulfas;
     private String cortisona;
     //private Set preguntasPacientes = new HashSet(0);
     
    public AlergiasMedicamentos() {
    }

	
    public AlergiasMedicamentos(String penicilina, String barbituricos, String aspirina, String sulfas, String cortisona) {
        this.penicilina = penicilina;
        this.barbituricos = barbituricos;
        this.aspirina = aspirina;
        this.sulfas = sulfas;
        this.cortisona = cortisona;
    }
    /*public AlergiasMedicamentos(String penicilina, String barbituricos, String aspirina, String sulfas, String cortisona, Set preguntasPacientes) {
       this.penicilina = penicilina;
       this.barbituricos = barbituricos;
       this.aspirina = aspirina;
       this.sulfas = sulfas;
       this.cortisona = cortisona;
       this.preguntasPacientes = preguntasPacientes;
    }*/
    
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "penicilina")
    public String getPenicilina() {
        return this.penicilina;
    }
    
    public void setPenicilina(String penicilina) {
        this.penicilina = penicilina;
    }
    
    @Column(name = "barbituricos")
    public String getBarbituricos() {
        return this.barbituricos;
    }
    
    public void setBarbituricos(String barbituricos) {
        this.barbituricos = barbituricos;
    }
    
    @Column(name = "aspirina")
    public String getAspirina() {
        return this.aspirina;
    }
    
    public void setAspirina(String aspirina) {
        this.aspirina = aspirina;
    }
    
    @Column(name = "sulfas")
    public String getSulfas() {
        return this.sulfas;
    }
    
    public void setSulfas(String sulfas) {
        this.sulfas = sulfas;
    }
    
    @Column(name = "cortisona")
    public String getCortisona() {
        return this.cortisona;
    }
    
    public void setCortisona(String cortisona) {
        this.cortisona = cortisona;
    }
    
    /*
    @Column(name = "preguntas_paciente")
    public Set getPreguntasPacientes() {
        return this.preguntasPacientes;
    }
    
    public void setPreguntasPacientes(Set preguntasPacientes) {
        this.preguntasPacientes = preguntasPacientes;
    }
    */
}


