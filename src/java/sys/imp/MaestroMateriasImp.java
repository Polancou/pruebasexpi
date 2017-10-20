/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.imp;

import java.awt.event.ActionEvent;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.dao.daoMaestroMaterias;
import sys.model.Maestro;
import sys.model.MaestroMaterias;
import sys.model.Materias;
import sys.util.HibernateUtil;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MaestroMateriasImp implements daoMaestroMaterias{
    
   
    
       @Override
    public List<MaestroMaterias> mostrarMaestroMaterias() {
       List<MaestroMaterias> mostrarMaMa = null;
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       String hql="from MaestroMaterias as m inner join fetch m.maestro left join fetch m.materias";
       try{
           mostrarMaMa = session.createQuery(hql).list();
           transaction.commit();
           session.close();
       }catch(Exception e){
           System.out.println(e.getMessage());
           transaction.rollback();
       }
       return mostrarMaMa;
    }

  

  

   

}
