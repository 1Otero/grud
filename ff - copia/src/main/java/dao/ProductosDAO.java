/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exepciones.ConexionException;
import java.util.List;
import modelo.Producto;
import modelo.Usuario;

/**
 *
 * @author truji
 */
public interface ProductosDAO {
    
    void registrar(Producto producto) throws ConexionException;
    Producto consultarPorId(Integer id)throws ConexionException;
    List<Producto> consultarTodos();
    void actualizar(Producto producto) throws ConexionException;
    void eliminarPorId(Integer id);
    
}
