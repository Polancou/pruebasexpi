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
import sys.dao.daoAlumnos;
import sys.model.Alumnos;
import sys.util.HibernateUtil;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AlumnosImp implements daoAlumnos {

    String contraNOencriptada, contraEncriptada;
    LoginSesionImp encriptadoLoguin = new LoginSesionImp();

    @Override
    public int insertarAlumnos(Alumnos alumnos) {
        String contraseñaEncriptada = encriptadoLoguin.encriptado(alumnos.getContraseña());
        int seRegistro = 0;
        Session session = null;
        List<Alumnos> usuarioList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            usuarioList = session.createQuery("From Alumnos").list();

            for (Alumnos users : usuarioList) {
                if (users.getUsuario().equals(alumnos.getUsuario())) {
                    //si el usuario que esta guardando es igual a alguno de la base de datos
                    seRegistro = 1;
                    System.out.println("mismos usuarios");
                } else if (users.getMatricula() == alumnos.getMatricula()) {
                    // si coincide con alguna matricula ya registrada
                    seRegistro = 2;
                    System.out.println("mismas matriculas");
                } 
            }
            if (seRegistro == 0) {
                System.out.println("guarda datos");
                session.save(new Alumnos(alumnos.getMatricula(), alumnos.getNombre(), alumnos.getApellidoPaterno(), alumnos.getApellidoMaterno(), alumnos.getUsuario(), contraseñaEncriptada, alumnos.getSemestre(), alumnos.getGrupo()));
                session.getTransaction().commit();
                seRegistro = 3;
                System.out.println("datos guardados");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        System.out.println("retorna entero"+seRegistro);
        return seRegistro;
    }

    @Override
    public boolean consultarAlumno(Alumnos loguin) {
        contraEncriptada = encriptadoLoguin.encriptado(loguin.getContraseña());
        boolean usuario = false;
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession sessionUsuario = request.getSession();
        List<Alumnos> usuarioList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "From Alumnos";

        try {
            usuarioList = session.createQuery(hql).list();
            for (Alumnos users : usuarioList) {
                if (users.getContraseña().equals(contraEncriptada) && users.getUsuario().equals(loguin.getUsuario())) {
                    System.out.println("Existe\nMatricula del alumno es: " + users.getMatricula());
                    sessionUsuario.setAttribute("idSesion", users.getMatricula());
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
