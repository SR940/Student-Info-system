/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SR
 */
public class DBConnect {
    public static Connection Connect(){
    
    try{
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sa","sabir940");
      //Connection con=DriverManager.getConnection("jdbc:oracle:C:\\Users\\SR\\Documents\\NetBeansProjects\\SIS\\dbs.DMP");
     return con;
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
    }
        return null;
    
    
    
    }
   
}
