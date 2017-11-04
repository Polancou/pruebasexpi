/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.InputStream;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author RamsesMtnz
 */
@Named(value = "beanReportes")
@ViewScoped
public class beanReportes implements Serializable {

    private StreamedContent file;

    public StreamedContent getFile() {
        return file;
    }

    public void reporteGeneral() {
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("./../resources/images/BITA.png");
        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_bita.png");
        System.out.print("Entra a metodo reporte general");
    }

}
