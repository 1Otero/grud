/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;
import exepciones.enums.FactoryExceptionEnum;
/**
 *
 * @author truji
 */
public class FactoryException extends Exception{
    private FactoryExceptionEnum tipo; 
    
    public FactoryException(FactoryExceptionEnum tipo){
       super(tipo.getMensaje());
       this.tipo = tipo;
    }
    public FactoryException(FactoryExceptionEnum tipo, Throwable thrwbl){
        super(tipo.getMensaje(),thrwbl);   
        this.tipo = tipo;
    }
    public FactoryExceptionEnum getTipo(){
        return tipo;
    }
}
