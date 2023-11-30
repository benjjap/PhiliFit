package Controladores;

import Clases.Patient;
import java.sql.Connection;
import Clases.Rutine;
import Clases.RutineDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RutineC implements RutineDB{
    public String query;
    
    public void set_rutine(Connection link, Rutine rutine, Patient patient){
        query = "UPDATE Patient SET rutine_id ='"+rutine.getRutine_id()+"' WHERE rut_patient = '"+patient.getRut()+"'";
        
        try{
            Statement s = link.createStatement();
            s.executeUpdate(query);
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Rutine Search(Connection link, int rutine_id){
        Rutine rutine=new Rutine();
        try {
            Statement s = link.createStatement();
            query="select * from Rutine where rutine_id='"+rutine_id+"'";
            ResultSet rs=s.executeQuery(query);
            
            while(rs.next()){
               rutine.setNumber_exercises(rs.getInt("number_exercises"));
               rutine.setRutine_id(rs.getInt("rutine_id"));
               rutine.setBmi_type(rs.getString("bmi_type"));
            }
            return rutine;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
