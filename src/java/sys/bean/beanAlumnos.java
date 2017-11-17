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
import sys.dao.daoAlumnos;
import sys.imp.AlumnosImp;
import sys.model.Alumnos;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named(value = "beanAlumnos")
@ViewScoped
public class beanAlumnos implements Serializable{

    /**
     * Creates a new instance of beanAlumnos
     */
    private Alumnos alumnos;
    
    public beanAlumnos() {
        alumnos = new Alumnos();
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cancelar(){
        alumnos = new Alumnos();
    }
    
    public void insertarAlumno(){
        daoAlumnos adao = new AlumnosImp();
        boolean registro=adao.insertarAlumnos(alumnos);
        alumnos = new Alumnos();
        if(registro){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Bienvenido!", "Se ha registrado exitosamente."));
        }else{
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "¡ERROR FATAL!", "Ha ocurrido un error al realizar su registro."));   
        }
    }
    
}
