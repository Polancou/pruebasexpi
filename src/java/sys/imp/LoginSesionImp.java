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
                if (users.getContraseña().equals(loguin.getContraseña()) && users.getUsuario().equals(loguin.getUsuario())) {
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
}
