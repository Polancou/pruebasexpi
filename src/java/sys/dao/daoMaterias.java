/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.Materias;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface daoMaterias {
    
    public void insertarMaterias(Materias materia);
    
    public List<Materias> mostrarMaterias();
        
    public boolean actuliazarMaterias(Materias materia);
    
    public boolean eliminarMateria(Materias materia);
    
}
