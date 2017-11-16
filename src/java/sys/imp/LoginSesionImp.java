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
import sys.model.SesionAlumnos;
import sys.model.SesionTable;
import sys.util.HibernateUtil;

/**
 *
 * @author RamsesMtnz
 */
public class LoginSesionImp implements daoLoginSesion {

    @Override
    public void nuevoUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
                    System.out.println("Existe\nid del empleado es: "+users.getIdEmpleado());
                    sessionUsuario.setAttribute("idEmpleado", users.getIdEmpleado());
                    usuario = Integer.parseInt(users.getTipo());
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
                    System.out.println("Existe\nusuario del alumno es: "+users.getIdSesion());
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
}
