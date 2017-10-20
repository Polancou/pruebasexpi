/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.imp;

import org.hibernate.Session;
import sys.dao.daoMaterias;
import sys.model.Materias;
import sys.util.HibernateUtil;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MateriasImp implements daoMaterias {

    @Override
    public void insertarMaterias(Materias materia) {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(materia);
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
    
}
