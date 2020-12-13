/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Fabricas;
import dao.Fabricas.FactoryDAO;
import exepciones.FactoryException;
import exepciones.enums.FactoryExceptionEnum;

/**
 *
 * @author truji
 */
public class Factory {
    
     private Factory(){
         
     }   
     
     public static FactoryDAO getFactory()throws FactoryException{
       try{  
         FactoryDAO factoryDAO = (FactoryDAO) Class
                 .forName("dao.Fabricas.FactoryDAOMySql")
                 .newInstance();
          return factoryDAO;
          }catch(Exception e){
                throw new FactoryException(FactoryExceptionEnum.ERROR_FABRICA_DAO,e);                 
           }
     }
     
}
