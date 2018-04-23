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
@Table(name = "pedecimientos")
public class Padecimientos  implements java.io.Serializable {


     private Integer id;
     private String hepatitis;
     private String enfermedadesVeneras;
     private String embolia;
     private String varicela;
     private String asma;
     private String ictericia;
     private String infartoMiocardio;
     private String epilepsia;
     private String fiebreReumatica;
     private String hipertensionArterial;
     private String tuberculosis;
     private String anginaPecho;
     private String diabetes;
     private String sarampiom;
     private String cancer;
     //private Set preguntasPacientes = new HashSet(0);

    public Padecimientos() {
    }

	
    public Padecimientos(String hepatitis, String enfermedadesVeneras, String embolia, String varicela, String asma, String ictericia, String infartoMiocardio, String epilepsia, String fiebreReumatica, String hipertensionArterial, String tuberculosis, String anginaPecho, String diabetes, String sarampiom, String cancer) {
        this.hepatitis = hepatitis;
        this.enfermedadesVeneras = enfermedadesVeneras;
        this.embolia = embolia;
        this.varicela = varicela;
        this.asma = asma;
        this.ictericia = ictericia;
        this.infartoMiocardio = infartoMiocardio;
        this.epilepsia = epilepsia;
        this.fiebreReumatica = fiebreReumatica;
        this.hipertensionArterial = hipertensionArterial;
        this.tuberculosis = tuberculosis;
        this.anginaPecho = anginaPecho;
        this.diabetes = diabetes;
        this.sarampiom = sarampiom;
        this.cancer = cancer;
    }
    /*
    public Padecimientos(String hepatitis, String enfermedadesVeneras, String embolia, String varicela, String asma, String ictericia, String infartoMiocardio, String epilepsia, String fiebreReumatica, String hipertensionArterial, String tuberculosis, String anginaPecho, String diabetes, String sarampiom, String cancer, Set preguntasPacientes) {
       this.hepatitis = hepatitis;
       this.enfermedadesVeneras = enfermedadesVeneras;
       this.embolia = embolia;
       this.varicela = varicela;
       this.asma = asma;
       this.ictericia = ictericia;
       this.infartoMiocardio = infartoMiocardio;
       this.epilepsia = epilepsia;
       this.fiebreReumatica = fiebreReumatica;
       this.hipertensionArterial = hipertensionArterial;
       this.tuberculosis = tuberculosis;
       this.anginaPecho = anginaPecho;
       this.diabetes = diabetes;
       this.sarampiom = sarampiom;
       this.cancer = cancer;
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
    
    @Column(name = "hepatitis")
    public String getHepatitis() {
        return this.hepatitis;
    }
    
    public void setHepatitis(String hepatitis) {
        this.hepatitis = hepatitis;
    }
    
    @Column(name = "enfermedades_veneras")
    public String getEnfermedadesVeneras() {
        return this.enfermedadesVeneras;
    }
    
    public void setEnfermedadesVeneras(String enfermedadesVeneras) {
        this.enfermedadesVeneras = enfermedadesVeneras;
    }
    
    @Column(name = "embolia")
    public String getEmbolia() {
        return this.embolia;
    }
    
    public void setEmbolia(String embolia) {
        this.embolia = embolia;
    }
    
    @Column(name = "varicela")
    public String getVaricela() {
        return this.varicela;
    }
    
    public void setVaricela(String varicela) {
        this.varicela = varicela;
    }
    
    @Column(name = "asma")
    public String getAsma() {
        return this.asma;
    }
    
    public void setAsma(String asma) {
        this.asma = asma;
    }
    
    @Column(name = "ictericia")
    public String getIctericia() {
        return this.ictericia;
    }
    
    public void setIctericia(String ictericia) {
        this.ictericia = ictericia;
    }
    
    @Column(name = "infarto_miocardio")
    public String getInfartoMiocardio() {
        return this.infartoMiocardio;
    }
    
    public void setInfartoMiocardio(String infartoMiocardio) {
        this.infartoMiocardio = infartoMiocardio;
    }
    
    @Column(name = "epilepsia")
    public String getEpilepsia() {
        return this.epilepsia;
    }
    
    public void setEpilepsia(String epilepsia) {
        this.epilepsia = epilepsia;
    }
    
    @Column(name = "fiebre_reumatica")
    public String getFiebreReumatica() {
        return this.fiebreReumatica;
    }
    
    public void setFiebreReumatica(String fiebreReumatica) {
        this.fiebreReumatica = fiebreReumatica;
    }
    
    @Column(name = "hipertension_arterial")
    public String getHipertensionArterial() {
        return this.hipertensionArterial;
    }
    
    public void setHipertensionArterial(String hipertensionArterial) {
        this.hipertensionArterial = hipertensionArterial;
    }
    
    @Column(name = "tuberculosis")
    public String getTuberculosis() {
        return this.tuberculosis;
    }
    
    public void setTuberculosis(String tuberculosis) {
        this.tuberculosis = tuberculosis;
    }
    
    @Column(name = "angina_pecho")
    public String getAnginaPecho() {
        return this.anginaPecho;
    }
    
    public void setAnginaPecho(String anginaPecho) {
        this.anginaPecho = anginaPecho;
    }
    
    @Column(name = "diabetes")
    public String getDiabetes() {
        return this.diabetes;
    }
    
    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }
    
    @Column(name = "sarampiom")
    public String getSarampiom() {
        return this.sarampiom;
    }
    
    public void setSarampiom(String sarampiom) {
        this.sarampiom = sarampiom;
    }
    
    @Column(name = "cancer")
    public String getCancer() {
        return this.cancer;
    }
    
    public void setCancer(String cancer) {
        this.cancer = cancer;
    }
    /*
    public Set getPreguntasPacientes() {
        return this.preguntasPacientes;
    }
    
    public void setPreguntasPacientes(Set preguntasPacientes) {
        this.preguntasPacientes = preguntasPacientes;
    }*/
}


