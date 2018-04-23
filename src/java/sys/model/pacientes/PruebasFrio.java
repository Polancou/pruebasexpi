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
@Table(name = "pruebas_frio")
public class PruebasFrio  implements java.io.Serializable {


     private Integer id;
     private String organo;
     private String normal;
     private String fugaz;
     private String ninguno;
     private String persistente;
     private String incremento;
     private String irradiado;
     private String drecremento;
     //private Set pruebasTermicases = new HashSet(0);

    public PruebasFrio() {
    }

	
    public PruebasFrio(String organo, String normal, String fugaz, String ninguno, String persistente, String incremento, String irradiado, String drecremento) {
        this.organo = organo;
        this.normal = normal;
        this.fugaz = fugaz;
        this.ninguno = ninguno;
        this.persistente = persistente;
        this.incremento = incremento;
        this.irradiado = irradiado;
        this.drecremento = drecremento;
    }
    /*
    public PruebasFrio(String organo, String normal, String fugaz, String ninguno, String persistente, String incremento, String irradiado, String drecremento, Set pruebasTermicases) {
       this.organo = organo;
       this.normal = normal;
       this.fugaz = fugaz;
       this.ninguno = ninguno;
       this.persistente = persistente;
       this.incremento = incremento;
       this.irradiado = irradiado;
       this.drecremento = drecremento;
       this.pruebasTermicases = pruebasTermicases;
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
    
    @Column(name = "normal")
    public String getNormal() {
        return this.normal;
    }
    
    public void setNormal(String normal) {
        this.normal = normal;
    }
    
    @Column(name = "fugaz")
    public String getFugaz() {
        return this.fugaz;
    }
    
    public void setFugaz(String fugaz) {
        this.fugaz = fugaz;
    }
    
    @Column(name = "ninguno")
    public String getNinguno() {
        return this.ninguno;
    }
    
    public void setNinguno(String ninguno) {
        this.ninguno = ninguno;
    }
    
    @Column(name = "persistente")
    public String getPersistente() {
        return this.persistente;
    }
    
    public void setPersistente(String persistente) {
        this.persistente = persistente;
    }
    
    @Column(name = "incremento")
    public String getIncremento() {
        return this.incremento;
    }
    
    public void setIncremento(String incremento) {
        this.incremento = incremento;
    }
    
    @Column(name = "irradiado")
    public String getIrradiado() {
        return this.irradiado;
    }
    
    public void setIrradiado(String irradiado) {
        this.irradiado = irradiado;
    }
    
    @Column(name = "drecremento")
    public String getDrecremento() {
        return this.drecremento;
    }
    
    public void setDrecremento(String drecremento) {
        this.drecremento = drecremento;
    }
    /*
    public Set getPruebasTermicases() {
        return this.pruebasTermicases;
    }
    
    public void setPruebasTermicases(Set pruebasTermicases) {
        this.pruebasTermicases = pruebasTermicases;
    }*/
}


