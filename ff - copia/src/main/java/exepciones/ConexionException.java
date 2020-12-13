/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;
import exepciones.enums.ConexionExceptionEnum;
import java.sql.SQLException;

/**
 *
 * @author truji
 */
public class ConexionException extends Exception{
    
    private ConexionExceptionEnum tipo;
    
    public ConexionException(ConexionExceptionEnum tipo, String s){
        super(tipo.getMensaje());
        this.tipo = tipo;
    }
    public ConexionException(ConexionExceptionEnum tipo, Throwable thrwbl ){
        super(tipo.getMensaje(), thrwbl);
        this.tipo = tipo;
    }

   /* public ConexionException(exepciones.enums.ConexionExceptionEnum conexionExceptionEnum, SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    public ConexionExceptionEnum getTipo(){
        return tipo;
    }
}
