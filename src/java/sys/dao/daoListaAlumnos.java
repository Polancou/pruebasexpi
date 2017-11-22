/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.Alumnos;
import sys.model.ListaAlumnos;
import sys.model.MaestroMaterias;
import sys.model.Materias;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface daoListaAlumnos {
    
    public List<ListaAlumnos> MostrarAlumnos(MaestroMaterias mmaterias);
    
    public boolean insertarListaAlumnos(ListaAlumnos lista);
    
    public List<ListaAlumnos> MostrarClases(Alumnos alumno,MaestroMaterias mmaterias);
}
