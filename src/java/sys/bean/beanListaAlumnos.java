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
import javax.faces.view.ViewScoped;
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
public class beanListaAlumnos implements Serializable{

    /**
     * Creates a new instance of beanListaAlumnos
     */
    
    private MaestroMaterias mmaterias;
    private Alumnos alumnos;
    private ListaAlumnos listAlumnos;
    private List<ListaAlumnos> lista;
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
    
    

    public List<ListaAlumnos> getLista() {
       
        return lista;
    }
    public void buscarLista(){
        daoListaAlumnos ldao = new ListaAlumnosImp();
        lista = ldao.MostrarAlumnos(mmaterias);
    }

    public void setLista(List<ListaAlumnos> lista) {
        this.lista = lista;
    }
    
    
    
}