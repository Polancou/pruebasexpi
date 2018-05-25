/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean.Expi;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import sys.model.pacientes.AnalisisOclusion;
import sys.model.pacientes.Atm;
import sys.model.pacientes.Cara;
import sys.model.pacientes.Desviacion;
import sys.model.pacientes.Dolor;
import sys.model.pacientes.ExamenOral;
import sys.model.pacientes.ExamenOrofacial;
import sys.model.pacientes.FormaResidual;
import sys.model.pacientes.HabitosTension;
import sys.model.pacientes.HallazgosRadiograficos;
import sys.model.pacientes.MovimientoMandibular;
import sys.model.pacientes.PruebaPercusion;
import sys.model.pacientes.PruebasCalor;
import sys.model.pacientes.PruebasFrio;
import sys.model.pacientes.PruebasTermicas;
import sys.model.pacientes.RelacionIncisal;
import sys.model.pacientes.ResidualMandibular;
import sys.model.pacientes.SistemaEstomatognatico;
import sys.model.pacientes.Torus;

/**
 *
 * @author Ramses Mtnz Santiago
 */
@Named(value = "ExamenOrofacial")
@ViewScoped
public class BeanExaOrofacial implements Serializable {

    private PruebasFrio pruebasFrio;
    private PruebasCalor pruebasCalor;
    private PruebasTermicas pruebasTermicas;
    private PruebaPercusion pruebaPercusion;
    private Dolor dolor;
    private ExamenOral examenOral;
    private ResidualMandibular residualMandibular;
    private FormaResidual formaResidual;
    private Torus torus;
    private Desviacion desciacion;
    private HabitosTension habitosTension;
    private String[] habitosTensionList;
    private Atm atm;
    private MovimientoMandibular movimientoMandibular;
    private ResidualMandibular respiracionMandibular;
    private RelacionIncisal relacionIncisal;
    private AnalisisOclusion analisisOclusion;
    private HallazgosRadiograficos hallazgosRadiograficos;
    private SistemaEstomatognatico sistemaEstomatognatico;
    private Cara cara;
    private ExamenOrofacial examenOrofacial;
    private List<String> listaHabitosTension;

    @PostConstruct
    protected void initialize() {
        cara.setForma("Ovoide");
        cara.setLabios("Activos");
        cara.setBordesBermellon("Visibles");
        atm.setCrepitacion("Si");
        atm.setSensibilidad("Si");
        atm.setDolor("Si");
        atm.setSubluxacion("Si");
        desciacion.setDesviacion("Si");
        habitosTension.setHabitosTension("Si");
        atm.setTamanoLengua("Normal");
        torus.setMadibula("Ninguno");
        torus.setMaxilar("Ninguno");
        analisisOclusion.setClasificacion("I");
        analisisOclusion.setProteccionCanina("Izquierda");
        analisisOclusion.setProteccionAnterior("Si");
        analisisOclusion.setFuncionGrupo("Izquierda");
        analisisOclusion.setMordidaCruzada("Izquierda");
        analisisOclusion.setMordidaAbierta("Si");
        analisisOclusion.setSobremordida("Si");
        analisisOclusion.setProteccionMutua("Si");
        movimientoMandibular.setProtusivo("Normal");
        movimientoMandibular.setIzquierdo("Normal");
        movimientoMandibular.setDerecho("Normal");
        dolor.setSiNo("Si");
        dolor.setUbicacion("Difuso");
        dolor.setEstimulo("Frio");
        examenOral.setLesionPulpar("Fisica");
        examenOral.setExposicionPulpar("Caries");
        examenOral.setInflamacion("Extraoral");
        pruebasFrio.setNormal("Normal");
        pruebasCalor.setNormal("Normal");
        
        hallazgosRadiograficos.setTipoRx("Periapical");
        
        
    }

    public BeanExaOrofacial() {
        torus = new Torus();
        pruebasCalor = new PruebasCalor();
        analisisOclusion = new AnalisisOclusion();
        atm = new Atm();
        cara = new Cara();
        desciacion = new Desviacion();
        dolor = new Dolor();
        examenOral = new ExamenOral();
        examenOrofacial = new ExamenOrofacial();
        formaResidual = new FormaResidual();
        habitosTension = new HabitosTension();
        hallazgosRadiograficos = new HallazgosRadiograficos();
        movimientoMandibular = new MovimientoMandibular();
        pruebaPercusion = new PruebaPercusion();
        pruebasCalor = new PruebasCalor();
        pruebasFrio = new PruebasFrio();
        pruebasTermicas = new PruebasTermicas();
        relacionIncisal = new RelacionIncisal();
        residualMandibular = new ResidualMandibular();
        respiracionMandibular = new ResidualMandibular();
        sistemaEstomatognatico = new SistemaEstomatognatico();
    }

