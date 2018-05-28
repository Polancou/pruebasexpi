/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.imp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import sys.dao.daoNuevoPaciente;
import sys.model.pacientes.AnalisisOclusion;
import sys.model.pacientes.Atm;
import sys.model.pacientes.DireccionPaciente;
import sys.model.pacientes.ExamenOral;
import sys.model.pacientes.ExamenOrofacial;
import sys.model.pacientes.HallazgosRadiograficos;
import sys.model.pacientes.MedicoPaciente;
import sys.model.pacientes.Paciente;
import sys.model.pacientes.PreguntasPaciente;
import sys.model.pacientes.TrabajoPaciente;
import sys.util.HibernateUtil;

/**
 *
 * @author Ramses Mtnz Santiago
 */
public class NuevoPacienteImp implements daoNuevoPaciente {

    @Override
    public boolean datosPersonales(Paciente paciente, MedicoPaciente medico, DireccionPaciente direccion, TrabajoPaciente trabajo) {
        boolean inserto = false;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(direccion);
            session.save(medico);
            session.save(trabajo);
            paciente.setDireccionPaciente(direccion.getId());
            paciente.setMedicoPaciente(medico.getId());
            paciente.setTrabajoPaciente(trabajo.getId());
            paciente.setFechaRegistro(paciente.getFechaNacim());
            session.save(paciente);
            session.getTransaction().commit();
            inserto = true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return inserto;
    }

    @Override
    public boolean cuestionario(PreguntasPaciente preguntas) {
       boolean inserto = false;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            preguntas.setFolio("87987");
            preguntas.setPaciente(1);
            session.save(preguntas);
            session.getTransaction().commit();
            inserto = true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return inserto;
    }

    @Override
    public boolean examenOrofacial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

}
