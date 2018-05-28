package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "atm")
public class Atm  implements java.io.Serializable {


     private Integer id;
     private String folio;
     private String crepitacion;
     private String sensibilidad;
     private String dolor;
     private String subluxacion,habitos_tension,tamano_lengua,torus_maxilar,torus_mandibular,desviacion,
             desviacion_apertura,desviacion_cierre,maxilar_u,maxilar_v,maxilar_afilado,mandibular_u,
             mandibular_v,mandibular_afilado;

    public Atm() {
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

    @Column(name = "folio")
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Column(name = "habitos_tension")
    public String getHabitos_tension() {
        return habitos_tension;
    }

    public void setHabitos_tension(String habitos_tension) {
        this.habitos_tension = habitos_tension;
    }

    @Column(name = "tamano_lengua")
    public String getTamano_lengua() {
        return tamano_lengua;
    }

    public void setTamano_lengua(String tamano_lengua) {
        this.tamano_lengua = tamano_lengua;
    }

    @Column(name = "torus_maxilar")
    public String getTorus_maxilar() {
        return torus_maxilar;
    }

    public void setTorus_maxilar(String torus_maxilar) {
        this.torus_maxilar = torus_maxilar;
    }

    @Column(name = "torus_mandibular")
    public String getTorus_mandibular() {
        return torus_mandibular;
    }

    public void setTorus_mandibular(String torus_mandibular) {
        this.torus_mandibular = torus_mandibular;
    }

    @Column(name = "desviacion")
    public String getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(String desviacion) {
        this.desviacion = desviacion;
    }

    @Column(name = "desviacion_apertura")
    public String getDesviacion_apertura() {
        return desviacion_apertura;
    }

    public void setDesviacion_apertura(String desviacion_apertura) {
        this.desviacion_apertura = desviacion_apertura;
    }

    @Column(name = "desviacion_cierre")
    public String getDesviacion_cierre() {
        return desviacion_cierre;
    }

    public void setDesviacion_cierre(String desviacion_cierre) {
        this.desviacion_cierre = desviacion_cierre;
    }

    @Column(name = "maxilar_u")
    public String getMaxilar_u() {
        return maxilar_u;
    }

    public void setMaxilar_u(String maxilar_u) {
        this.maxilar_u = maxilar_u;
    }

    @Column(name = "maxilar_v")
    public String getMaxilar_v() {
        return maxilar_v;
    }

    public void setMaxilar_v(String maxilar_v) {
        this.maxilar_v = maxilar_v;
    }

    @Column(name = "maxilar_afilado")
    public String getMaxilar_afilado() {
        return maxilar_afilado;
    }

    public void setMaxilar_afilado(String maxilar_afilado) {
        this.maxilar_afilado = maxilar_afilado;
    }

    @Column(name = "mandibular_u")
    public String getMandibular_u() {
        return mandibular_u;
    }

    public void setMandibular_u(String mandibular_u) {
        this.mandibular_u = mandibular_u;
    }

    @Column(name = "mandibular_v")
    public String getMandibular_v() {
        return mandibular_v;
    }

    public void setMandibular_v(String mandibular_v) {
        this.mandibular_v = mandibular_v;
    }

    @Column(name = "mandibular_afilado")
    public String getMandibular_afilado() {
        return mandibular_afilado;
    }

    public void setMandibular_afilado(String mandibular_afilado) {
        this.mandibular_afilado = mandibular_afilado;
    }
    
    
    
}


