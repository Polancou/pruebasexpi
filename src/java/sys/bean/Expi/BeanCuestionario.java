/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean.Expi;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import sys.dao.daoNuevoPaciente;
import sys.imp.NuevoPacienteImp;
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

    @PostConstruct
    protected void init() {
        preguntasPaciente.setP1("Si");
        preguntasPaciente.setP2("Si");
        preguntasPaciente.setP3("Si");
        preguntasPaciente.setP4("Si");
        preguntasPaciente.setP5("Si");
        preguntasPaciente.setP6("Si");
        preguntasPaciente.setP7("Si");
        preguntasPaciente.setP8("Si");
        preguntasPaciente.setP9("Si");
        preguntasPaciente.setP10("Si");
        preguntasPaciente.setP11("Si");
        preguntasPaciente.setP12("Si");
        preguntasPaciente.setP13("Si");
        preguntasPaciente.setP14("Si");
        preguntasPaciente.setP15("Si");
        preguntasPaciente.setP16("Si");
        preguntasPaciente.setP17("Si");
        preguntasPaciente.setP18("Si");
        preguntasPaciente.setP19("Si");
        preguntasPaciente.setP20("Si");
        preguntasPaciente.setP21("Si");
        preguntasPaciente.setP22("Si");
        preguntasPaciente.setP23("Si");
        preguntasPaciente.setP24("Si");
        preguntasPaciente.setP25("Si");
        preguntasPaciente.setP26("Si");
        preguntasPaciente.setP27("Si");
        preguntasPaciente.setP28("Si");
        preguntasPaciente.setP29("Si");
        preguntasPaciente.setP30("Si");
        preguntasPaciente.setP31("Si");
        preguntasPaciente.setP32("Si");
        preguntasPaciente.setP33("Si");
        
    }
    
    public void imprimir(){
        System.out.println(padecimientos.getAnginaPecho() + "   "+padecimientos.getAsma());
    }
    
    public void guardar(){
        System.out.println("Entra al metodo");
        daoNuevoPaciente daoNuevo = new NuevoPacienteImp();
        boolean guardó=daoNuevo.cuestionario(preguntasPaciente, selectedConsoles, alergias);
        if (guardó){
            System.out.println("Guardó datos");
        }else{
            System.out.println("Pura madre");
        }
    }

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
