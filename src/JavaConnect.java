
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Shaheer
 */
public class JavaConnect {
    Connection conn;
    
    public static Connection ConnectDB(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lms" , "root", "" );
    return conn;
   }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    
    }
    
}
