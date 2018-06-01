/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean.Expi;

import sys.model.pacientes.Test;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sys.model.pacientes.ControlPlaca;

/**
 *
 * @author polancou
 */
@Named(value = "controlPlaca")
@ViewScoped
public class BeanControlPlaca implements Serializable {

    private String numdientes;
    private String Superficiesplaca;
    private String numsuperficies;
    private String extensionplaca;
    private String diente;
    public static ControlPlaca control;

    public ControlPlaca getControl() {
        return control;
    }

    public BeanControlPlaca(String numdientes, String Superficiesplaca, String numsuperficies, String extensionplaca, String diente, ControlPlaca control) {
        this.numdientes = numdientes;
        this.Superficiesplaca = Superficiesplaca;
        this.numsuperficies = numsuperficies;
        this.extensionplaca = extensionplaca;
        this.diente = diente;
        this.control = control;
    }

    public BeanControlPlaca (){
        control = new ControlPlaca();
    }
    
    public void setControl(ControlPlaca control) {
        this.control = control;
    }
    public static Test prueba = new Test();

    /**
     * Creates a new instance of NuevoBean
     */
    @PostConstruct
    public void init() {
        String cadena = "#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff";
        String dienteval = prueba.getDiente();
        if (dienteval == "0"){
            prueba.setDiente(cadena);
        }else{
            prueba.setDiente(dienteval);
        }
    }
     public void Obtienetodo() {
         
        String nuevotexto = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nuevotexto");
        System.out.println(nuevotexto);
        prueba.setDiente(nuevotexto);
    }
     
    public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "El Control de placa se guardó con éxito da click en siguiente para continuar", "")); 
    }

    /**
     * @return the diente
     */
    public String getDiente() {
        diente = prueba.getDiente();
        return diente;
    }

    /**
     * @param diente the diente to set
     */
    public void setDiente(String diente) {
        this.diente = diente;
    }

    /**
     * @return the prueba
     */
    public Test getPrueba() {
        return prueba;
    }

    /**
     * @param prueba the prueba to set
     */
    public void setPrueba(Test prueba) {
        this.prueba = prueba;
    }

    /**
     * @return the numdientes
     */
    public String getNumdientes() {
        return numdientes;
    }

    /**
     * @param numdientes the numdientes to set
     */
    public void setNumdientes(String numdientes) {
        this.numdientes = numdientes;
    }

    /**
     * @return the Superficiesplaca
     */
    public String getSuperficiesplaca() {
        return Superficiesplaca;
    }

    /**
     * @param Superficiesplaca the Superficiesplaca to set
     */
    public void setSuperficiesplaca(String Superficiesplaca) {
        this.Superficiesplaca = Superficiesplaca;
    }

    /**
     * @return the numsuperficies
     */
    public String getNumsuperficies() {
        return numsuperficies;
    }

    /**
     * @param numsuperficies the numsuperficies to set
     */
    public void setNumsuperficies(String numsuperficies) {
        this.numsuperficies = numsuperficies;
    }

    /**
     * @return the extensionplaca
     */
    public String getExtensionplaca() {
        return extensionplaca;
    }

    /**
     * @param extensionplaca the extensionplaca to set
     */
    public void setExtensionplaca(String extensionplaca) {
        this.extensionplaca = extensionplaca;
    }


}
