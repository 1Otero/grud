/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exepciones.ConexionException;
import java.util.List;
import modelo.Pqr;
import modelo.Usuario;

/**
 *
 * @author truji
 */
public interface PqrDAO {
     void registrar(Pqr pqr) throws ConexionException;
    Pqr consultarPorId(Integer id)throws ConexionException;
    List<Pqr> consultarTodos();
    void actualizar(Pqr pqr) throws ConexionException;
    void eliminarPorId(Integer id);    
}
