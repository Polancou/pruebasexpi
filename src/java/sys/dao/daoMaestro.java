/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.Maestro;
import sys.model.MaestroMaterias;
import sys.model.Materias;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface daoMaestro {

    public void insertarMaestro(Maestro maestro);

    public List<Maestro> mostrarMaestro();

    public void editarMaestro(Maestro maestro);

    public void eliminarMaestro(Maestro maestro);

    public List<Materias> mostrarMaterias(MaestroMaterias maestroM);

    public void insertarMaestroMaterias(MaestroMaterias maestroM);

    public String mostrarCodigo();

}