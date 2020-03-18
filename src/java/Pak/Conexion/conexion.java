/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pak.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ivan
 */
public class conexion {
    private conexion(){
 
    }
    
    public static Connection getConnection() throws SQLException{
     Connection con =null;
    try{
        String drive="oracle.jdbc.OracleDriver";
        String urlDB ="jdbc:oracle:thin:@localhost:1521/XE";
        String user ="Horario";
        String pass="ILS";
        Class.forName(drive).newInstance();
        con=DriverManager.getConnection(urlDB,user,pass);
    }catch(SQLException e){
    throw e;
    }catch (ClassNotFoundException ex){
    throw new SQLException("No se encontro el dirver.");
    }catch (Exception e){
        String msg="Error, no se puede establecer la conexión";
        if(e.getMessage() != null && e.getMessage() .isEmpty()){
        msg += " " + e.getMessage();
        }
        throw new SQLException(msg);
    }
    return con;   

    }
}
