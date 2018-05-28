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
@Table(name = "hallazgos_radiograficos")
public class HallazgosRadiograficos  implements java.io.Serializable {


     private Integer id;
     private String folio,tipo_rx,soporte_oseo,relacion_corona_raiz,altura_reborde,engrosamiento_ligamento_periodontal,
             interpretacion;
     

    public HallazgosRadiograficos() {
    }

    public HallazgosRadiograficos(String folio, String tipo_rx, String soporte_oseo, String relacion_corona_raiz, String altura_reborde, String engrosamiento_ligamento_periodontal, String interpretacion) {
        this.folio = folio;
        this.tipo_rx = tipo_rx;
        this.soporte_oseo = soporte_oseo;
        this.relacion_corona_raiz = relacion_corona_raiz;
        this.altura_reborde = altura_reborde;
        this.engrosamiento_ligamento_periodontal = engrosamiento_ligamento_periodontal;
        this.interpretacion = interpretacion;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue
    public Integer getId() {
        return id;
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

    @Column(name = "tipo_rx")
    public String getTipo_rx() {
        return tipo_rx;
    }

    public void setTipo_rx(String tipo_rx) {
        this.tipo_rx = tipo_rx;
    }

    @Column(name = "soporte_oseo")
    public String getSoporte_oseo() {
        return soporte_oseo;
    }

    public void setSoporte_oseo(String soporte_oseo) {
        this.soporte_oseo = soporte_oseo;
    }

    @Column(name = "relacion_corona_raiz")
    public String getRelacion_corona_raiz() {
        return relacion_corona_raiz;
    }

    public void setRelacion_corona_raiz(String relacion_corona_raiz) {
        this.relacion_corona_raiz = relacion_corona_raiz;
    }

    @Column(name = "altura_reborde")
    public String getAltura_reborde() {
        return altura_reborde;
    }

    public void setAltura_reborde(String altura_reborde) {
        this.altura_reborde = altura_reborde;
    }

    @Column(name = "engrosamiento_ligamento_periodontal")
    public String getEngrosamiento_ligamento_periodontal() {
        return engrosamiento_ligamento_periodontal;
    }

    public void setEngrosamiento_ligamento_periodontal(String engrosamiento_ligamento_periodontal) {
        this.engrosamiento_ligamento_periodontal = engrosamiento_ligamento_periodontal;
    }

    @Column(name = "interpretacion")
    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    
    
}


