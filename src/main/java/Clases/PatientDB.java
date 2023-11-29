/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases;

/**
 *
 * @author Felip
 */
import java.sql.Connection;
import java.util.ArrayList;

public interface PatientDB {
    ArrayList<Patient>patient_list = new ArrayList<Patient>();
    public ArrayList<Patient> Read(Connection link);
    public boolean Create(Connection link, Patient patient);
    public boolean Update(Connection link, Patient patient);
    public boolean Delete(Connection link, int rut);
    public Patient Search(Connection link, int rut);
    public int Validate(Connection link, int rut);
}