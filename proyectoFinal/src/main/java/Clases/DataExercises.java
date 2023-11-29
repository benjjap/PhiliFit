/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Felip
 */
public class DataExercises {
    private int repetitions;
    private int caloriesBurn;
    private int exercise_time;
    
    public DataExercises(){
        this.repetitions = 0;
        this.caloriesBurn = 0;
        this.exercise_time = 0;
    }

    public DataExercises(int repetitions, int caloriesBurn, int exercise_time) {
        this.repetitions = repetitions;
        this.caloriesBurn = caloriesBurn;
        this.exercise_time = exercise_time;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getCaloriesBurn() {
        return caloriesBurn;
    }

    public void setCaloriesBurn(int caloriesBurn) {
        this.caloriesBurn = caloriesBurn;
    }

    public int getTimeExercise() {
        return exercise_time;
    }

    public void setTimeExercise(int timeExercise) {
        this.exercise_time = timeExercise;
    }
}
