/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones.enums;

import exepciones.enums.FactoryExceptionEnum;

/**
 *
 * @author truji
 */
public enum FactoryExceptionEnum {
    
    
    ERROR_FABRICA_DAO("01155", "Error al instanciar la fabrica");
    
    private String codigo;
    private String mensaje;
    
    private FactoryExceptionEnum(String codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getMensaje() {
        return mensaje;
    }
    

}
