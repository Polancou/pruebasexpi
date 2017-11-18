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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import sys.dao.daoListaAlumnos;
import sys.imp.ListaAlumnosImp;
import sys.model.Alumnos;
import sys.model.ListaAlumnos;
import sys.model.MaestroMaterias;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named(value = "beanListaAlumnos")
@ViewScoped
public class beanListaAlumnos implements Serializable {

    /**
     * Creates a new instance of beanListaAlumnos
     */
    private MaestroMaterias mmaterias;
    private Alumnos alumnos;
    private ListaAlumnos listAlumnos;
    private List<ListaAlumnos> list;
    private String año;

    public beanListaAlumnos() {
        mmaterias = new MaestroMaterias();
        alumnos = new Alumnos();
        listAlumnos = new ListaAlumnos();
    }

    public MaestroMaterias getMmaterias() {
        return mmaterias;
    }

    public void setMmaterias(MaestroMaterias mmaterias) {
        this.mmaterias = mmaterias;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public ListaAlumnos getListAlumnos() {
       
        return listAlumnos;
    }

    public void setListAlumnos(ListaAlumnos listAlumnos) {
        this.listAlumnos = listAlumnos;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public List<ListaAlumnos> getList() {
         daoListaAlumnos ldao = new ListaAlumnosImp();
        list = ldao.MostrarClases(alumnos,mmaterias);
        return list;
    }

    public void setList(List<ListaAlumnos> list) {
        this.list = list;
    }
    
    
  HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession sessionUsuario = request.getSession();
        
    public void insertarMateria() {
          
        int user=(int) sessionUsuario.getAttribute("idSesion");
        listAlumnos.getAlumnos().setMatricula(user);
        daoListaAlumnos ldao = new ListaAlumnosImp();
        ldao.insertarListaAlumnos(listAlumnos);    
        listAlumnos = new ListaAlumnos();
    }

}
