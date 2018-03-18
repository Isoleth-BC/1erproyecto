/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatosisolethbaltodano;

import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author isoleth
 */
public class BaseDatosIsolethBaltodano {

java.sql.Connection con;
java.sql.Statement sta;
java.sql.ResultSet res;
  
public BaseDatosIsolethBaltodano(){
 try{
    try{
         Class.forName("org.postgresql.Driver");
         System.out.println("driver correcto");
       }
    catch (ClassNotFoundException ex){
          System.out.println("Error cargando el driver");
         }
    con= DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/basedatosisoleth", "postgres", "isoleth");
 }
  catch (SQLException ex){
    System.out.println("No se pudo conectar");
  }
}
    
}
