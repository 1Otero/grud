/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import exepciones.ConexionException;
import exepciones.enums.ConexionExceptionEnum;
import modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author truji
 */
public class UsuarioDAOMySql implements UsuarioDAO{
    
    @Override 
    public void registrar(Usuario usuario) throws ConexionException{
       try{
          PreparedStatement ps = Conexion.getInstance()
           .prepareStatement("INSERT INTO tabla_usuario (numero_documento,nombres,apellidos,nombre_usuario,clave,tipo_documento_id) VALUES (?,?,?,?,?,?)");
          ps.setString(1,usuario.getDocumento());
          ps.setString(2,usuario.getNombres());
          ps.setString(3,usuario.getApellidos());
          ps.setString(4,usuario.getNombreUsuario());
          ps.setString(5,usuario.getClave());
          ps.setString(6,usuario.getTipoDocumentoId()); 
          ps.execute();
          ps.close();
        }catch(SQLException e){
            throw new ConexionException(ConexionExceptionEnum.ERROR_ACTUALIZA,e);
        } 
    }
    
    @Override 
    public Usuario consultarPorId(Integer id) throws ConexionException {
       try{
         PreparedStatement ps = Conexion.getInstance()
                 .prepareStatement("SELECT * FROM tabla_usuario WHERE id= ?");
           ps.setInt(1, id);
           ResultSet rs =  ps.executeQuery();
           Usuario u = null;
           if(rs.next()){
               u = new Usuario();
               u.setId(rs.getInt("id"));
               u.setDocumento(rs.getString("numero_documento"));
               u.setNombres(rs.getString("nombres"));
               u.setApellidos(rs.getString("apellidos"));
               u.setNombreUsuario(rs.getString("nombre_usuario"));
               u.setClave(rs.getString("clave"));           }
           return u;
       }catch(SQLException e){
            throw new ConexionException(ConexionExceptionEnum.ERROR_CONSULTA, e);
       }  
    }
    
    @Override
    public List<Usuario> consultarTodos(){
      throw new  UnsupportedOperationException("Not supported yet!"); // recordar To change body of generated methods, choose Tools | Templates.    
    }
    
    @Override
    public void actualizar(Usuario usuario) throws ConexionException{
        throw new UnsupportedOperationException("Not supported yet!"); // recordar To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void eliminarPorId(Integer id){
        throw new UnsupportedOperationException("Not supported yet!"); // recordar To change body of generated methods, choose Tools | Templates.
    }
}

