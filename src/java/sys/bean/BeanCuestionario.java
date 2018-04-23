/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import sys.model.pacientes.AlergiasMedicamentos;
import sys.model.pacientes.Padecimientos;
import sys.model.pacientes.PreguntasPaciente;

/**
 *
 * @author Ramses Mtnz Santiago
 */
@Named(value = "Cuestionario")
@ViewScoped
public class BeanCuestionario implements Serializable {

    private PreguntasPaciente preguntasPaciente;
    private AlergiasMedicamentos alergiasMedicamentos;
    private Padecimientos padecimientos;
    private String[] alergias;
    private String[] selectedConsoles;
    
    public BeanCuestionario() {
        preguntasPaciente = new PreguntasPaciente();
        alergiasMedicamentos = new AlergiasMedicamentos();
        padecimientos = new Padecimientos();
    }
    
    public PreguntasPaciente getPreguntasPaciente() {
        return preguntasPaciente;
    }

    public void setPreguntasPaciente(PreguntasPaciente preguntasPaciente) {
        this.preguntasPaciente = preguntasPaciente;
    }

    public AlergiasMedicamentos getAlergiasMedicamentos() {
        return alergiasMedicamentos;
    }

    public void setAlergiasMedicamentos(AlergiasMedicamentos alergiasMedicamentos) {
        this.alergiasMedicamentos = alergiasMedicamentos;
    }

    public Padecimientos getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(Padecimientos padecimientos) {
        this.padecimientos = padecimientos;
    }

    public String[] getSelectedConsoles() {
        return selectedConsoles;
    }

    public void setSelectedConsoles(String[] selectedConsoles) {
        this.selectedConsoles = selectedConsoles;
    }
    
    public String[] getAlergias() {
        return alergias;
    }

    public void setAlergias(String[] alergias) {
        this.alergias = alergias;
    }
    
}