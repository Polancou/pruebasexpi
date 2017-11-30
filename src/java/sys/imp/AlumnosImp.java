/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.imp;

import org.hibernate.Session;
import sys.dao.daoAlumnos;
import sys.model.Alumnos;
import sys.util.HibernateUtil;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AlumnosImp implements daoAlumnos{

    @Override
    public boolean insertarAlumnos(Alumnos alumnos) {
        LoginSesionImp encriptadoLoguin=new LoginSesionImp();
        String contraseñaEncriptada=encriptadoLoguin.encriptado(alumnos.getContraseña());
        boolean seRegistro=false;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(new Alumnos(alumnos.getMatricula(), alumnos.getNombre(), alumnos.getApellidoPaterno(), alumnos.getApellidoMaterno(), alumnos.getUsuario(), contraseñaEncriptada, alumnos.getSemestre(), alumnos.getGrupo()));
            session.getTransaction().commit();
            seRegistro=true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        return seRegistro;
    }
    
    
    
}
