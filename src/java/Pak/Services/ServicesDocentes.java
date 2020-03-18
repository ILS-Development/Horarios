/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pak.Services;


import Pak.Conexion.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Ivan
 */
public class ServicesDocentes {
      public void IncertDocente(String  Nombre,String Apellido , String DNI , String TELEFONO , String fecha_Nacimiento ,String Direccion , String  Correo_PERSONAL ,String Correo_CORPORATIVO  ) {
      Connection con=null;
       try {      
           con = conexion.getConnection();
         
            String sql ="{CALL Inser_Docente(?,?,?,?,?,?,?,?)}";
            CallableStatement proc = con.prepareCall(sql);
            //se cargan los parametros de entrada
           
            proc.setString(1,  Nombre);//Tipo entero
             proc.setString(2,  Apellido);//Tipo entero
              proc.setString(3,  DNI);//Tipo entero
               proc.setString(4,  TELEFONO);//Tipo entero
                proc.setString(5,  fecha_Nacimiento);//Tipo entero
                 proc.setString(6,  Direccion);//Tipo entero
                  proc.setString(7,  Correo_PERSONAL);//Tipo entero
                   proc.setString(8,  Correo_CORPORATIVO);//Tipo entero
                
    
            proc.execute();            
           proc.close();
        } 
       catch (Exception e) {                  
           throw new RuntimeException(e.getMessage());
       }finally{
       try{
           con.close();
       }catch(Exception e ){
       }
       
       
       }
      }
}
