package Clases;


public class Rutine {
    private int rutine_id;
    private int number_exercises;
    private String bmi_type;
    
    public Rutine(){
    }

    public Rutine(int rutine_id, int number_exercises, String bmi_type) {
        this.rutine_id = rutine_id;
        this.number_exercises = number_exercises;
        this.bmi_type = bmi_type;
    }

    public int getRutine_id() {
        return rutine_id;
    }

    public void setRutine_id(int rutine_id) {
        this.rutine_id = rutine_id;
    }

    public int getNumber_exercises() {
        return number_exercises;
    }

    public void setNumber_exercises(int number_exercises) {
        this.number_exercises = number_exercises;
    }

    public String getBmi_type() {
        return bmi_type;
    }

    public void setBmi_type(String bmi_type) {
        this.bmi_type = bmi_type;
    }
    
}
