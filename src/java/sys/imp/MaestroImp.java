/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.dao.daoMaestro;
import sys.model.Maestro;
import sys.model.MaestroMaterias;
import sys.model.Materias;
import sys.util.HibernateUtil;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MaestroImp implements daoMaestro{

    @Override
    public void insertarMaestro(Maestro maestro) {
       Session session = null;
       try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(maestro);
            session.getTransaction().commit();
       }catch(Exception e){
           System.out.println(e.getMessage());
           session.getTransaction().rollback();
       }
       finally{
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public List<Maestro> mostrarMaestro() {
        List<Maestro> mostrarMaestro=null;
        Session session  = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="from Maestro";
        try{
            mostrarMaestro = session.createQuery(hql).list();
            transaction.commit();
            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return mostrarMaestro;
    }

    @Override
    public void editarMaestro(Maestro maestro) {
       Session session = null;
       try{
           session = HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           session.update(maestro);
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
    public void eliminarMaestro(Maestro maestro) {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(maestro);
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
    public List<Materias> mostrarMaterias(MaestroMaterias maestroM) {
         List<Materias> mostrarMaterias=null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="from Materias where semestre = "+maestroM.getGrupo();
        try{
            mostrarMaterias = session.createQuery(hql).list();
            transaction.commit();
            session.close();
        }catch(Exception e){
            System.out.print(e.getMessage());
            transaction.rollback();
        }
        
        return mostrarMaterias;
    }
    
     @Override
    public void insertarMaestroMaterias(MaestroMaterias materia) {
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

     @Override
    public String mostrarCodigo() {
      
    
       String clave="";
       String [] abc={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"};
      
           int numeroAleatorio1=(int)(Math.random()*35+1);
           int numeroAleatorio2=(int)(Math.random()*35+1);
           int numeroAleatorio3=(int)(Math.random()*35+1);
           int numeroAleatorio4=(int)(Math.random()*35+1);
           int numeroAleatorio5=(int)(Math.random()*35+1);
           int numeroAleatorio6=(int)(Math.random()*35+1);
           
           clave=abc[numeroAleatorio1].concat(abc[numeroAleatorio2]).concat(abc[numeroAleatorio3]).concat(abc[numeroAleatorio4]).concat(abc[numeroAleatorio5].concat(abc[numeroAleatorio6]));

       return clave;
        
    
    }

}
