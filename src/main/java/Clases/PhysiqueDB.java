/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases;

import java.sql.Connection;


public interface PhysiqueDB {
    public void Read(Connection link, Patient patient);
    public boolean Create(Connection link, Physique physique, int rut_patient);
    public boolean Update(Connection link, int rut_patient, float weight, float height, float bmi, int do_exercise);
    
}
