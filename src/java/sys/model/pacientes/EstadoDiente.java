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
@Table(name = "estado_diente")
public class EstadoDiente  implements java.io.Serializable {


     private int id;
     private int idOdontograma;
     private String folio;
     private int diente;
     private String izquierda;
     private String superior;
     private String derecha;
     private String inferior;

    public EstadoDiente() {
    }

    public EstadoDiente(int id, int idOdontograma, String folio, String izquierda, String superior, String derecha, String inferior) {
        this.id = id;
        this.idOdontograma = idOdontograma;
        this.folio = folio;
        this.izquierda = izquierda;
        this.superior = superior;
        this.derecha = derecha;
        this.inferior = inferior;
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

    @Column(name = "id_odontograma")
    public int getIdOdontograma() {
        return idOdontograma;
    }

    public void setIdOdontograma(int idOdontograma) {
        this.idOdontograma = idOdontograma;
    }

    @Column(name = "folio")
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Column(name = "diente")
    public int getDiente() {
        return diente;
    }

    public void setDiente(int diente) {
        this.diente = diente;
    }

    @Column(name = "izquierda")
    public String getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(String izquierda) {
        this.izquierda = izquierda;
    }

    @Column(name = "superior")
    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    @Column(name = "derecha")
    public String getDerecha() {
        return derecha;
    }

    public void setDerecha(String derecha) {
        this.derecha = derecha;
    }

    @Column(name = "inferior")
    public String getInferior() {
        return inferior;
    }

    public void setInferior(String inferior) {
        this.inferior = inferior;
    }

    
    
}


