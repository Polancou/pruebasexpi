/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.model.pacientes;

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
@Table(name = "periodontograma")
public class Periodontograma {
    
    private int id,paciente;
    private String estado,dientes;

    public Periodontograma(int paciente, String estado, String dientes) {
        this.paciente = paciente;
        this.estado = estado;
        this.dientes = dientes;
    }
    
    public Periodontograma(){
        
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

    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "dientes")
    public String getDientes() {
        return dientes;
    }

    public void setDientes(String dientes) {
        this.dientes = dientes;
    }
    
    
    
}
