/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.IOException;
import java.io.Serializable;
import javafx.event.ActionEvent;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sys.dao.daoAlumnos;
import sys.dao.daoLoginSesion;
import sys.imp.AlumnosImp;
import sys.imp.LoginSesionImp;
import sys.model.Alumnos;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named(value = "beanAlumnos")
@ViewScoped
public class beanAlumnos implements Serializable {

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

    public void cancelar() {
        alumnos = new Alumnos();
    }

    public void insertarAlumno() throws IOException {
        daoAlumnos adao = new AlumnosImp();
        int registro = adao.insertarAlumnos(alumnos);
        alumnos = new Alumnos();
        switch (registro) {
            case 0:
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "Error del Sistema o del servidor"));
                break;
            case 1:
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "¡Advertencia!", "El usuario ya se encuentra registrado."));
                break;
            case 2:
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "Ya se encuentra un alumno con la misma matricula registrado."));
                break;
            case 3:
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Felicidades!", "Bienvenido al portal de odontología."));
                //responseAndRequest("/FdO-3.0/pages/EncargadaDeFarmacia/Principal.xhtml", "tokenFarmacia");
                break;
            default:
                break;
        }
    }

    public void loguinAlumno(ActionEvent action) throws IOException {
        daoAlumnos daoSesion = new AlumnosImp();
        boolean existeAlumno = daoSesion.consultarAlumno(alumnos);
        if (existeAlumno) {
            responseAndRequestAlumno("/FdO-3.0/pages/Alumnos/Principal.xhtml", "tokenAlumno");
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "Lo sentimos, no aparece en el sistema"));
        }
    }
    
    public void logout(ActionEvent actionEvent) throws IOException {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.removeAttribute("tokenAlumno");
        String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
        FacesContext.getCurrentInstance().getExternalContext().redirect("/FdO-3.0/pages/LoginAlumno.xhtml");
    }

    private void responseAndRequestAlumno(String ruta, String tokenName) throws IOException {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession();
        session.setAttribute(tokenName, alumnos.getUsuario());
        System.out.println("El usuario del token es: " + alumnos.getUsuario());
        HttpServletResponse sResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        sResponse.sendRedirect(ruta);
    }

}
