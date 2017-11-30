/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.imp;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.dao.daoLoginSesion;
import sys.model.Alumnos;
import sys.model.EncargadaClinica;
import sys.model.Maestro;
import sys.model.SesionTable;
import sys.util.HibernateUtil;

/**
 *
 * @author RamsesMtnz
 */
public class LoginSesionImp implements daoLoginSesion {
    
     private MessageDigest md = null;
     String contraNOencriptada,contraEncriptada;
    
    @Override
    public int consultarUsuario(SesionTable loguin) {
        contraNOencriptada=loguin.getContraseña();
        contraEncriptada=encriptado(contraNOencriptada);
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
                if (users.getContraseña().equals(contraEncriptada) && users.getUser().equals(loguin.getUser())) {
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
    
    public String encriptado(String password){
       // System.out.print("recibe como pasword: "+password);
	try {
		md = MessageDigest.getInstance("SHA-256");
	} 
	catch (NoSuchAlgorithmException e) {		
		e.printStackTrace();
		return null;
	}
	    
	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();
	    
	for(byte b : hash) {        
		sb.append(String.format("%02x", b));
	}
	   System.out.println("retorna contraseña encriptada: "+sb.toString());
	return sb.toString();
    }

    //hacer el mapeo de la nueva tabla de loguinAlumno, aparte cambiar en la interfaz que sea de tipo usuarioAlumno,
    //y cambiar que la consulta sea igual en el nuevo mapeo.
    @Override
    public boolean consultarAlumno(Alumnos loguin) {
        contraNOencriptada=loguin.getContraseña();
        contraEncriptada=encriptado(contraNOencriptada);
        boolean usuario = false;
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession sessionAlumno = request.getSession();
        List<Alumnos> usuarioList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "From Alumnos";

        try {
            usuarioList = session.createQuery(hql).list();
            for (Alumnos users : usuarioList) {
                if (users.getContraseña().equals(contraEncriptada) && users.getUsuario().equals(loguin.getUsuario())) {
                    System.out.println("Existe\nMatricula del alumno es: " + users.getMatricula());
                    sessionAlumno.setAttribute("idSesion", users.getMatricula());
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
        contraNOencriptada=sesion.getContraseña();
        contraEncriptada=encriptado(contraNOencriptada);
        boolean usuario = false;
        List<Maestro> usuarioList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            usuarioList = session.createQuery(" from Maestro where idEmpleado=:idEmpleado").setParameter("idEmpleado", docente.getIdEmpleado()).list();

            for (Maestro maestro : usuarioList) {
                if (maestro.getIdEmpleado() == docente.getIdEmpleado()) {
                    System.out.println("El maestro ha sido registrado");
                    session.save(new SesionTable(2, sesion.getUser(), contraEncriptada, docente.getIdEmpleado()));
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
