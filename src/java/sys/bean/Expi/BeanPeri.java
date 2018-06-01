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
        String cadena= "svg/11-18/18.png,svg/11-18/17.png,svg/11-18/16.png,svg/11-18/15.png,svg/11-18/14.png,svg/11-18/13.png,svg/11-18/12.png,svg/11-18/11.png,svg/21-28/21.png,svg/21-28/22.png,svg/21-28/23.png,svg/21-28/24.png,svg/21-28/25.png,svg/21-28/26.png,svg/21-28/27.png,svg/21-28/28.png,svg/51-55/55.png,svg/51-55/54.png,svg/51-55/53.png,svg/51-55/52.png,svg/51-55/51.png,svg/61-65/61.png,svg/61-65/62.png,svg/61-65/63.png,svg/61-65/64.png,svg/61-65/65.png,svg/81-85/85.png,svg/81-85/84.png,svg/81-85/83.png,svg/81-85/82.png,svg/81-85/81.png,svg/71-75/71.png,svg/71-75/72.png,svg/71-75/73.png,svg/71-75/74.png,svg/71-75/75.png,svg/41-48/48.png,svg/41-48/47.png,svg/41-48/46.png,svg/41-48/45.png,svg/41-48/44.png,svg/41-48/43.png,svg/41-48/42.png,svg/41-48/41.png,svg/31-38/31.png,svg/31-38/32.png,svg/31-38/33.png,svg/31-38/34.png,svg/31-38/35.png,svg/31-38/36.png,svg/31-38/37.png,svg/31-38/38.png";
        String dienteperi = pruebaperi.getDiente();
        if (dienteperi == "0"){
            System.out.println("valor inicial:");
            pruebaperi.setDiente(cadena);
        }else{
            System.out.println("cargo los valores");
            pruebaperi.setDiente(dienteperi);
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
