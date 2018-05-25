/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.imp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import sys.dao.daoNuevoPaciente;
import sys.model.pacientes.DireccionPaciente;
import sys.model.pacientes.MedicoPaciente;
import sys.model.pacientes.Paciente;
import sys.model.pacientes.Padecimientos;
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
            session.save(new Paciente(direccion.getId(), medico.getId(), trabajo.getId(), paciente.getFolio(), paciente.getNombre(),
                    paciente.getEdad(), paciente.getSexo(), paciente.getFechaNacim(), paciente.getTelefono(), paciente.getEstatura(),
                    paciente.getPeso(), paciente.getEstadoCivil(), paciente.getNivelEstudios(), paciente.getEstadoSalud(),
                    paciente.getPorqueSolicita(), paciente.getObservaciones(), paciente.getFechaNacim()));
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
    public boolean cuestionario(PreguntasPaciente preguntas, String[] padecimientos, String[] alergias) {
//        boolean inserto = false;
//        Session session = null;
//        try {
//            session = HibernateUtil.getSessionFactory().openSession();
//            session.beginTransaction();
//            session.save(new Padecimientos(hepatitis, enfermedadesVeneras, embolia, varicela, asma, ictericia, infartoMiocardio, epilepsia, fiebreReumatica, hipertensionArterial, tuberculosis, anginaPecho, diabetes, sarampiom, cancer));
//            session.getTransaction().commit();
//            inserto = true;
//        } catch (HibernateException e) {
//            System.out.println(e.getMessage());
//            session.getTransaction().rollback();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
        return true;
    }
    
}
