/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exepciones.ConexionException;
import conexion.Conexion;
import exepciones.ConexionException;
import exepciones.enums.ConexionExceptionEnum;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modelo.Pqr;
import modelo.Usuario;

/**
 *
 * @author truji
 */
public class PqrDAOMySql implements PqrDAO{

    @Override
    public void registrar(Pqr pqr) throws ConexionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pqr consultarPorId(Integer id) throws ConexionException {
         try{
             PreparedStatement ps = Conexion.getInstance()
                     .prepareStatement("SELECT * FROM pqr WHERE id=?");
             ps.setInt(1,id);
             ResultSet rs = ps.executeQuery();
             Pqr pqr = null;
             if(rs.next()){
               pqr.setTipo_pqr(rs.getString("tipo_pqr"));
               pqr.setNombre_usuario(rs.getString("nombre_usuario"));
               pqr.setCorreo_usuario(rs.getString("correo_usuario"));
               pqr.setCel_usuario(rs.getInt("celular"));
               pqr.setFecha(rs.getString("fecha"));
             }
             return pqr;
         }catch(SQLException e){
             throw new ConexionException(ConexionExceptionEnum.ERROR_CONSULTA,e);
         }
    }

    @Override
    public List<Pqr> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Pqr pqr) throws ConexionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
