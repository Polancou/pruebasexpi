/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.imp;

import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.dao.daoLoginSesion;
import sys.model.EncargadaClinica;
import sys.model.Maestro;
import sys.model.SesionAlumnos;
import sys.model.SesionTable;
import sys.util.HibernateUtil;

/**
 *
 * @author RamsesMtnz
 */
public class LoginSesionImp implements daoLoginSesion {

    @Override
    public int consultarUsuario(SesionTable loguin) {
        int usuario = 0;
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession sessionUsuario = request.getSession();
        List<SesionTable> usuarioList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "From SesionTable";

        try {
            usuarioList = session.createQuery(hql).list();
            for (SesionTable users : usuarioList) {
                if (users.getContraseña().equals(loguin.getContraseña()) && users.getUser().equals(loguin.getUser())) {
                    System.out.println("Existe\nid del empleado es: " + users.getIdEmpleado());
                    sessionUsuario.setAttribute("idEmpleado", users.getIdEmpleado());
                    usuario = users.getTipo();
                }
            }
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return usuario;
    }

    //hacer el mapeo de la nueva tabla de loguinAlumno, aparte cambiar en la interfaz que sea de tipo usuarioAlumno,
    //y cambiar que la consulta sea igual en el nuevo mapeo.
    @Override
    public boolean consultarAlumno(SesionAlumnos loguin) {
        boolean usuario = false;
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession sessionAlumno = request.getSession();
        List<SesionAlumnos> usuarioList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "From SesionAlumnos";

        try {
            usuarioList = session.createQuery(hql).list();
            for (SesionAlumnos users : usuarioList) {
                if (users.getContraseña().equals(loguin.getContraseña()) && users.getUser().equals(loguin.getUser())) {
                    System.out.println("Existe\nusuario del alumno es: " + users.getIdSesion());
                    sessionAlumno.setAttribute("idSesion", users.getIdSesion());
                    usuario = true;
                }
            }
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return usuario;
    }

    @Override
    public boolean consultarDocente(Maestro docente, SesionTable sesion) {
        boolean usuario = false;
        List<Maestro> usuarioList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            usuarioList = session.createQuery(" from Maestro where idEmpleado=:idEmpleado").setParameter("idEmpleado", docente.getIdEmpleado()).list();

            for (Maestro maestro : usuarioList) {
                if (maestro.getIdEmpleado() == docente.getIdEmpleado()) {
                    System.out.println("El maestro ha sido registrado");
                    session.save(new SesionTable(2, sesion.getUser(), sesion.getContraseña(), docente.getIdEmpleado()));
                    usuario = true;
                }
            }
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return usuario;
    }

    @Override
    public boolean consultarFarmacia(EncargadaClinica encargada, SesionTable sesion) {
        boolean usuario = false;
        List<EncargadaClinica> encargadaList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            encargadaList = session.createQuery(" from EncargadaClinica where idEmpleado=:idEmpleado").setParameter("idEmpleado", encargada.getIdEmpleado()).list();
            for (EncargadaClinica encargadaFarmacia : encargadaList) {
                if (encargadaFarmacia.getIdEmpleado() == encargada.getIdEmpleado()) {
                    System.out.println("El maestro ha sido registrado");
                    session.save(new SesionTable(3, sesion.getUser(), sesion.getContraseña(), encargada.getIdEmpleado()));
                    usuario = true;
                }
            }
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return usuario;
    }

}
