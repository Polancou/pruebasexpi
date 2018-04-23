package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author EduardoArcos
 */
@Entity
@Table(name = "estado_diente")
public class EstadoDiente  implements java.io.Serializable {


     private Integer id;
     private Dientes dientes;
     private Odontograma odontograma;
     private int espacioArriba;
     private int espacioDerecho;
     private int espacioAbajo;
     private int espacioIzquierdo;

    public EstadoDiente() {
    }

    public EstadoDiente(Dientes dientes, Odontograma odontograma, int espacioArriba, int espacioDerecho, int espacioAbajo, int espacioIzquierdo) {
       this.dientes = dientes;
       this.odontograma = odontograma;
       this.espacioArriba = espacioArriba;
       this.espacioDerecho = espacioDerecho;
       this.espacioAbajo = espacioAbajo;
       this.espacioIzquierdo = espacioIzquierdo;
    }
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "id_diente")
    public Dientes getDientes() {
        return this.dientes;
    }
    
    public void setDientes(Dientes dientes) {
        this.dientes = dientes;
    }
    
    @Column(name = "id_odontograma")
    public Odontograma getOdontograma() {
        return this.odontograma;
    }
    
    public void setOdontograma(Odontograma odontograma) {
        this.odontograma = odontograma;
    }
    
    @Column(name = "espacio_arriba")
    public int getEspacioArriba() {
        return this.espacioArriba;
    }
    
    public void setEspacioArriba(int espacioArriba) {
        this.espacioArriba = espacioArriba;
    }
    
    @Column(name = "espacio_derecho")
    public int getEspacioDerecho() {
        return this.espacioDerecho;
    }
    
    public void setEspacioDerecho(int espacioDerecho) {
        this.espacioDerecho = espacioDerecho;
    }
    
    @Column(name = "espacio_abajo")
    public int getEspacioAbajo() {
        return this.espacioAbajo;
    }
    
    public void setEspacioAbajo(int espacioAbajo) {
        this.espacioAbajo = espacioAbajo;
    }
    
    @Column(name = "espacio_izquierdo")
    public int getEspacioIzquierdo() {
        return this.espacioIzquierdo;
    }
    
    public void setEspacioIzquierdo(int espacioIzquierdo) {
        this.espacioIzquierdo = espacioIzquierdo;
    }
}


