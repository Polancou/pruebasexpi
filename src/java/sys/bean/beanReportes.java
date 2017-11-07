/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.InputStream;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author RamsesMtnz
 */
@ManagedBean
public class beanReportes implements Serializable {

    private StreamedContent file;

    public StreamedContent getFile() {
        return file;
    }

    public beanReportes() {
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("./../resources/images/fdo.ng");
        file = new DefaultStreamedContent(stream, "image/png", "bita.png");
        System.out.print("Entra a metodo reporte general");
    }

}
