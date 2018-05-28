package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


//import java.util.HashSet;
//import java.util.Set;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "examen_oral")
public class ExamenOral  implements java.io.Serializable {


     private Integer id;
     private Date dolor_duracion;
     private String folio,dolor_organo,dolor_ubicacion,dolor_estimulo,lesion_pulpar,exposicion_pulpar,inflamacion,
             percusion_organo,percusion_vertical,percusion_horizontal,percusion_palpacion,frio_organo,frio_estado,
             calor_organo,calor_estado;
     //private Set sistemaEstomatognaticos = new HashSet(0);

    public ExamenOral() {
    }

    public ExamenOral(String folio, String dolor_organo, String dolor_ubicacion, String dolor_estimulo, String lesion_pulpar, String exposicion_pulpar, String inflamacion, String percusion_organo, String percusion_vertical, String percusion_horizontal, String percusion_palpacion, String frio_organo, String frio_estado, String calor_organo, String calor_estado) {
        this.folio = folio;
        this.dolor_organo = dolor_organo;
        this.dolor_ubicacion = dolor_ubicacion;
        this.dolor_estimulo = dolor_estimulo;
        this.lesion_pulpar = lesion_pulpar;
        this.exposicion_pulpar = exposicion_pulpar;
        this.inflamacion = inflamacion;
        this.percusion_organo = percusion_organo;
        this.percusion_vertical = percusion_vertical;
        this.percusion_horizontal = percusion_horizontal;
        this.percusion_palpacion = percusion_palpacion;
        this.frio_organo = frio_organo;
        this.frio_estado = frio_estado;
        this.calor_organo = calor_organo;
        this.calor_estado = calor_estado;
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

    @Column(name = "dolor_organo")
    public String getDolor_organo() {
        return dolor_organo;
    }

    public void setDolor_organo(String dolor_organo) {
        this.dolor_organo = dolor_organo;
    }

    @Column(name = "dolor_ubicacion")
    public String getDolor_ubicacion() {
        return dolor_ubicacion;
    }

    public void setDolor_ubicacion(String dolor_ubicacion) {
        this.dolor_ubicacion = dolor_ubicacion;
    }

    @Column(name = "dolor_estimulo")
    public String getDolor_estimulo() {
        return dolor_estimulo;
    }

    public void setDolor_estimulo(String dolor_estimulo) {
        this.dolor_estimulo = dolor_estimulo;
    }

    @Column(name = "lesion_pulpar")
    public String getLesion_pulpar() {
        return lesion_pulpar;
    }

    public void setLesion_pulpar(String lesion_pulpar) {
        this.lesion_pulpar = lesion_pulpar;
    }

    @Column(name = "exposicion_pulpar")
    public String getExposicion_pulpar() {
        return exposicion_pulpar;
    }

    public void setExposicion_pulpar(String exposicion_pulpar) {
        this.exposicion_pulpar = exposicion_pulpar;
    }

    @Column(name = "inflamacion")
    public String getInflamacion() {
        return inflamacion;
    }

    public void setInflamacion(String inflamacion) {
        this.inflamacion = inflamacion;
    }

    @Column(name = "percusion_organo")
    public String getPercusion_organo() {
        return percusion_organo;
    }

    public void setPercusion_organo(String percusion_organo) {
        this.percusion_organo = percusion_organo;
    }

    @Column(name = "percusion_vertical")
    public String getPercusion_vertical() {
        return percusion_vertical;
    }

    public void setPercusion_vertical(String percusion_vertical) {
        this.percusion_vertical = percusion_vertical;
    }

    @Column(name = "percusion_horizontal")
    public String getPercusion_horizontal() {
        return percusion_horizontal;
    }

    public void setPercusion_horizontal(String percusion_horizontal) {
        this.percusion_horizontal = percusion_horizontal;
    }

    @Column(name = "percusion_palpacion")
    public String getPercusion_palpacion() {
        return percusion_palpacion;
    }

    public void setPercusion_palpacion(String percusion_palpacion) {
        this.percusion_palpacion = percusion_palpacion;
    }

    @Column(name = "frio_organo")
    public String getFrio_organo() {
        return frio_organo;
    }

    public void setFrio_organo(String frio_organo) {
        this.frio_organo = frio_organo;
    }

    @Column(name = "frio_estado")
    public String getFrio_estado() {
        return frio_estado;
    }

    public void setFrio_estado(String frio_estado) {
        this.frio_estado = frio_estado;
    }

    @Column(name = "calor_organo")
    public String getCalor_organo() {
        return calor_organo;
    }

    public void setCalor_organo(String calor_organo) {
        this.calor_organo = calor_organo;
    }

    @Column(name = "calor_estado")
    public String getCalor_estado() {
        return calor_estado;
    }

    public void setCalor_estado(String calor_estado) {
        this.calor_estado = calor_estado;
    }

    
    
}


