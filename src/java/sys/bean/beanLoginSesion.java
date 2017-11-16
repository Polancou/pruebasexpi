/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;
import sys.dao.daoLoginSesion;
import sys.imp.LoginSesionImp;
import sys.model.SesionAlumnos;
import sys.model.SesionTable;

/**
 *
 * @author RamsesMtnz
 */
@Named(value = "LoginMB")
@ViewScoped
public class beanLoginSesion implements Serializable {

    private SesionTable user;
    private SesionAlumnos usuarioAlumno;
    private String usuarioName;
    private List<SesionTable> usuarios;
    private boolean logeado = false;
    private String userName;

    public beanLoginSesion() {
        user = new SesionTable();
        usuarioAlumno = new SesionAlumnos();
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
     * @return the usuarioAlumno
     */
    public SesionAlumnos getUsuarioAlumno() {
        return usuarioAlumno;
    }

    /**
     * @param usuarioAlumno the usuarioAlumno to set
     */
    public void setUsuarioAlumno(SesionAlumnos usuarioAlumno) {
        this.usuarioAlumno = usuarioAlumno;
    }
    

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(SesionTable usuario) {
        this.user = usuario;
    }
//
//    public void usuariosVer() {
//        daoLoginSesion daoSesion = new LoginSesionImp();
//        daoSesion.consultarUsuario(usuario);
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "lkasd", "Ha accedido de manera satisfactoria"));
//    }

    public void loguinAlumno(ActionEvent action) throws IOException{
        daoLoginSesion daoSesion = new LoginSesionImp();
        boolean existeAlumno = daoSesion.consultarAlumno(usuarioAlumno);
        if (existeAlumno){
            logeado = true;
            responseAndRequestAlumno("/FdO-3.0/pages/Alumnos/Principal.xhtml","tokenAlumno");
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "Lo sentimos, no aparece en el sistema"));
        }
    }
    
    public void login(ActionEvent actionEvent) throws IOException {
        RequestContext context = RequestContext.getCurrentInstance();
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
        System.out.println("El usuario del token es: " + user.getUser().toString());
        HttpServletResponse sResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        sResponse.sendRedirect(ruta);
    }
    
    private void responseAndRequestAlumno(String ruta,String tokenName) throws IOException {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession();
        session.setAttribute(tokenName, usuarioAlumno.getUser());
        System.out.println("El usuario del token es: " + usuarioAlumno.getUser().toString());
        HttpServletResponse sResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        sResponse.sendRedirect(ruta);
    }

}
