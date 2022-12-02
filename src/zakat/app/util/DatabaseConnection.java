/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat.app.util;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author dimas
 */
public class DatabaseConnection {
    public Connection databaseLink;
    
    public Connection getConnection(){
        String databaseName = "zakat";
        String databaseUser = "root";
        String databasePassword  = "";
        String url = "jdbc:mysql://localhost/" + databaseName;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return databaseLink;
    }
}
