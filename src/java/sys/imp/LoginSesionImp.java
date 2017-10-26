/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.dao.daoLoginSesion;
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
        List<SesionTable> usuarioList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "From SesionTable";
        try {
            int i=0;
            usuarioList = session.createQuery(hql).list();
            for (SesionTable users : usuarioList) 
            {
                System.out.println("datos: " + users.getUsuario() + " " + users.getContraseña());
                System.out.println("datos del list: " + usuarioList.get(i).getUsuario() + " " + usuarioList.get(i).getContraseña());
                System.out.print("Datos guardados en loguin: " + loguin.getUsuario() + " " + loguin.getContraseña());
                if (users.getContraseña().equals(loguin.getContraseña()) && users.getUsuario().equals(loguin.getUsuario())) {
                    System.out.println("Existe");
                    usuario = Integer.parseInt(users.getTipo());
                }i++;
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