    public BeanExaOrofacial(PruebasFrio pruebasFrio, PruebasCalor pruebasCalor, PruebasTermicas pruebasTermicas, PruebaPercusion pruebaPercusion, Dolor dolor, ExamenOral examenOral, ResidualMandibular residualMandibular, FormaResidual formaResidual, Torus torus, Desviacion desciacion, HabitosTension habitosTension, Atm atm, MovimientoMandibular movimientoMandibular, ResidualMandibular respiracionMandibular, RelacionIncisal relacionIncisal, AnalisisOclusion analisisOclusion, HallazgosRadiograficos hallazgosRadiograficos, SistemaEstomatognatico sistemaEstomatognatico, Cara cara, ExamenOrofacial examenOrofacial, List<String> listaHabitosTension) {
        this.pruebasFrio = pruebasFrio;
        this.pruebasCalor = pruebasCalor;
        this.pruebasTermicas = pruebasTermicas;
        this.pruebaPercusion = pruebaPercusion;
        this.dolor = dolor;
        this.examenOral = examenOral;
        this.residualMandibular = residualMandibular;
        this.formaResidual = formaResidual;
        this.torus = torus;
        this.desciacion = desciacion;
        this.habitosTension = habitosTension;
        this.atm = atm;
        this.movimientoMandibular = movimientoMandibular;
        this.respiracionMandibular = respiracionMandibular;
        this.relacionIncisal = relacionIncisal;
        this.analisisOclusion = analisisOclusion;
        this.hallazgosRadiograficos = hallazgosRadiograficos;
        this.sistemaEstomatognatico = sistemaEstomatognatico;
        this.cara = cara;
        this.examenOrofacial = examenOrofacial;
        this.listaHabitosTension = listaHabitosTension;
    }

    public List<String> getListaHabitosTension() {
        return listaHabitosTension;
    }

    public void setListaHabitosTension(List<String> listaHabitosTension) {
        this.listaHabitosTension = listaHabitosTension;
    }

    public String[] getHabitosTensionList() {
        return habitosTensionList;
    }

    public void setHabitosTensionList(String[] habitosTensionList) {
        this.habitosTensionList = habitosTensionList;
    }

    public PruebasFrio getPruebasFrio() {
        return pruebasFrio;
    }

    public void setPruebasFrio(PruebasFrio pruebasFrio) {
        this.pruebasFrio = pruebasFrio;
    }

    public PruebasCalor getPruebasCalor() {
        return pruebasCalor;
    }

    public void setPruebasCalor(PruebasCalor pruebasCalor) {
        this.pruebasCalor = pruebasCalor;
    }

    public PruebasTermicas getPruebasTermicas() {
        return pruebasTermicas;
    }

    public void setPruebasTermicas(PruebasTermicas pruebasTermicas) {
        this.pruebasTermicas = pruebasTermicas;
    }

    public PruebaPercusion getPruebaPercusion() {
        return pruebaPercusion;
    }

    public void setPruebaPercusion(PruebaPercusion pruebaPercusion) {
        this.pruebaPercusion = pruebaPercusion;
    }

    public Dolor getDolor() {
        return dolor;
    }

    public void setDolor(Dolor dolor) {
        this.dolor = dolor;
    }

    public ExamenOral getExamenOral() {
        return examenOral;
    }

    public void setExamenOral(ExamenOral examenOral) {
        this.examenOral = examenOral;
    }

    public ResidualMandibular getResidualMandibular() {
        return residualMandibular;
    }

    public void setResidualMandibular(ResidualMandibular residualMandibular) {
        this.residualMandibular = residualMandibular;
    }

    public FormaResidual getFormaResidual() {
        return formaResidual;
    }

    public void setFormaResidual(FormaResidual formaResidual) {
        this.formaResidual = formaResidual;
    }

    public Torus getTorus() {
        return torus;
    }

    public void setTorus(Torus torus) {
        this.torus = torus;
    }

    public Desviacion getDesciacion() {
        return desciacion;
    }

    public void setDesciacion(Desviacion desciacion) {
        this.desciacion = desciacion;
    }

    public HabitosTension getHabitosTension() {
        return habitosTension;
    }

    public void setHabitosTension(HabitosTension habitosTension) {
        this.habitosTension = habitosTension;
    }

    public Atm getAtm() {
        return atm;
    }

    public void setAtm(Atm atm) {
        this.atm = atm;
    }

    public MovimientoMandibular getMovimientoMandibular() {
        return movimientoMandibular;
    }

    public void setMovimientoMandibular(MovimientoMandibular movimientoMandibular) {
        this.movimientoMandibular = movimientoMandibular;
    }

    public ResidualMandibular getRespiracionMandibular() {
        return respiracionMandibular;
    }

    public void setRespiracionMandibular(ResidualMandibular respiracionMandibular) {
        this.respiracionMandibular = respiracionMandibular;
    }

    public RelacionIncisal getRelacionIncisal() {
        return relacionIncisal;
    }

    public void setRelacionIncisal(RelacionIncisal relacionIncisal) {
        this.relacionIncisal = relacionIncisal;
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

    public SistemaEstomatognatico getSistemaEstomatognatico() {
        return sistemaEstomatognatico;
    }

    public void setSistemaEstomatognatico(SistemaEstomatognatico sistemaEstomatognatico) {
        this.sistemaEstomatognatico = sistemaEstomatognatico;
    }

    public Cara getCara() {
        return cara;
    }

    public void setCara(Cara cara) {
        this.cara = cara;
    }

    public ExamenOrofacial getExamenOrofacial() {
        return examenOrofacial;
    }

    public void setExamenOrofacial(ExamenOrofacial examenOrofacial) {
        this.examenOrofacial = examenOrofacial;
    }

}
