/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones.enums;

import exepciones.enums.*;

/**
 *
 * @author truji
 */
public enum ConexionExceptionEnum {
   
    ERROR_CONEXION("62626","Error al conectarse a la base de datos"),
    ERROR_CONSULTA("313131","Error al realizar la consulta"),
    ERROR_ACTUALIZA("151515","Error al realizar la actualizacion");
    
    private String codigo;
    private String mensaje;
    
    
    private ConexionExceptionEnum(String codigo, String mensasje){
        this.codigo = codigo;
        this.mensaje = mensaje;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getMensaje(){
        return mensaje;
    }
    
}
