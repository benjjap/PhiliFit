/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConnectDB {
    
    private String db;
    private String url;
    private String user;
    private String pass;
    private Connection link;
    
    public ConnectDB(){
        this.db = "philifit";
        this.url = "jdbc:mysql://localhost:3306/" + db;
        this.user="root";
        this.pass="";
        this.link = null;
    }
    
    public Connection Connect() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.link = DriverManager.getConnection(this.url, this.user, this.pass);
            System.out.println("Conectando.....");
            
       
        } catch (ClassNotFoundException | SQLException ex) {
        // Loguear o imprimir la excepción
            ex.printStackTrace();
            
            throw new RuntimeException("Error al conectar a la base de datos. Detalles: " + ex.getMessage(), ex);
        }
        return link;
    }
    
    public void CloseConection(){
        
        try {
            link.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}