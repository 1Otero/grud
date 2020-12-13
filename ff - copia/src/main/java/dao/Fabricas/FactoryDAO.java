/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Fabricas;

import dao.PqrDAO;
import dao.ProductosDAO;
import dao.UsuarioDAO;
import dao.InventarioDAO;

/**
 *
 * @author truji
 */
public interface FactoryDAO {
    
    UsuarioDAO getUsuarioDAO();
    
    ProductosDAO getProductoDAO();
    
   // PqrDAO getPqrDAO();
    
    //InventarioDAO getInventarioDAO();
}
