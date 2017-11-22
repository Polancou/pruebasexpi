/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import sys.dao.daoAreaTratamientos;
import sys.dao.daoBitacora;
import sys.imp.BitacoraImp;
import sys.imp.TratamientosImp;
import sys.model.AreaTratamientos;
import sys.model.BitacoraRecibos;
import sys.model.MenuTratamientos;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named(value = "beanTratamiento")
@ViewScoped
public class beanTratamiento implements Serializable {

    /**
     * Creates a new instance of beanTratamiento
     */
    private AreaTratamientos area;
    private MenuTratamientos menu;
    private BitacoraRecibos bitacora;

    private List<SelectItem> listArea;
    private List<SelectItem> listMenu;
    private List<BitacoraRecibos> bita;

    public beanTratamiento() {
        area = new AreaTratamientos();
        menu = new MenuTratamientos();
        bitacora = new BitacoraRecibos();
        bita = new ArrayList<BitacoraRecibos>();
    }

    public AreaTratamientos getArea() {
        return area;
    }

    public void setArea(AreaTratamientos area) {
        this.area = area;
    }

    public MenuTratamientos getMenu() {
        return menu;
    }

    public void setMenu(MenuTratamientos menu) {
        this.menu = menu;
    }

    public List<BitacoraRecibos> getBita() {
        return bita;
    }

    public BitacoraRecibos getBitacora() {
        return bitacora;
    }

    public void setBitacora(BitacoraRecibos bitacora) {
        this.bitacora = bitacora;
    }

    public void insertarTratamientos() {
        daoAreaTratamientos adao = new TratamientosImp();
        boolean inserto=adao.insertarTratamiento(area);
        area = new AreaTratamientos();
        if(inserto){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se ha ingresado satisfactoriamente"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "El registro no se puede guardar en este momento. Intente más tarde o contacte a soporte técnico."));
        }
    }

    public void insertarMenuTratamientos() {
        daoAreaTratamientos adao = new TratamientosImp();
        boolean insertoMenu=adao.insertarMenuTratamientos(menu);
        menu = new MenuTratamientos();
        if(insertoMenu){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se ha ingresado satisfactoriamente"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "El registro no se puede guardar en este momento. Intente más tarde o contacte a soporte técnico."));
        }
    }

    public String reinit() {
        bitacora = new BitacoraRecibos();

        return null;
    }
    
    public void createNew(){
        bita.add(bitacora);
        bitacora = new BitacoraRecibos();
    }

    public List<SelectItem> getListArea() {
        this.listArea = new ArrayList<SelectItem>();
        daoAreaTratamientos mdao = new TratamientosImp();
        List<AreaTratamientos> m = mdao.mostrarAreaTratamientos();
        listArea.clear();
        for (AreaTratamientos g : m) {
            SelectItem gradoItem = new SelectItem(g.getArea(), g.getTratamiento());
            this.listArea.add(gradoItem);
        }
        return listArea;
    }

    public List<SelectItem> getListMenu() {
        this.listMenu = new ArrayList<SelectItem>();
        daoAreaTratamientos mdao = new TratamientosImp();
        List<MenuTratamientos> m = mdao.mostrarMenuTratamientos(this.bitacora);
        listMenu.clear();
        for (MenuTratamientos menu : m) {
            SelectItem materiaItem = new SelectItem(menu.getContador(), menu.getNameTratamiento());
            this.listMenu.add(materiaItem);
        }
        return listMenu;
    }
    
     public void insertarBitacora(){
        daoBitacora bdao = new BitacoraImp();
        boolean insertoBita=bdao.insertarTratamiento(bitacora);
        bitacora = new BitacoraRecibos();
       if(insertoBita){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se ha ingresado satisfactoriamente"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "El registro no se puede guardar en este momento. Intente más tarde o contacte a soporte técnico."));
       }
    }

}
