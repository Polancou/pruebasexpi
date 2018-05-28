/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.model.pacientes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ramses Mtnz Santiago
 */
@Entity
@Table(name = "esquema_dientes")
public class EsquemaDientes implements java.io.Serializable{
    
    private String folio,subsecuente,diente,problema,img;
    private int id,paciente;
    private Date fecha;

    public EsquemaDientes() {
    }

    public EsquemaDientes(String folio, String subsecuente, String diente, String problema, String img, int paciente, Date fecha) {
        this.folio = folio;
        this.subsecuente = subsecuente;
        this.diente = diente;
        this.problema = problema;
        this.img = img;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    @Column(name = "folio")
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Column(name = "subsecuente")
    public String getSubsecuente() {
        return subsecuente;
    }

    public void setSubsecuente(String subsecuente) {
        this.subsecuente = subsecuente;
    }

    @Column(name = "diente")
    public String getDiente() {
        return diente;
    }

    public void setDiente(String diente) {
        this.diente = diente;
    }

    @Column(name = "problema")
    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "paciente")
    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
