/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author RamsesMtnz
 */
@ManagedBean
@RequestScoped
public class beanReportes implements Serializable {

    private StreamedContent file;
    private List<sys.model.Alumnos> alumnos=new ArrayList <sys.model.Alumnos>();
    private List<sys.model.AreaTratamientos> areaTratamientos = new ArrayList <sys.model.AreaTratamientos>();
    private List<sys.model.BitacoraRecibos> bitacora = new ArrayList <sys.model.BitacoraRecibos>();
    
    
    /**
     * @return the alumnos
     */
    public List<sys.model.Alumnos> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(List<sys.model.Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @return the areaTratamientos
     */
    public List<sys.model.AreaTratamientos> getAreaTratamientos() {
        return areaTratamientos;
    }

    /**
     * @param areaTratamientos the areaTratamientos to set
     */
    public void setAreaTratamientos(List<sys.model.AreaTratamientos> areaTratamientos) {
        this.areaTratamientos = areaTratamientos;
    }

    /**
     * @return the bitacora
     */
    public List<sys.model.BitacoraRecibos> getBitacora() {
        return bitacora;
    }

    /**
     * @param bitacora the bitacora to set
     */
    public void setBitacora(List<sys.model.BitacoraRecibos> bitacora) {
        this.bitacora = bitacora;
    }

    
    public StreamedContent getFile() {
        return file;
    }

    public beanReportes() {
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/images/fdo.png");
        file = new DefaultStreamedContent(stream, "image/png", "bita.png");
        System.out.print("Entra a metodo reporte general");
    }
    
    public void exportarPDF() throws SQLException, IOException, JRException {
        //Map <String,Object> parametros = new HashMap<String, Object>();
        //parametros.put("", "");
//      
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
//        
        ServletOutputStream servletOutputStream = response.getOutputStream();
		File reportFile = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/resources/ReportesPDF/generalNew.jasper"));
		
		byte[] bytes = null;
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/facultad_odontologia","root","root");
                
                try {
				 bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), null, connection);
				//beanEstatal.getModel().setBytesFormato(bytes);	
				 response.setContentType("application/pdf");
					response.setContentLength(bytes.length);
					servletOutputStream.write(bytes, 0, bytes.length);
					servletOutputStream.flush();
					servletOutputStream.close();
			}finally{
				connection.close();
			}	
    }

    public void exportarPDFClinica() throws SQLException, IOException, JRException {
//        Map <String,Object> parametros = new HashMap<String, Object>();
//        parametros.put("clinica", );
////      
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
//        
        ServletOutputStream servletOutputStream = response.getOutputStream();
		File reportFile = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/resources/ReportesPDF/generalNew.jasper"));
		
		byte[] bytes = null;
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/facultad_odontologia","root","root");
                
                try {
				 bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), null, connection);
				//beanEstatal.getModel().setBytesFormato(bytes);	
				 response.setContentType("application/pdf");
					response.setContentLength(bytes.length);
					servletOutputStream.write(bytes, 0, bytes.length);
					servletOutputStream.flush();
					servletOutputStream.close();
			}finally{
				connection.close();
			}	
    }
    
}
