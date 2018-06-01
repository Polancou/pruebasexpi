/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean.Expi;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import sys.model.pacientes.Test;

/**
 *
 * @author Ramses Mtnz Santiago
 */
@Named(value = "odontograma")
@ViewScoped
public class BeanOdontograma implements Serializable {
    
    private String diente;
    private Test prueba = new Test();

    /**
     * Creates a new instance of NuevoBean
     */
    @PostConstruct
    private void init() {
        prueba.setDiente("#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff,#ffffff");
    }
     public void Obtienetodo() {
         
        String nuevotexto = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nuevotexto");
        System.out.println(nuevotexto);
         prueba.setDiente(nuevotexto);
    }

     public void guardar(){
         System.out.println("Chido");
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

}