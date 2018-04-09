/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import java.util.Date;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Ramses Mtnz Santiago
 */
@Named(value = "carpetaAzul")
@ViewScoped
public class beanDatosGenerales implements Serializable{
    
    private int folio;
    private int edad;
    private double estatura;
    private double peso;
    private String nombre,sexo,estadoCivil,nivelEstudios,edoSalud,pais,estado,ciudad,calle,colonia,ocupacion
            ,direccionOficina,nombreMedico,direccionMedico,causaSolicitaTratamiento,observaciones,telefono,
            telefonoOficina,telefonoMedico;
    private String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,
            p26,p27,p28,p29,p30,p31,p32;
    private Date fechaNacimiento;

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the telefonoOficina
     */
    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    /**
     * @param telefonoOficina the telefonoOficina to set
     */
    public void setTelefonoOficina(String telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    /**
     * @return the telefonoMedico
     */
    public String getTelefonoMedico() {
        return telefonoMedico;
    }

    /**
     * @param telefonoMedico the telefonoMedico to set
     */
    public void setTelefonoMedico(String telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the nivelEstudios
     */
    public String getNivelEstudios() {
        return nivelEstudios;
    }

    /**
     * @param nivelEstudios the nivelEstudios to set
     */
    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    /**
     * @return the edoSalud
     */
    public String getEdoSalud() {
        return edoSalud;
    }

    /**
     * @param edoSalud the edoSalud to set
     */
    public void setEdoSalud(String edoSalud) {
        this.edoSalud = edoSalud;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return the direccionOficina
     */
    public String getDireccionOficina() {
        return direccionOficina;
    }

    /**
     * @param direccionOficina the direccionOficina to set
     */
    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    /**
     * @return the nombreMedico
     */
    public String getNombreMedico() {
        return nombreMedico;
    }

    /**
     * @param nombreMedico the nombreMedico to set
     */
    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    /**
     * @return the direccionMedico
     */
    public String getDireccionMedico() {
        return direccionMedico;
    }

    /**
     * @param direccionMedico the direccionMedico to set
     */
    public void setDireccionMedico(String direccionMedico) {
        this.direccionMedico = direccionMedico;
    }

    /**
     * @return the causaSolicitaTratamiento
     */
    public String getCausaSolicitaTratamiento() {
        return causaSolicitaTratamiento;
    }

    /**
     * @param causaSolicitaTratamiento the causaSolicitaTratamiento to set
     */
    public void setCausaSolicitaTratamiento(String causaSolicitaTratamiento) {
        this.causaSolicitaTratamiento = causaSolicitaTratamiento;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
