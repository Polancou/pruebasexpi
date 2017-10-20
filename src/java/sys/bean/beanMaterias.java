/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import sys.dao.daoMaterias;
import sys.imp.MateriasImp;
import sys.model.Materias;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named(value = "beanMaterias")
@ViewScoped
public class beanMaterias implements Serializable {

    /**
     * Creates a new instance of beanMaterias
     */
    private Materias materia;

    public beanMaterias() {
        materia = new Materias();
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public void insertarMateria() {
        daoMaterias mdao = new MateriasImp();
        mdao.insertarMaterias(materia);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se a ingresado satisfactoriamente"));

    }
}
