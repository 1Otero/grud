/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ff;

import builder.ProductoBuilder;
import builder.UsuarioBuilder;
import dao.ProductosDAO;
import conexion.Conexion;
import dao.Fabricas.Factory;
//import dao.Fabricas.Factory;
import dao.Fabricas.FactoryDAO;
import dao.Fabricas.FactoryDAOMySql;
import dao.UsuarioDAO;
import exepciones.ConexionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import dao.UsuarioDAOMySql;
import dao.UsuarioDAOPostgreSQL;
import exepciones.FactoryException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Producto;
import modelo.Usuario;

/**
 *
 * @author truji
 */
public class ff {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public static void main(String[] args){
    
        try{
            FactoryDAO factoryDAO = Factory.getFactory();
            UsuarioDAO fff = factoryDAO.getUsuarioDAO();
            ProductosDAO ffff = factoryDAO.getProductoDAO();
            
            
            //Registro
            
            Usuario uff = UsuarioBuilder.builder()
                    .numeroDocumento("31312")
                    .nombres("punto_rojo")
                    .nombresUsuario("pgl")
                    .apellidos("weed")
                    .clave("131212")
                    .tipoDocumento("cc")
                    .build();
            
            UsuarioDAO uDAO = factoryDAO.getUsuarioDAO();
            uDAO.registrar(uff);
            
            Producto pff = ProductoBuilder
                    .builder()
                    .nombreProducto("purpol")
                    .FechaIngreso("213123")
                    .cantidad(12)
                    .valor(2121)
                    .build();
            
            ProductosDAO pDAO = factoryDAO.getProductoDAO();
           pDAO.registrar(pff);
            
           
           
           
            //Consultas 
            Producto fffff = ffff.consultarPorId(1);
            Usuario uf = fff.consultarPorId(2); 
            
            System.out.println(String.format("Id: %d - Nombre_producto: %s - Tipo: %s",fffff.getId(),fffff.getNombre_producto(),fffff.getTipo()));
            UsuarioDAO f= new UsuarioDAOMySql();
            UsuarioDAO ff = new UsuarioDAOPostgreSQL();
            Usuario u = f.consultarPorId(1);
            Usuario uu = ff.consultarPorId(1);
            System.out.println("------------------------------MySQL---------------------------------------------------------------");
            System.out.println(String.format("Id: %d - Nombre: %s - Apellidos: %s", u.getId(), u.getNombres(), u.getApellidos()));
            System.out.println(String.format("clave: %s - Id: %d - Nombre: %s", u.getClave(), u.getId(), u.getNombres()));
            System.out.println("-----------------------------postreSQL----------------------------------------");
            System.out.println(String.format("Id: %d - Nombre: %s",uu.getId(), uu.getNombres()));
            System.out.println("Todo fino");            
            Connection con = Conexion.getInstance();
            Connection conn = Conexion.getInstance();
            System.out.println(con == conn);            
        }catch(ConexionException e){
              System.out.println(e.getTipo().getCodigo() + " " +e.getTipo().getMensaje());
        } catch (FactoryException ex) {
            Logger.getLogger(ff.class.getName()).log(Level.SEVERE, null, ex);
        }/* catch (FactoryException ex) {
            Logger.getLogger(ff.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        

        

    }
}   
   

