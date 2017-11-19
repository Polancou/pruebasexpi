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
import sys.dao.daoBitacora;
import sys.imp.BitacoraImp;
import sys.model.BitacoraRecibos;
import sys.model.MaestroMaterias;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named(value = "beanBitacora")
@ViewScoped
public class beanBitacora implements Serializable{

    /**
     * Creates a new instance of beanBitacora
     */
    private BitacoraRecibos bitacora;
    private List<BitacoraRecibos> bita;
    private List<BitacoraRecibos> bitaM;
    private MaestroMaterias mmaterias;
    
    public beanBitacora() {
        bitacora = new BitacoraRecibos();
        mmaterias = new MaestroMaterias();
    }

    public BitacoraRecibos getBitacora() {
        return bitacora;
    }

    public void setBitacora(BitacoraRecibos bitacora) {
        this.bitacora = bitacora;
    }

    public List<BitacoraRecibos> getBita() {
        return bita;
    }

    public void setBita(List<BitacoraRecibos> bita) {
        this.bita = bita;
    }

    public MaestroMaterias getMmaterias() {
        return mmaterias;
    }

    public void setMmaterias(MaestroMaterias mmaterias) {
        this.mmaterias = mmaterias;
    }

    public List<BitacoraRecibos> getBitaM() {
        return bitaM;
    }

    public void setBitaM(List<BitacoraRecibos> bitaM) {
        this.bitaM = bitaM;
    }
    
       public void verTratamientosClase(){
        daoBitacora bdao = new BitacoraImp();
        bitaM = bdao.mostrarTratamientosPorMaestros(mmaterias);
    }
    
    
    public void verTratamientos(){
        daoBitacora bdao = new BitacoraImp();
        bita = bdao.mostratTratamientosPorAlumno(mmaterias);
    }
    
    
}
