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
public class Physical {
    private int height;
    private int weight;
    private double bmi;
    private boolean exercise;


    public Physical() {
        this.height = 0;
        this.weight = 0;
        this.bmi = 0;
        this.exercise = false;

    }
    public Physical(int height, int weight, boolean exercise) {
        this.height = height;
        this.weight = weight;
        this.exercise = exercise;
    }

    //Getters and setters

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public boolean getExercise() {
        return exercise;
    }

    public void setExercise(boolean exercise) {
        this.exercise = exercise;
    }

}