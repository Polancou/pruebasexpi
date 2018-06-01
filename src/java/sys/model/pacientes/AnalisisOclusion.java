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
@Table(name = "analisis_oclusion")
public class AnalisisOclusion  implements java.io.Serializable {


     private Integer id;
     private String clasificacion;
     private String proteccionCanina;
     private String proteccionAnterior;
     private String funcionGrupo;
     private String proteccionMutua;
     private String mordidaCruzada;
     private String mordidaAbierta;
     private String sobremordida;
     private String contactoDentatorio,incisal_horizontal,incisal_vertical,mandibular_protusivo,mandibular_derecho,
            madibular_izquierdo;

    public AnalisisOclusion() {
    }

    public AnalisisOclusion(String clasificacion, String proteccionCanina, String proteccionAnterior, String funcionGrupo, String proteccionMutua, String mordidaCruzada, String mordidaAbierta, String sobremordida, String contactoDentatorio, String incisal_horizontal, String incisal_vertical, String mandibular_protusivo, String mandibular_derecho, String madibular_izquierdo) {
        this.clasificacion = clasificacion;
        this.proteccionCanina = proteccionCanina;
        this.proteccionAnterior = proteccionAnterior;
        this.funcionGrupo = funcionGrupo;
        this.proteccionMutua = proteccionMutua;
        this.mordidaCruzada = mordidaCruzada;
        this.mordidaAbierta = mordidaAbierta;
        this.sobremordida = sobremordida;
        this.contactoDentatorio = contactoDentatorio;
        this.incisal_horizontal = incisal_horizontal;
        this.incisal_vertical = incisal_vertical;
        this.mandibular_protusivo = mandibular_protusivo;
        this.mandibular_derecho = mandibular_derecho;
        this.madibular_izquierdo = madibular_izquierdo;
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
    
    @Column(name = "clasificacion")
    public String getClasificacion() {
        return this.clasificacion;
    }
    
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    @Column(name = "proteccion_canina")
    public String getProteccionCanina() {
        return this.proteccionCanina;
    }
    
    public void setProteccionCanina(String proteccionCanina) {
        this.proteccionCanina = proteccionCanina;
    }
    
    @Column(name = "proteccion_anterior")
    public String getProteccionAnterior() {
        return this.proteccionAnterior;
    }
    
    public void setProteccionAnterior(String proteccionAnterior) {
        this.proteccionAnterior = proteccionAnterior;
    }
    
    @Column(name = "funcion_grupo")
    public String getFuncionGrupo() {
        return this.funcionGrupo;
    }
    
    public void setFuncionGrupo(String funcionGrupo) {
        this.funcionGrupo = funcionGrupo;
    }
    
    @Column(name = "proteccion_mutua")
    public String getProteccionMutua() {
        return this.proteccionMutua;
    }
    
    public void setProteccionMutua(String proteccionMutua) {
        this.proteccionMutua = proteccionMutua;
    }
    
    @Column(name = "mordida_cruzada")
    public String getMordidaCruzada() {
        return this.mordidaCruzada;
    }
    
    public void setMordidaCruzada(String mordidaCruzada) {
        this.mordidaCruzada = mordidaCruzada;
    }
    
    @Column(name = "mordida_abierta")
    public String getMordidaAbierta() {
        return this.mordidaAbierta;
    }
    
    public void setMordidaAbierta(String mordidaAbierta) {
        this.mordidaAbierta = mordidaAbierta;
    }
    
    @Column(name = "sobremordida")
    public String getSobremordida() {
        return this.sobremordida;
    }
    
    public void setSobremordida(String sobremordida) {
        this.sobremordida = sobremordida;
    }
    
    @Column(name = "contacto_dentatorio")
    public String getContactoDentatorio() {
        return this.contactoDentatorio;
    }
    
    public void setContactoDentatorio(String contactoDentatorio) {
        this.contactoDentatorio = contactoDentatorio;
    }

    @Column(name = "incisal_horizontal")
    public String getIncisal_horizontal() {
        return incisal_horizontal;
    }

    public void setIncisal_horizontal(String incisal_horizontal) {
        this.incisal_horizontal = incisal_horizontal;
    }

    @Column(name = "incisal_vertical")
    public String getIncisal_vertical() {
        return incisal_vertical;
    }

    public void setIncisal_vertical(String incisal_vertical) {
        this.incisal_vertical = incisal_vertical;
    }

    @Column(name = "mandibular_protusivo")
    public String getMandibular_protusivo() {
        return mandibular_protusivo;
    }

    public void setMandibular_protusivo(String mandibular_protusivo) {
        this.mandibular_protusivo = mandibular_protusivo;
    }

    @Column(name = "mandibular_derecho")
    public String getMandibular_derecho() {
        return mandibular_derecho;
    }

    public void setMandibular_derecho(String mandibular_derecho) {
        this.mandibular_derecho = mandibular_derecho;
    }

    @Column(name = "madibular_izquierdo")
    public String getMadibular_izquierdo() {
        return madibular_izquierdo;
    }

    public void setMadibular_izquierdo(String madibular_izquierdo) {
        this.madibular_izquierdo = madibular_izquierdo;
    }
    
    
    
}


