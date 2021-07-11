
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Db {
    public static Connection Conb(){
       Connection con;
       try {
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection("jdbc:sqlite:pos.db");
         return con;
      } catch ( Exception e ) {
         JOptionPane.showMessageDialog(null, e);
      }
      return null; 
   }
    
}
