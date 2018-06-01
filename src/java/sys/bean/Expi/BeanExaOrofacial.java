/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean.Expi;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import net.sf.jasperreports.engine.JRException;
import sys.bean.Bita.beanReportes;
import sys.dao.daoNuevoPaciente;
import sys.imp.NuevoPacienteImp;
import sys.model.pacientes.AnalisisOclusion;
import sys.model.pacientes.Atm;
import sys.model.pacientes.ExamenOral;
import sys.model.pacientes.ExamenOrofacial;
import sys.model.pacientes.HallazgosRadiograficos;

/**
 *
 * @author Ramses Mtnz Santiago
 */
@Named(value = "ExamenOrofacial")
@ViewScoped
public class BeanExaOrofacial implements Serializable {

    
    public static ExamenOral examenOral;
    public static String[] habitosTensionList;
    public static Atm atm; 
    public static AnalisisOclusion analisisOclusion;
    public static HallazgosRadiograficos hallazgosRadiograficos;
    public static ExamenOrofacial examenOrofacial;

    @PostConstruct
    protected void init() {
        examenOrofacial.setCaraForma("Ovoide");
        examenOrofacial.setCaraLabios("Activos");
        examenOrofacial.setBordesBermellon("Visibles");
        atm.setCrepitacion("Si");
        atm.setSensibilidad("Si");
        atm.setDolor("Si");
        atm.setSubluxacion("Si");
        atm.setDesviacion("Si");
        atm.setHabitos_tension("Si");
        atm.setTamano_lengua("Normal");
        atm.setTorus_maxilar("Ninguno");
        atm.setTorus_mandibular("Ninguno");
        analisisOclusion.setClasificacion("I");
        analisisOclusion.setProteccionCanina("Izquierda");
        analisisOclusion.setProteccionAnterior("Si");
        analisisOclusion.setFuncionGrupo("Izquierda");
        analisisOclusion.setProteccionMutua("Si");
        analisisOclusion.setMordidaCruzada("Izquierda");
        analisisOclusion.setMordidaAbierta("Si");
        analisisOclusion.setSobremordida("Si");
        analisisOclusion.setMandibular_protusivo("Normal");
        analisisOclusion.setMandibular_derecho("Normal");
        analisisOclusion.setMadibular_izquierdo("Normal");
        examenOral.setDolor("Si");
        examenOral.setDolor_ubicacion("Difuso");
        examenOral.setDolor_estimulo("Frio");
        examenOral.setLesion_pulpar("Frio");
        examenOral.setExposicion_pulpar("Caries");
        examenOral.setInflamacion("Extraoral");
        examenOral.setFrio_estado("Normal");
        examenOral.setCalor_estado("Normal");
        hallazgosRadiograficos.setTipo_rx("Periapical");        
    }
    
    public void guardar() throws SQLException, IOException, JRException {
       // atm.setHabitos_tension(Arrays.toString(habitosTensionList));
        System.out.println("Entra al metodo");
        daoNuevoPaciente daoNuevo = new NuevoPacienteImp();
        String namePaciente = daoNuevo.insertarNuevoPaciente();
                //examenOrofacial(atm, examenOral, analisisOclusion, hallazgosRadiograficos, examenOrofacial);
        beanReportes bean=new beanReportes();
        bean.consentimientoPDF(namePaciente);
    }

    public BeanExaOrofacial() {
        this.examenOral = new ExamenOral();
        this.atm = new Atm();
        this.analisisOclusion = new AnalisisOclusion();
        this.hallazgosRadiograficos = new HallazgosRadiograficos();
        this.examenOrofacial = new ExamenOrofacial();
    }

    public ExamenOral getExamenOral() {
        return examenOral;
    }

    public void setExamenOral(ExamenOral examenOral) {
        this.examenOral = examenOral;
    }

    public String[] getHabitosTensionList() {
        return habitosTensionList;
    }

    public void setHabitosTensionList(String[] habitosTensionList) {
        this.habitosTensionList = habitosTensionList;
    }

    public Atm getAtm() {
        return atm;
    }

    public void setAtm(Atm atm) {
        this.atm = atm;
    }

    public AnalisisOclusion getAnalisisOclusion() {
        return analisisOclusion;
    }

    public void setAnalisisOclusion(AnalisisOclusion analisisOclusion) {
        this.analisisOclusion = analisisOclusion;
    }

    public HallazgosRadiograficos getHallazgosRadiograficos() {
        return hallazgosRadiograficos;
    }

    public void setHallazgosRadiograficos(HallazgosRadiograficos hallazgosRadiograficos) {
        this.hallazgosRadiograficos = hallazgosRadiograficos;
    }

    public ExamenOrofacial getExamenOrofacial() {
        return examenOrofacial;
    }

    public void setExamenOrofacial(ExamenOrofacial examenOrofacial) {
        this.examenOrofacial = examenOrofacial;
    }
    
}
