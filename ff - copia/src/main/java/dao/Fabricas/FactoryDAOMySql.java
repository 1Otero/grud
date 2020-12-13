/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Fabricas;

import dao.InventarioDAO;
import dao.InventarioDAOMySql;
import dao.PqrDAO;
import dao.PqrDAOMySql;
import dao.ProductosDAO;
import dao.ProductosDAOMySql;
import dao.UsuarioDAO;
import dao.UsuarioDAOMySql;
import dao.UsuarioDAOPostgreSQL;
import modelo.Producto;

/**
 *
 * @author truji
 */
public class FactoryDAOMySql implements FactoryDAO{

    @Override
    public UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAOMySql();
    }

    @Override
    public ProductosDAO getProductoDAO() {
        return new ProductosDAOMySql();
    }

    /*@Override
    public PqrDAO getPqrDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InventarioDAO getInventarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
    
}
