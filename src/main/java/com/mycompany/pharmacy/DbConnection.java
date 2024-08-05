/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author skr
 */
public class DbConnection {
    private static Connection con = null;
    
    public static Connection getConnection() {
        if(con != null) return con;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
        "system","skr21231");
            }
            catch (SQLException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null, ex);
        }
        return con;
    }
}
