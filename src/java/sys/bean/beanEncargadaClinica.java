/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import sys.dao.daoEncargadaDeFarmacia;
import sys.imp.EncargadaClinicaImp;
import sys.model.EncargadaClinica;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named(value = "beanEncargadaClinica")
@ViewScoped
public class beanEncargadaClinica implements Serializable {

    private EncargadaClinica encargada;
    private List<EncargadaClinica> verEncargada;

    public beanEncargadaClinica() {
        encargada = new EncargadaClinica();
    }

    public EncargadaClinica getEncargada() {
        return encargada;
    }

    public void setEncargada(EncargadaClinica encargada) {
        this.encargada = encargada;
    }

    public void insertarEncargadaClinica() {
        daoEncargadaDeFarmacia edao = new EncargadaClinicaImp();
        edao.insertarEncargada(encargada);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se a ingresado satisfactoriamente"));

    }

    public List<EncargadaClinica> getVerEncargada() {
        daoEncargadaDeFarmacia edao = new EncargadaClinicaImp();
        verEncargada = edao.verEncargadas();
        return verEncargada;
    }

    public void actualizarEncargada() {
        daoEncargadaDeFarmacia edao = new EncargadaClinicaImp();
        edao.actualizarEncargada(encargada);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se a actualizado satisfactoriamente"));
    }

    public void eliminarEncargada() {
        daoEncargadaDeFarmacia edao = new EncargadaClinicaImp();
        edao.eliminarEncargada(encargada);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se a eliminado satisfactoriamente"));
    }

}
