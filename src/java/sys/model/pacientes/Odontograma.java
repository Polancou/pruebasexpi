package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "odontograma")
public class Odontograma  implements java.io.Serializable {


     private Integer id,id_paciente;
     private String estado_odontograma,Num_dientes,Superficies_placa,Extension_placa,Num_superficies;
     private Date fecha;

    public Odontograma() {
    }

    public Odontograma(Integer id_paciente, String estado_odontograma, String Num_dientes, String Superficies_placa, String Extension_placa, String Num_superficies, Date fecha) {
        this.id_paciente = id_paciente;
        this.estado_odontograma = estado_odontograma;
        this.Num_dientes = Num_dientes;
        this.Superficies_placa = Superficies_placa;
        this.Extension_placa = Extension_placa;
        this.Num_superficies = Num_superficies;
        this.fecha = fecha;
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

    @Column(name = "id_paciente")
    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    @Column(name = "estado_odontograma")
    public String getEstado_odontograma() {
        return estado_odontograma;
    }

    public void setEstado_odontograma(String estado_odontograma) {
        this.estado_odontograma = estado_odontograma;
    }

    @Column(name = "Num_dientes")
    public String getNum_dientes() {
        return Num_dientes;
    }

    public void setNum_dientes(String Num_dientes) {
        this.Num_dientes = Num_dientes;
    }

    @Column(name = "Superficies_placas")
    public String getSuperficies_placa() {
        return Superficies_placa;
    }

    public void setSuperficies_placa(String Superficies_placa) {
        this.Superficies_placa = Superficies_placa;
    }

    @Column(name = "Extension_placa")
    public String getExtension_placa() {
        return Extension_placa;
    }

    public void setExtension_placa(String Extension_placa) {
        this.Extension_placa = Extension_placa;
    }

    @Column(name = "Num_superficies")
    public String getNum_superficies() {
        return Num_superficies;
    }

    public void setNum_superficies(String Num_superficies) {
        this.Num_superficies = Num_superficies;
    }

    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
}


