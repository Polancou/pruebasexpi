/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.dao.daoAreaTratamientos;
import sys.model.AreaTratamientos;
import sys.model.BitacoraRecibos;
import sys.model.MenuTratamientos;
import sys.util.HibernateUtil;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TratamientosImp implements daoAreaTratamientos {

    @Override
    public void insertarTratamiento(AreaTratamientos tratamiento) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(tratamiento);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void insertarMenuTratamientos(MenuTratamientos menu) {
       Session session = null;
       try{
           session = HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           session.save(menu);
           session.getTransaction().commit();
       }catch(Exception e){
           System.out.println(e.getMessage());
           session.getTransaction().rollback();
       }finally{
           if(session!=null){
               session.close();
           }
       }
    }

    @Override
    public List<AreaTratamientos> mostrarAreaTratamientos() {
        List<AreaTratamientos> mostrarAreaTratamientos=null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="from AreaTratamientos";
        try{
            mostrarAreaTratamientos = session.createQuery(hql).list();
            transaction.commit();
            session.close();
        }catch(Exception e){
            System.out.print(e.getMessage());
            transaction.rollback();
        }
        
        return mostrarAreaTratamientos;
    }

    @Override
    public List<MenuTratamientos> mostrarMenuTratamientos(BitacoraRecibos bitacora) {
        List<MenuTratamientos> mostrarMenuTratamientos=null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="from MenuTratamientos where area_tratamiento = "+bitacora.getMenuTratamientos().getAreaTratamientos().getArea();
        try{
            mostrarMenuTratamientos = session.createQuery(hql).list();
            transaction.commit();
            session.close();
        }catch(Exception e){
            System.out.print(e.getMessage());
            transaction.rollback();
        }
        
        return mostrarMenuTratamientos;
    }


}
