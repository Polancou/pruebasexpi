/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean.Expi;

import sys.model.pacientes.TestPeri;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sys.model.pacientes.Periodontograma;
/**
 *
 * @author polancou
 */
@Named(value = "beanPeri")
@ViewScoped
public class BeanPeri implements Serializable  {
    private String dienteimg;
    public static TestPeri pruebaperi = new TestPeri();
    public static Periodontograma periodonto;
    
    /**
     * Creates a new instance of BeanPeri
     */
    @PostConstruct
    public void init(){
        String cadena = "svg/dientes/18.png,svg/dientes/17.png,svg/dientes/16.png,svg/dientes/15.png,svg/dientes/14.png,svg/dientes/13.png,svg/dientes/12.png,svg/dientes/11.png,svg/dientes/21.png,svg/dientes/22.png,svg/dientes/23.png,svg/dientes/24.png,svg/dientes/25.png,svg/dientes/26.png,svg/dientes/27.png,svg/dientes/28.png,svg/dientes/55.png,svg/dientes/54.png,svg/dientes/53.png,svg/dientes/52.png,svg/dientes/51.png,svg/dientes/61.png,svg/dientes/62.png,svg/dientes/63.png,svg/dientes/64.png,svg/dientes/65.png,svg/dientes/85.png,svg/dientes/84.png,svg/dientes/83.png,svg/dientes/82.png,svg/dientes/81.png,svg/dientes/71.png,svg/dientes/72.png,svg/dientes/73.png,svg/dientes/74.png,svg/dientes/75.png,svg/dientes/48.png,svg/dientes/47.png,svg/dientes/46.png,svg/dientes/45.png,svg/dientes/44.png,svg/dientes/43.png,svg/dientes/42.png,svg/dientes/41.png,svg/dientes/31.png,svg/dientes/32.png,svg/dientes/33.png,svg/dientes/34.png,svg/dientes/35.png,svg/dientes/36.png,svg/dientes/37.png,svg/dientes/38.png";
        String dienteperi = pruebaperi.getDiente();
        if (dienteperi != "0"){
            System.out.println("cargo los valores");
            pruebaperi.setDiente(dienteperi);
            
        }else{
            System.out.println("valor inicial:");
            pruebaperi.setDiente(cadena);
        } 
    }
    
    public BeanPeri() {
        periodonto=new Periodontograma();
    }
    
    public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "El Odontograma se guardó con éxito da click en siguiente para continuar", "")); 
    }
    
    public void Obtienetodo(){
        String nuevotexto = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nuevotexto");
        pruebaperi.setDiente(nuevotexto);
    }

    /**
     * @return the dienteimg
     */
    public String getDienteimg() {
        dienteimg = pruebaperi.getDiente();
        return dienteimg;
    }

    /**
     * @param dienteimg the dienteimg to set
     */
    public void setDienteimg(String dienteimg) {
        this.dienteimg = dienteimg;
    }

    /**
     * @return the pruebaperi
     */
    public TestPeri getPruebaperi() {
        return pruebaperi;
    }

    /**
     * @param pruebaperi the pruebaperi to set
     */
    public void setPruebaperi(TestPeri pruebaperi) {
        this.pruebaperi = pruebaperi;
    }
    
}
