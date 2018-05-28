/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean.Expi;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
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

    
    private ExamenOral examenOral;
    private String[] habitosTensionList;
    private Atm atm; 
    private AnalisisOclusion analisisOclusion;
    private HallazgosRadiograficos hallazgosRadiograficos;
    private ExamenOrofacial examenOrofacial;
    private List<String> listaHabitosTension;

    @PostConstruct
    protected void initialize() {
        atm.setCrepitacion("Si");
        atm.setSensibilidad("Si");
        atm.setDolor("Si");
        atm.setSubluxacion("Si");
        analisisOclusion.setClasificacion("I");
        analisisOclusion.setProteccionCanina("Izquierda");
        analisisOclusion.setProteccionAnterior("Si");
        analisisOclusion.setFuncionGrupo("Izquierda");
        analisisOclusion.setMordidaCruzada("Izquierda");
        analisisOclusion.setMordidaAbierta("Si");
        analisisOclusion.setSobremordida("Si");
        analisisOclusion.setProteccionMutua("Si");
        examenOral.setInflamacion("Extraoral");

        
    }
    
    public void guardar() {
        atm.setHabitos_tension(Arrays.toString(habitosTensionList));
        System.out.println("Entra al metodo");
        daoNuevoPaciente daoNuevo = new NuevoPacienteImp();
        boolean guardó = daoNuevo.examenOrofacial();
        if (guardó) {
            System.out.println("Guardó datos");
        } else {
            System.out.println("Pura madre");
        }
    }

    public BeanExaOrofacial(ExamenOral examenOral, String[] habitosTensionList, Atm atm, AnalisisOclusion analisisOclusion, HallazgosRadiograficos hallazgosRadiograficos, ExamenOrofacial examenOrofacial, List<String> listaHabitosTension) {
        this.examenOral = examenOral;
        this.habitosTensionList = habitosTensionList;
        this.atm = atm;
        this.analisisOclusion = analisisOclusion;
        this.hallazgosRadiograficos = hallazgosRadiograficos;
        this.examenOrofacial = examenOrofacial;
        this.listaHabitosTension = listaHabitosTension;
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

    public List<String> getListaHabitosTension() {
        return listaHabitosTension;
    }

    public void setListaHabitosTension(List<String> listaHabitosTension) {
        this.listaHabitosTension = listaHabitosTension;
    }

    
    
}
