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
@Table(name = "usuarios")
public class SesionTable {

    private int idEmpleado;
    private String tipo;
    private String usuario;
    private String contraseña;
    
    public SesionTable(){
        
    }

    public SesionTable(String tipo, String usuario,String contraseña, int id){
        this.contraseña=contraseña;
        this.idEmpleado=id;
        this.tipo=tipo;
        this.usuario=usuario;
    }
    
    public SesionTable(String usuario, String contraseña, String tipo){
        this.usuario=usuario;
        this.tipo=tipo;
        this.contraseña=contraseña;
    }
    
    /**
     * @return the idEmpleado
     */
    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the tipo
     */
    @Column(name = "tipo")
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the usuario
     */
    @Column(name = "usuario")
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

}
