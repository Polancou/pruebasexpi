/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.EncargadaClinica;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface daoEncargadaDeFarmacia {
    
     public boolean insertarEncargada(EncargadaClinica encargada);
     
     public boolean actualizarEncargada(EncargadaClinica encargada);
     
     public boolean eliminarEncargada(EncargadaClinica encargada);
     
     public List<EncargadaClinica> verEncargadas();
}
