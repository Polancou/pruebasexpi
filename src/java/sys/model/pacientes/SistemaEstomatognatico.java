package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


//import java.util.HashSet;
//import java.util.Set;
import sys.model.pacientes.AnalisisOclusion;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "sistema_estomagnatico")
public class SistemaEstomatognatico  implements java.io.Serializable {


     private Integer id;
     private AnalisisOclusion analisisOclusion;
     private Atm atm;
     private ExamenOral examenOral;
     private HallazgosRadiograficos hallazgosRadiograficos;
     //private Set examenOrofacials = new HashSet(0);

    public SistemaEstomatognatico() {
    }

	
    public SistemaEstomatognatico(AnalisisOclusion analisisOclusion, Atm atm, ExamenOral examenOral, HallazgosRadiograficos hallazgosRadiograficos) {
        this.analisisOclusion = analisisOclusion;
        this.atm = atm;
        this.examenOral = examenOral;
        this.hallazgosRadiograficos = hallazgosRadiograficos;
    }
    /*
    public SistemaEstomatognatico(AnalisisOclusion analisisOclusion, Atm atm, ExamenOral examenOral, HallazgosRadiograficos hallazgosRadiograficos, Set examenOrofacials) {
       this.analisisOclusion = analisisOclusion;
       this.atm = atm;
       this.examenOral = examenOral;
       this.hallazgosRadiograficos = hallazgosRadiograficos;
       this.examenOrofacials = examenOrofacials;
    }*/
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "analisis_oclusion")
    public AnalisisOclusion getAnalisisOclusion() {
        return this.analisisOclusion;
    }
    
    public void setAnalisisOclusion(AnalisisOclusion analisisOclusion) {
        this.analisisOclusion = analisisOclusion;
    }
    
    @Column(name = "atm")
    public Atm getAtm() {
        return this.atm;
    }
    
    public void setAtm(Atm atm) {
        this.atm = atm;
    }
    
    @Column(name = "examen_oral")
    public ExamenOral getExamenOral() {
        return this.examenOral;
    }
    
    public void setExamenOral(ExamenOral examenOral) {
        this.examenOral = examenOral;
    }
    
    @Column(name = "hallazgos_radiograficos")
    public HallazgosRadiograficos getHallazgosRadiograficos() {
        return this.hallazgosRadiograficos;
    }
    
    public void setHallazgosRadiograficos(HallazgosRadiograficos hallazgosRadiograficos) {
        this.hallazgosRadiograficos = hallazgosRadiograficos;
    }
    /*
    public Set getExamenOrofacials() {
        return this.examenOrofacials;
    }
    
    public void setExamenOrofacials(Set examenOrofacials) {
        this.examenOrofacials = examenOrofacials;
    }*/
}


