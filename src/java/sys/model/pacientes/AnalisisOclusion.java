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
@Table(name = "analisis_oclusion")
public class AnalisisOclusion  implements java.io.Serializable {


     private Integer id;
     private MovimientoMandibular movimientoMandibular;
     private RelacionIncisal relacionIncisal;
     private String clasificacion;
     private String proteccionCanina;
     private String proteccionAnterior;
     private String funcionGrupo;
     private String proteccionMutua;
     private String mordidaCruzada;
     private String mordidaAbierta;
     private String sobremordida;
     private String contactoDentatorio;
     //private Set sistemaEstomatognaticos = new HashSet(0);

    public AnalisisOclusion() {
    }

	
    public AnalisisOclusion(MovimientoMandibular movimientoMandibular, RelacionIncisal relacionIncisal, String clasificacion, String proteccionCanina, String proteccionAnterior, String funcionGrupo, String proteccionMutua, String mordidaCruzada, String mordidaAbierta, String sobremordida, String contactoDentatorio) {
        this.movimientoMandibular = movimientoMandibular;
        this.relacionIncisal = relacionIncisal;
        this.clasificacion = clasificacion;
        this.proteccionCanina = proteccionCanina;
        this.proteccionAnterior = proteccionAnterior;
        this.funcionGrupo = funcionGrupo;
        this.proteccionMutua = proteccionMutua;
        this.mordidaCruzada = mordidaCruzada;
        this.mordidaAbierta = mordidaAbierta;
        this.sobremordida = sobremordida;
        this.contactoDentatorio = contactoDentatorio;
    }
    /*
    public AnalisisOclusion(MovimientoMandibular movimientoMandibular, RelacionIncisal relacionIncisal, String clasificacion, String proteccionCanina, String proteccionAnterior, String funcionGrupo, String proteccionMutua, String mordidaCruzada, String mordidaAbierta, String sobremordida, String contactoDentatorio, Set sistemaEstomatognaticos) {
       this.movimientoMandibular = movimientoMandibular;
       this.relacionIncisal = relacionIncisal;
       this.clasificacion = clasificacion;
       this.proteccionCanina = proteccionCanina;
       this.proteccionAnterior = proteccionAnterior;
       this.funcionGrupo = funcionGrupo;
       this.proteccionMutua = proteccionMutua;
       this.mordidaCruzada = mordidaCruzada;
       this.mordidaAbierta = mordidaAbierta;
       this.sobremordida = sobremordida;
       this.contactoDentatorio = contactoDentatorio;
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
    
    @Column(name = "movimiento_mandibular")
    public MovimientoMandibular getMovimientoMandibular() {
        return this.movimientoMandibular;
    }
    
    public void setMovimientoMandibular(MovimientoMandibular movimientoMandibular) {
        this.movimientoMandibular = movimientoMandibular;
    }
    
    @Column(name = "relacion_incisal")
    public RelacionIncisal getRelacionIncisal() {
        return this.relacionIncisal;
    }
    
    public void setRelacionIncisal(RelacionIncisal relacionIncisal) {
        this.relacionIncisal = relacionIncisal;
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
    
    /*
    @Column(name = "movimiento_mandibular")
    public Set getSistemaEstomatognaticos() {
        return this.sistemaEstomatognaticos;
    }
    
    public void setSistemaEstomatognaticos(Set sistemaEstomatognaticos) {
        this.sistemaEstomatognaticos = sistemaEstomatognaticos;
    }
    */
}


