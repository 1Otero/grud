/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import modelo.Usuario;

/**
 *
 * @author truji
 */
public class UsuarioBuilder {
     
    private Usuario usuario;
    
    private UsuarioBuilder(){
        usuario = new Usuario();    
    }
    
    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }
    
    public UsuarioBuilder id(Integer id){
        usuario.setId(id);
        return this;
    }
    
    public UsuarioBuilder numeroDocumento(String n){
        usuario.setDocumento(n);
        return this;
    } 
    
    public UsuarioBuilder nombres(String nombres){
        usuario.setNombres(nombres);
        return this;
    }
    
    public UsuarioBuilder apellidos(String apellidos){
        usuario.setApellidos(apellidos);
        return this;
    }
    
    public UsuarioBuilder nombresUsuario(String nombresUsuario){
     usuario.setNombreUsuario(nombresUsuario);
     return this;
    }
    
    public UsuarioBuilder clave(String clave){
       usuario.setClave(clave);
       return this;
    }
    
    public UsuarioBuilder tipoDocumento(String t){
       usuario.setTipoDocumentoId(t);
       return this;
    }
    
    public Usuario build(){
        return usuario;
    }
    
    
}
