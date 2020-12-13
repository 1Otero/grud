/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exepciones.ConexionException;
import modelo.Usuario;
import java.util.List;

/**
 *
 * @author truji
 */


public interface UsuarioDAO {
    void registrar(Usuario usuario) throws ConexionException;
    Usuario consultarPorId(Integer id)throws ConexionException;
    List<Usuario> consultarTodos();
    void actualizar(Usuario usuario) throws ConexionException;
    void eliminarPorId(Integer id);

}
