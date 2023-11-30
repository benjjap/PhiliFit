/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.PatientDB;
import Clases.Patient;
import java.sql.PreparedStatement;


public class PatientG implements PatientDB{
    public String query;
    public String query2;
    
    public ArrayList<Patient> Read(Connection link){

        try{
            Statement s = link.createStatement();
            query="select * from Patient";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
               Patient patient = new Patient();
               patient.setRut(rs.getInt("rut_patient"));
               patient.setFirst_name(rs.getString("first_name"));
               patient.setLast_name(rs.getString("last_name"));
               patient.setBirth_date(rs.getDate("birth_date"));
               patient.setEmail(rs.getString("email"));
               patient.setPassword(rs.getString("password"));
               
               patient_list.add(patient);
            }
            
            return patient_list;
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    
    public boolean Create(Connection link, Patient patient){
        
        try{
            Statement s = link.createStatement();
            query="INSERT INTO Patient(rut_patient,first_name,last_name,birth_date,email,password)VALUES('"+patient.getRut()+"','"+patient.getFirst_name()+"','"+patient.getLast_name()+"','"+patient.getBirth_date()+"','"+patient.getEmail()+"','"+patient.getPassword()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Patient Search(Connection link, int rut){
        Patient patient=new Patient();
        try {
            Statement s = link.createStatement();
            query="select * from Patient where rut_patient='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
            while (rs.next()){
               patient.setRut(rs.getInt("rut_patient"));
               patient.setFirst_name(rs.getString("first_name"));
               patient.setLast_name(rs.getString("last_name"));
               patient.setBirth_date(rs.getDate("birth_date"));
               patient.setEmail(rs.getString("email"));
               patient.setPassword(rs.getString("password"));
                
            }
            return patient;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    
    public boolean Update(Connection link, Patient patient){
        try{
            Statement s = link.createStatement();
            query="UPDATE Clientes set first_name='"+patient.getFirst_name()+"',last_name='"+patient.getLast_name()+"',birth_date='"+patient.getBirth_date()+"',email='"+patient.getEmail()+"',password='"+patient.getPassword()+"' WHERE rut='"+patient.getRut()+"'";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public boolean Delete(Connection link, int rut) {
           try {
            
            Statement s = link.createStatement();
            query = "delete from Physique where rut_patient='"+rut+"'";
            query2="delete from Patient where rut_patient='"+rut+"'";
            s.executeUpdate(query);
            s.executeUpdate(query2);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    public int Validate(Connection link, int rut){
        query = "SELECT count(rut_patient) FROM Patient WHERE rut_patient = ?";
        
        try{
            PreparedStatement ps = link.prepareStatement(query);
            ps.setInt(1, rut);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException ex){
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 1;
    }
    
    public int Validate(int rut, String pass, Connection link){
        query = "SELECT count(rut_patient) FROM Patient WHERE rut_patient = ? AND password = ?";
        
        try{
            PreparedStatement ps = link.prepareStatement(query);
            ps.setInt(1, rut);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException ex){
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 1;
    }
    
    public void set_trainer(Connection link, int rut_trainer, Patient patient){
        query = "UPDATE Patient SET rut_trainer ='"+rut_trainer+"' WHERE rut_patient = '"+patient.getRut()+"'";
        
        try{
            Statement s = link.createStatement();
            s.executeUpdate(query);
        }catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}