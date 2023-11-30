package Controladores;

import Clases.ExerciseDB;
import Clases.Exercises;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Clases.Patient;

public class ExerciseController implements ExerciseDB {

    @Override
    public List<Exercises> getExerciseList(Connection connection) {
        List<Exercises> exerciseList = new ArrayList<>();

        try {
            String query = "SELECT * FROM Exercises";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Exercises exercise = new Exercises();
                exercise.setExercise_name(resultSet.getString("exercise_name"));
                exercise.setType(resultSet.getString("type"));
                exercise.setDescription(resultSet.getString("description"));

                exerciseList.add(exercise);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exerciseList;
    }

    @Override
    public boolean createExercise(Connection connection, Exercises exercise) {
        try {
            String query = "INSERT INTO Exercises(exercise_name, type, description) VALUES ('"+exercise.getExercise_name()+"', '"+exercise.getType()+"', '"+exercise.getDescription()+"')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, exercise.getExercise_name());
            preparedStatement.setString(2, exercise.getType());
            preparedStatement.setString(3, exercise.getDescription());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Exercises getExercise(Connection connection, String exerciseName) {
        try {
            String query = "SELECT * FROM Exercises WHERE exercise_name = '"+exerciseName+"'";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, exerciseName);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Exercises exercise = new Exercises();
                exercise.setExercise_name(resultSet.getString("exercise_name"));
                exercise.setType(resultSet.getString("type"));
                exercise.setDescription(resultSet.getString("description"));
                return exercise;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
}