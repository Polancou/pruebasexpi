/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RamsesMtnz
 */
@Entity
@Table(name = "sesionAlumnos")
public class SesionAlumnos {
    
    private int idSesion;
    private String user;
    private String contraseña;
    
    public SesionAlumnos(){
        
    }
    
    public SesionAlumnos(int id, String user, String pass){
        this.contraseña=pass;
        this.idSesion=id;
        this.user=user;
    }
    
    public SesionAlumnos(String user, String pass){
        this.contraseña=pass;
        this.user=user;
    }

    /**
     * @return the idSesion
     */
    @Id
    @Column(name = "id_sesion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdSesion() {
        return idSesion;
    }

    /**
     * @param idSesion the idSesion to set
     */
    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    /**
     * @return the contraseña
     */
    @Column(name = "contraseña")
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the user
     */
    @Column(name = "usuario")
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
}
