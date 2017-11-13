/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sys.dao.daoListaAlumnos;
import sys.model.Alumnos;
import sys.model.ListaAlumnos;
import sys.model.MaestroMaterias;
import sys.util.HibernateUtil;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ListaAlumnosImp implements daoListaAlumnos {

    @Override
    public List<ListaAlumnos> MostrarAlumnos(MaestroMaterias mmaterias) {
        List<ListaAlumnos> mostrarAlumnos = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="from ListaAlumnos as m inner join fetch m.maestroMaterias left join fetch m.alumnos where m.maestroMaterias.año='"+mmaterias.getAño()+"' and "
                + "m.maestroMaterias.materias.idMateria="+mmaterias.getMaterias().getIdMateria()+" and m.maestroMaterias.grupo="+mmaterias.getGrupo();
             
        try{
            mostrarAlumnos = session.createQuery(hql).list();
            transaction.commit();
            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return mostrarAlumnos;
    }
    
    

}
