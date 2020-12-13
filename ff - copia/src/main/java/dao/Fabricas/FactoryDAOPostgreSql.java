/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Fabricas;

import dao.InventarioDAO;
import dao.PqrDAO;
import dao.ProductosDAOPostgreSql;
import dao.ProductosDAO;
import dao.UsuarioDAO;
import dao.UsuarioDAOPostgreSQL;

/**
 *
 * @author truji
 */
public class FactoryDAOPostgreSql implements FactoryDAO{

    @Override
    public UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAOPostgreSQL();
    }

    @Override
    public ProductosDAO getProductoDAO() {
        return new ProductosDAOPostgreSql();
    }
/*
    @Override
    public PqrDAO getPqrDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InventarioDAO getInventarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
