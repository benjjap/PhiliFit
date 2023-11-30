/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Math.pow;

/**
 *
 * @author Felip
 */
public class Physique {
    private float height;
    private float weight;
    private float bmi;
    private int exercise;


    public Physique() {
        this.height = 0;
        this.weight = 0;
        this.bmi = 0;
        this.exercise = 0;

    }
    public Physique(float height, float weight, int exercise) {
        this.height = height;
        this.weight = weight;
        this.exercise = exercise;
        this.bmi = calculate_bmi();
    }

    //Getters and setters

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public int getExercise() {
        return exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }
    
    public float calculate_bmi(){
        return this.bmi = (float) (this.weight/pow(this.height,2));
    }

}