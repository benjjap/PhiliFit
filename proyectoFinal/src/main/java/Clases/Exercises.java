/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Felip
 */
public class Exercises {

    private String exercise_name;
    private String type;
    private String description;
    private DataExercises data;
    
    public Exercises(){
        this.exercise_name = null;
        this.type = null;
        this.description = null;
    }

    public Exercises(String exercise, String type, String description) {
        this.exercise_name = exercise;
        this.type = type;
        this.description = description;

    }

    public String getExercise() {
        return exercise_name;
    }

    public void setExercise(String exercise) {
        this.exercise_name = exercise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataExercises getData() {
        return data;
    }

    public void setData(DataExercises data) {
        this.data = data;
    }
}