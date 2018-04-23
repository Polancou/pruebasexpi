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
@Table(name = "hallazgos_radiograficos")
public class HallazgosRadiograficos  implements java.io.Serializable {


     private Integer id;
     private String tipoRx;
     private String soporteOseo;
     private String relacionCoronaRaiz;
     private String alturaReborde;
     private String engrosamientoLigamentoPeriodontal;
     private String interpretacion;
     //private Set sistemaEstomatognaticos = new HashSet(0);

    public HallazgosRadiograficos() {
    }

	
    public HallazgosRadiograficos(String tipoRx, String soporteOseo, String relacionCoronaRaiz, String alturaReborde, String engrosamientoLigamentoPeriodontal, String interpretacion) {
        this.tipoRx = tipoRx;
        this.soporteOseo = soporteOseo;
        this.relacionCoronaRaiz = relacionCoronaRaiz;
        this.alturaReborde = alturaReborde;
        this.engrosamientoLigamentoPeriodontal = engrosamientoLigamentoPeriodontal;
        this.interpretacion = interpretacion;
    }
    /*
    public HallazgosRadiograficos(String tipoRx, String soporteOseo, String relacionCoronaRaiz, String alturaReborde, String engrosamientoLigamentoPeriodontal, String interpretacion, Set sistemaEstomatognaticos) {
       this.tipoRx = tipoRx;
       this.soporteOseo = soporteOseo;
       this.relacionCoronaRaiz = relacionCoronaRaiz;
       this.alturaReborde = alturaReborde;
       this.engrosamientoLigamentoPeriodontal = engrosamientoLigamentoPeriodontal;
       this.interpretacion = interpretacion;
       this.sistemaEstomatognaticos = sistemaEstomatognaticos;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "tipo_rx")
    public String getTipoRx() {
        return this.tipoRx;
    }
    
    public void setTipoRx(String tipoRx) {
        this.tipoRx = tipoRx;
    }
    
    @Column(name = "soporte_oseo")
    public String getSoporteOseo() {
        return this.soporteOseo;
    }
    
    public void setSoporteOseo(String soporteOseo) {
        this.soporteOseo = soporteOseo;
    }
    
    @Column(name = "relacion_corona_raiz")
    public String getRelacionCoronaRaiz() {
        return this.relacionCoronaRaiz;
    }
    
    public void setRelacionCoronaRaiz(String relacionCoronaRaiz) {
        this.relacionCoronaRaiz = relacionCoronaRaiz;
    }
    
    @Column(name = "altura_reborde")
    public String getAlturaReborde() {
        return this.alturaReborde;
    }
    
    public void setAlturaReborde(String alturaReborde) {
        this.alturaReborde = alturaReborde;
    }
    
    @Column(name = "engrosamiento_ligamento_periodontal")
    public String getEngrosamientoLigamentoPeriodontal() {
        return this.engrosamientoLigamentoPeriodontal;
    }
    
    public void setEngrosamientoLigamentoPeriodontal(String engrosamientoLigamentoPeriodontal) {
        this.engrosamientoLigamentoPeriodontal = engrosamientoLigamentoPeriodontal;
    }
    
    @Column(name = "interpretacion")
    public String getInterpretacion() {
        return this.interpretacion;
    }
    
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    /*
    @Column(name = "sistema_estomatognatico")
    public Set getSistemaEstomatognaticos() {
        return this.sistemaEstomatognaticos;
    }
    
    public void setSistemaEstomatognaticos(Set sistemaEstomatognaticos) {
        this.sistemaEstomatognaticos = sistemaEstomatognaticos;
    }*/
}


