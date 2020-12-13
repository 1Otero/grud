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
import java.util.List;
import java.util.Set;
import modelo.Usuario;

/**
 *
 * @author truji
 */
public class UsuarioDAOPostgreSQL implements UsuarioDAO {

    @Override
    public void registrar(Usuario usuario) throws ConexionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarPorId(Integer id) throws ConexionException {
        try {
            PreparedStatement ps = Conexion.getInstance()
                    .prepareStatement("SELECT * FROM tabla_usuario WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Usuario u = null;
            if (rs.next()) {
                u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setDocumento(rs.getString("numero_documento"));
                u.setNombres(rs.getString("nombres"));
                u.setApellidos(rs.getString("apellidos"));
                u.setNombreUsuario(rs.getString("nombre_usuario"));
                u.setClave(rs.getString("clave"));
            }
            return u;
        } catch (SQLException e) {
           throw new ConexionException(ConexionExceptionEnum.ERROR_CONSULTA, e);  
        }
    }

    @Override
    public List<Usuario> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Usuario usuario) throws ConexionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
