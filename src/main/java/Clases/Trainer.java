/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Date;


public class Trainer extends Person{
    String specialty; 


    public Trainer(int rut, String first_name, String last_name, Date birth_date, String specialty){
        super(rut, first_name, last_name, birth_date);
        this.specialty = specialty;
    }

    public Trainer(){
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

