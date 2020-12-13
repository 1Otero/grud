/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import exepciones.ConexionException;
import exepciones.enums.ConexionExceptionEnum;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import modelo.Producto;
import modelo.Usuario;

/**
 *
 * @author truji
 */
public class ProductosDAOMySql implements ProductosDAO{

    @Override
    public void registrar(Producto producto) throws ConexionException {
        try{
        PreparedStatement ps = Conexion.getInstance()
                .prepareStatement("INSERT INTO producto (nombre_producto,tipo,fecha_ingreso,valor,cantidad) VALUES (?,?,?,?,?)");
        ps.setString(1,producto.getNombre_producto());
        ps.setString(2,producto.getTipo());
        ps.setString(3,producto.getFecha());
        ps.setInt(4,producto.getValor());
        ps.setInt(5,producto.getCantidad());
        ps.execute();
        ps.close();
        }catch(SQLException e){
            throw new ConexionException(ConexionExceptionEnum.ERROR_ACTUALIZA,e);
        }
    }

    @Override
    public Producto consultarPorId(Integer id) throws ConexionException {
        try{ 
        PreparedStatement ps = Conexion.getInstance()
                .prepareStatement("SELECT * FROM producto WHERE id= ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Producto p = null;
        if(rs.next()){
        p = new Producto();    
        p.setId(rs.getInt("id"));
        p.setNombre_producto(rs.getString("nombre_producto"));
        p.setTipo(rs.getString("tipo"));
        p.setFecha(rs.getString("fecha_ingreso"));
        p.setValor(rs.getInt("valor"));
        p.setCantidad(rs.getInt("cantidad"));            
        }
        return p;
        }catch(SQLException e){
            throw new ConexionException(ConexionExceptionEnum.ERROR_CONSULTA, e);               
        }
    }


    @Override
    public List<Producto> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Producto producto) throws ConexionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
