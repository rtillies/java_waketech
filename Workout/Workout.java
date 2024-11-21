// package Workout;

class Exercise {
    String description;
    double calories;

    Exercise(String description, double calories) {
        this.description = description;
        this.calories = calories;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCalories() {
        return this.calories;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}

public class Workout {

    // private int count;
    private static Exercise fullList[] = {
        new Exercise("None", 0),
        new Exercise("10 punches", 4.0),
        new Exercise("10 jumping jacks", 5.0),
        new Exercise("10 hooks", 4.4),
        new Exercise("5 squats", 6.5),
        new Exercise("10 uppercuts", 4.8),
        new Exercise("2 pushups", 3.4),
    };
    private Exercise exercises[];
    private int counter;
    private final int DEFAULT = 5;

    public Workout() {
        this.exercises = new Exercise[DEFAULT];
        this.counter = 0;
        createWorkout();
    }

    public Workout(int count) {
        this.exercises = new Exercise[count];
        this.counter = 0;
        createWorkout();
    }

    private int getRandomNumber() {
        return (int)(Math.random() * 6 + 1);
    }


    public void addExercise(Exercise e) {
        if (counter < exercises.length) {
            exercises[counter] = e;
            counter++;
        }
    }

    public void addExercise(String description, double calories) {
        Exercise e = new Exercise(description, calories);
        addExercise(e);
    }

    public int getWorkoutLength() {
        return this.exercises.length;
    }

    public double getTotalCalories() {
        double total = 0.0;
        for (Exercise e : exercises) {
            total += e.getCalories();
        }
        return total;
    }

    public String getExerciseList() {
        String list = "Exercise List \n";
        list += "============= \n";
        for (Exercise e : exercises) {
            list += "- " + e.getDescription() + "\n";
        }
        return list;
    }

    public void createWorkout() {
        for (int i = 0; i < getWorkoutLength(); i++) {
            exercises[i] = fullList[getRandomNumber()];
        }
    }

    public String toString() {
        String str = getExerciseList();
        str += String.format("Total Calories: %.1f", getTotalCalories());
        return str;
    }
}