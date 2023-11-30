
package Controladores;

import Clases.Patient;
import static Clases.PatientDB.patient_list;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Clases.Physique;
import Clases.PhysiqueDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhysiqueC implements PhysiqueDB {
    public String query;
    
    public void Read(Connection link, Patient patient){

        try{
            Statement s = link.createStatement();
            query="select * from Physique where rut_patient='"+patient.getRut()+"'";
            ResultSet rs=s.executeQuery(query);
            Physique physique=new Physique();
            physique.setBmi(rs.getFloat("bmi"));
            physique.setWeight(rs.getFloat("weight"));
            physique.setHeight(rs.getFloat("height"));
            physique.setExercise(rs.getInt("do_exercise"));
               
            patient.setPhysical_state(physique);

        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean Create(Connection link, Physique physique, int rut_patient){
        
        try{
            Statement s = link.createStatement();
            query = "INSERT INTO Physique(weight,height,bmi,do_exercise,rut_patient) VALUES('"+physique.getWeight()+"','"+physique.getHeight()+"','"+physique.getBmi()+"','"+physique.getExercise()+"','"+rut_patient+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Physique Search(Connection link, int rut){
        Physique physique=new Physique();
        try {
            Statement s = link.createStatement();
            query="select * from Physique where rut_patient='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
            while (rs.next()){
               physique.setWeight(rs.getInt("weight"));
               physique.setHeight(rs.getFloat("height"));
               physique.setBmi(rs.getFloat("bmi"));
               physique.setExercise(rs.getInt("do_exercise"));
                
            }
            return physique;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean Update(Connection link, int rut_patient, float weight, float height, int do_exercise){
        try{
            Statement s = link.createStatement();
            query="UPDATE Physique set weight='"+weight+"',height='"+height+"',do_exercise='"+do_exercise+"' WHERE rut_patient = '"+rut_patient+"'";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    
}

