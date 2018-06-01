package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


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
@Table(name = "examen_orofacial")
public class ExamenOrofacial  implements java.io.Serializable {


     private Integer id,paciente,atm,analisisOclusion,examenOral,hallazgosRadiograficos;
     private Date fecha;
     private String caraForma,caraLabios,bordesBermellon;

    public ExamenOrofacial() {
    }

    public ExamenOrofacial(Integer paciente, Integer atm, Integer analisisOclusion, Integer examenOral, Integer hallazgosRadiograficos, Date fecha, String caraForma, String caraLabios, String bordesBermellon) {
        this.paciente = paciente;
        this.atm = atm;
        this.analisisOclusion = analisisOclusion;
        this.examenOral = examenOral;
        this.hallazgosRadiograficos = hallazgosRadiograficos;
        this.fecha = fecha;
        this.caraForma = caraForma;
        this.caraLabios = caraLabios;
        this.bordesBermellon = bordesBermellon;
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

    @Column(name = "paciente")
    public Integer getPaciente() {
        return paciente;
    }

    public void setPaciente(Integer paciente) {
        this.paciente = paciente;
    }

    @Column(name = "atm")
    public Integer getAtm() {
        return atm;
    }

    public void setAtm(Integer atm) {
        this.atm = atm;
    }

    @Column(name = "analisis_oclusion")
    public Integer getAnalisisOclusion() {
        return analisisOclusion;
    }

    public void setAnalisisOclusion(Integer analisisOclusion) {
        this.analisisOclusion = analisisOclusion;
    }

    @Column(name = "examen_oral")
    public Integer getExamenOral() {
        return examenOral;
    }

    public void setExamenOral(Integer examenOral) {
        this.examenOral = examenOral;
    }

    @Column(name = "hallazgos_radiograficos")
    public Integer getHallazgosRadiograficos() {
        return hallazgosRadiograficos;
    }

    public void setHallazgosRadiograficos(Integer hallazgosRadiograficos) {
        this.hallazgosRadiograficos = hallazgosRadiograficos;
    }

    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Column(name = "cara_forma")
    public String getCaraForma() {
        return caraForma;
    }

    public void setCaraForma(String caraForma) {
        this.caraForma = caraForma;
    }

    @Column(name = "cara_labios")
    public String getCaraLabios() {
        return caraLabios;
    }

    public void setCaraLabios(String caraLabios) {
        this.caraLabios = caraLabios;
    }

    @Column(name = "bordes_bermellon")
    public String getBordesBermellon() {
        return bordesBermellon;
    }

    public void setBordesBermellon(String bordesBermellon) {
        this.bordesBermellon = bordesBermellon;
    }
    
}


