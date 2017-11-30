/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sys.dao.daoLoginSesion;
import sys.imp.LoginSesionImp;
import sys.model.Alumnos;
import sys.model.EncargadaClinica;
import sys.model.Maestro;
import sys.model.SesionTable;

/**
 *
 * @author RamsesMtnz
 */
@Named(value = "LoginMB")
@ViewScoped
public class beanLoginSesion implements Serializable {
    
    private SesionTable user;
    private Maestro maestro;
    private Alumnos alumno;
    private EncargadaClinica encargada;
    private boolean logeado = false;

    public beanLoginSesion() {
        user = new SesionTable();
        alumno = new Alumnos();
        maestro=new Maestro();
        encargada = new EncargadaClinica();
    }

    /**
     * @return the encargada
     */
    public EncargadaClinica getEncargada() {
        return encargada;
    }

    /**
     * @param encargada the encargada to set
     */
    public void setEncargada(EncargadaClinica encargada) {
        this.encargada = encargada;
    }
    
    /**
     * @return the alumno
     */
    public Alumnos getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    
    /**
     * @return the maestro
     */
    public Maestro getMaestro() {
        return maestro;
    }

    /**
     * @param maestro the maestro to set
     */
    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }
    
    public boolean estaLogeado() {
        return logeado;
    }

    /**
     * @return the usuario
     */
    public SesionTable getUsuario() {
        return user;
    }
    

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(SesionTable usuario) {
        this.user = usuario;
    }

    public void insertarFarmacia(){
        daoLoginSesion daoSesion = new LoginSesionImp();
        boolean existe=daoSesion.consultarFarmacia(encargada, user);
        if(existe){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Felicidades!", "Ha sido registrado en el sistema de manera exitosa."));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "¡¡Error!!", "Lo sentimos, no ha sido dado de alta en el sistema.\nVerifique con los administradores."));
        }
    }
    
    public void insertarDocente(){
        daoLoginSesion daoSesion = new LoginSesionImp();
        boolean existe=daoSesion.consultarDocente(maestro,user);
        if(existe){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Felicidades!", "Ha sido registrado en el sistema de manera exitosa."));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "¡¡Error!!", "Lo sentimos, no ha sido dado de alta en el sistema.\nVerifique con los administradores."));
        }
    }
    
    public void loguinAlumno(ActionEvent action) throws IOException{
        daoLoginSesion daoSesion = new LoginSesionImp();
        boolean existeAlumno = daoSesion.consultarAlumno(alumno);
        if (existeAlumno){
            logeado = true;
            responseAndRequestAlumno("/FdO-3.0/pages/Alumnos/Principal.xhtml","tokenAlumno");
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "Lo sentimos, no aparece en el sistema"));
        }
    }
    
    public void login(ActionEvent actionEvent) throws IOException {
        daoLoginSesion daoSesion = new LoginSesionImp();
        int tipoUsuario = daoSesion.consultarUsuario(user);
        if (tipoUsuario == 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "Lo sentimos, no aparece en el sistema"));
        } else if (tipoUsuario == 1) {
            logeado = true;
            responseAndRequest("/FdO-3.0/pages/Coordinadora/Principal.xhtml","tokenCoordinacion");
        } else if (tipoUsuario == 2){
            logeado = true;
            responseAndRequest("/FdO-3.0/pages/Maestro/Principal.xhtml","tokenDocente");
        }else if (tipoUsuario == 3){
            logeado = true;
            responseAndRequest("/FdO-3.0/pages/EncargadaDeFarmacia/Principal.xhtml","tokenFarmacia");
        }

//    if (logeado)
//      context.addCallbackParam("view", "Coordinadora/Principal.xhtml");
    }
    
    public void logoutCoordinacion(ActionEvent actionEvent) throws IOException {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.removeAttribute("tokenCoordinacion");
        logeado = false;
        String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
        FacesContext.getCurrentInstance().getExternalContext().redirect("/FdO-3.0/pages/Login.xhtml");  
    }

    public void logoutFarmacia(ActionEvent actionEvent) throws IOException {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.removeAttribute("tokenFarmacia");
        logeado = false;
        String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
        FacesContext.getCurrentInstance().getExternalContext().redirect("/FdO-3.0/pages/Login.xhtml");  
    }
    
    public void logoutDocente(ActionEvent actionEvent) throws IOException {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.removeAttribute("tokenDocente");
        logeado = false;
        String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
        FacesContext.getCurrentInstance().getExternalContext().redirect("/FdO-3.0/pages/Login.xhtml");  
    }
    public void logoutAlumno(ActionEvent actionEvent) throws IOException {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.removeAttribute("tokenAlumno");
        logeado = false;
        String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
        FacesContext.getCurrentInstance().getExternalContext().redirect("/FdO-3.0/pages/LoginAlumno.xhtml");  
    }
    
    private void responseAndRequest(String ruta,String tokenName) throws IOException {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession();
        session.setAttribute(tokenName, user.getUser());
        System.out.println("El usuario del token es: " + user.getUser());
        HttpServletResponse sResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        sResponse.sendRedirect(ruta);
    }
    
    private void responseAndRequestAlumno(String ruta,String tokenName) throws IOException {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession();
        session.setAttribute(tokenName, alumno.getUsuario());
        System.out.println("El usuario del token es: " + alumno.getUsuario());
        HttpServletResponse sResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        sResponse.sendRedirect(ruta);
    }
    
    public void editarPerfil(){
        
    }

}
