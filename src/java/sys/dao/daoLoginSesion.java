/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.SesionAlumnos;
import sys.model.SesionTable;

/**
 *
 * @author RamsesMtnz
 */
public interface daoLoginSesion {
    
    public void nuevoUsuario();
    
    public void eliminarUsuario();
    
    public int consultarUsuario(SesionTable login);
    
    public boolean consultarAlumno(SesionAlumnos login);
}
