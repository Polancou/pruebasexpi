/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import sys.dao.ejemploInterface;
import sys.imp.ejemploImplementacion;
import sys.model.SesionTable;

//bean de donde se conecta la vista (controlador)
@Named(value = "ejemplo")
@ViewScoped
public class beanEjemplo implements Serializable {
    
    private SesionTable user;

    //constructor inicializando la tabla usuario
    public beanEjemplo() {
        user = new SesionTable();
    }
    
    //parte de setter y getters de las variables o tablas que se deseen
    public SesionTable getUser() {
        return user;
    }
    public void setUser(SesionTable user) {
        this.user = user;
    }
    
    //metodo que usa la vista para realizar cualquier cosa
    public void metodoEjemplo(){
        ejemploInterface interfaceEj = new ejemploImplementacion();
        boolean respuestaDelEjemplo = interfaceEj.ejemplo(user);
    }
    
}
