/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import exepciones.ConexionException;
import exepciones.enums.ConexionExceptionEnum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author truji
 */
public class Conexion {
      private static Connection conexion;
      
      
      private Conexion(){
          
      }
      
      public static Connection getInstance() throws ConexionException{
          if(Objects.isNull(conexion)){
               inciarConexion();
          }
               return conexion;
      }
      
      
      private static void inciarConexion() throws ConexionException{
          try{
           Properties propiedadesConexion = new Properties();   
          String url = "jdbc:mysql://localhost:3306/db_usuarios"; 
    String user = "root";
    String password = ""; 
    propiedadesConexion.put("url", url);
    propiedadesConexion.put("user",user);
    propiedadesConexion.put("password", password);
              
           conexion = DriverManager.getConnection(
               propiedadesConexion.getProperty("url"),propiedadesConexion);
          }catch(SQLException e){
                throw new ConexionException(ConexionExceptionEnum.ERROR_CONEXION, e);
          }
          
      }
      
}

