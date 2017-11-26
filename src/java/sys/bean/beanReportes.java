/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author RamsesMtnz
 */
@ManagedBean
@RequestScoped
public class beanReportes implements Serializable {

    String myDatePattern1 = "yyyy-MM-dd";
    SimpleDateFormat df = new SimpleDateFormat(myDatePattern1);

    /**
     * @return the clinica
     */
    public String getClinica() {
        return clinica;
    }

    /**
     * @param clinica the clinica to set
     */
    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    /**
     * @return the fecha1
     */
    public Date getFecha1() {
        return fecha1;
    }

    /**
     * @param fecha1 the fecha1 to set
     */
    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    /**
     * @return the fecha2
     */
    public Date getFecha2() {
        return fecha2;
    }

    /**
     * @param fecha2 the fecha2 to set
     */
    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    private String clinica;
    private Date fecha1;
    private Date fecha2;

    public void reporteGeneral() throws SQLException, IOException, JRException {
        exportarPDF("/resources/ReportesPDF/generalNew.jasper", "Reporte_Gral_Todas_Las_Clinicas_Desde_La_Implementacion", null);
    }

    public void reportePorClinica() throws SQLException, IOException, JRException {
        System.out.print("+++++");
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("clinica", clinica);
        System.out.print("+++++" + clinica);
        exportarPDF("/resources/ReportesPDF/soloClinica.jasper", "Reporte_De_La_Clinica_" + clinica + "_Desde_La_Implementacion", parametros);
    }

    public void reporteClinicasPorFechas() throws IOException, SQLException, JRException {
        System.out.print("+++++");
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("fecha1", df.format(fecha1));
        parametros.put("fecha2", df.format(fecha2));
        System.out.print("+++++ " + df.format(fecha1) + " +++++ " + df.format(fecha2));
        exportarPDF("/resources/ReportesPDF/fechas.jasper", "Reporte_De_Todas_Las_Clinicas_Desde_El_+" + fecha1 + "_Hasta_El_" + fecha2, parametros);
    }

    public void reportePorClinicaPorFechas() throws SQLException, IOException, JRException {
        System.out.print("+++++");
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("clinica", clinica);
        parametros.put("fecha1", df.format(fecha1));
        parametros.put("fecha2", df.format(fecha2));
        System.out.print("+++++ " + fecha1 + " +++++ " + fecha2 + " ++++++ " + clinica);
        exportarPDF("/resources/ReportesPDF/porClinica.jasper", "Reporte_De_La_Clinica_" + clinica + "_Desde_La_Implementacion", parametros);
    }

    public void alumnosDestacados() throws SQLException, IOException, JRException {
//        Map <String,Object> parametros = new HashMap<String, Object>();
//        parametros.put("clinica", clinica);
//        parametros.put("fecha1", fecha1);
//        parametros.put("fecha2", fecha2);
//        System.out.print("+++++ "+fecha1+" +++++ "+fecha2+" ++++++ "+clinica);
//        exportarPDF("/resources/ReportesPDF/alumno.jasper","Reporte_De_La_Clinica_"+clinica+"_Desde_La_Implementacion",  parametros);        
    }

    public void ejemplo() {
        System.out.print("que pedo si entra....");
    }

    public void exportarPDF(String rutaArchivo, String nombreArchivo, Map parametros) throws SQLException, IOException, JRException {
        //Map <String,Object> parametros = new HashMap<String, Object>();
        //parametros.put("", "");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/facultad_odontologia", "root", "root");
        File jasperReport = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath(rutaArchivo));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport.getPath(), parametros, connection);
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.addHeader("Content-disposition", "attachment; filename=" + nombreArchivo + ".pdf");
        ServletOutputStream stream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
        stream.flush();
        stream.close();
        FacesContext.getCurrentInstance().responseComplete();
    }

}
