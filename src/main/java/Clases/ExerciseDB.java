package Clases;

import java.sql.Connection;
import java.util.List;

public interface ExerciseDB {
    List<Exercises> getExerciseList(Connection connection);

    boolean createExercise(Connection connection, Exercises exercise);

    Exercises getExercise(Connection connection, String exerciseName);

    boolean updateExercise(Connection connection, Exercises exercise);

    boolean deleteExercise(Connection connection, String exerciseName);
}

