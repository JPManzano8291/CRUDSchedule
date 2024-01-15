/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subjsched;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author joshu
 */
public class javaConnection {
    public static Connection connectdb() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/subjsheddb;create=true", "app", "app");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(javaConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
