/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.Patient;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.Trainer;

/**
 *
 * @author benja
 */
public class TrainerC {
    public String query;

    public Trainer Search(Connection link, int rut){
        Trainer trainer=new Trainer();
        try {
            Statement s = link.createStatement();
            query="select * from Trainer where rut_trainer='"+rut+"'";
            ResultSet rs=s.executeQuery(query);

            while (rs.next()){
               trainer.setRut(rs.getInt("rut_trainer"));
               trainer.setFirst_name(rs.getString("first_name"));
               trainer.setLast_name(rs.getString("last_name"));
               trainer.setBirth_date(rs.getDate("birth_date"));
               trainer.setSpecialty(rs.getString("specialty"));
            }
            return trainer;

        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
