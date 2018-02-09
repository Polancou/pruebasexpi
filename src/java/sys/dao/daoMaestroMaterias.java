/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.MaestroMaterias;
import sys.model.Materias;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface daoMaestroMaterias {

    public List<MaestroMaterias> mostrarMaestroMaterias();
    
    public List<MaestroMaterias> mostrarMaterias(MaestroMaterias maestro);
    
    public List<MaestroMaterias> mostrarGrupo(MaestroMaterias maestro);
    
    public List<MaestroMaterias> mostrarGrado(MaestroMaterias maestro);
    
    public List<MaestroMaterias> mostrarMateriasAsignadas();

}
