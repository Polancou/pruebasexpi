/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
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
        adao.insertarAlumnos(alumnos);
        alumnos = new Alumnos();
    }
    
}
