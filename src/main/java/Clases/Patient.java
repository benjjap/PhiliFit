/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Date;

public class Patient extends Person{

    private String email;
    private String password;
    private Physique physical_state;


    public Patient(int rut, String first_name, String last_name, Date birth_date, String email, String password){
        super(rut, first_name, last_name, birth_date);
        this.email = email;
        this.password = password;
    }

    public Patient(){
        
    }
    //Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Physique getPhysical_state() {
        return physical_state;
    }

    public void setPhysical_state(Physique physical_state){
        this.physical_state = physical_state;
    }
}