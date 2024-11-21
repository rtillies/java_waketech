// package Workout;

public class Customer {

    private int id;
    private String name;
    private double height;
    private double weight;
    private Workout currentWorkout;
    private int totalWorkouts;
    private int totalExercises;
    private double totalCalories;
    private boolean isFinished;

    public Customer() {}

    public Customer(String name, double height, double weight) {
        setRandomID();
        this.name = name;
        this.height = height;
        this.weight = weight;
        totalWorkouts = 0;
        totalExercises = 0;
        totalCalories = 0.0;
        isFinished = false;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public Workout getCurrentWorkout() {
        return this.currentWorkout;
    }

    public double getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalWorkouts() {
        return this.totalWorkouts;
    }

    public int getTotalExercises() {
        return this.totalExercises;
    }

    public double calcCaloriesPerWorkout() {
        return this.totalWorkouts == 0
            ? 0
            : totalCalories / totalWorkouts;
    }

    public double calcExercisesPerWorkout() {
        return this.totalWorkouts == 0
            ? 0
            : (double)totalExercises / totalWorkouts;
    }

    public String convertHeightToFeet() {
        int feet = (int)this.height / 12;
        double inches = this.height - (feet * 12);
        String zero = inches < 10 ? "0" : "";
        return String.format(
            "%4d' %s%.1f\"", feet, zero, inches);

    }

    private void setRandomID() {
        if (id == 0) {
            this.id = (int)(Math.random() * 10000 + 1);
        }
    }
    
    private void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void finishWorkout() {
        isFinished = true;
        totalWorkouts += 1;
        totalExercises += currentWorkout.getWorkoutLength();
        totalCalories += currentWorkout.getTotalCalories();
    }

    public void addWorkout() {
        addWorkout(5);
        // if(!isFinished) finishWorkout();
        // this.currentWorkout = new Workout();
        // System.out.println(this.currentWorkout.getExerciseList());
        // finishWorkout();
    }

    public void addWorkout(int count) {
        // if(!isFinished) finishWorkout();
        this.currentWorkout = new Workout(count);
        System.out.println(this.currentWorkout.getExerciseList());
        finishWorkout();
    }

    public String toString() {
        String str = "";
        str += "Customer Information \n";
        str += "================================= \n";
        str += String.format(
            "Customer:  %s [%d] %n", 
            this.name, this.id);
        // str += "Customer:    " + this.getName() + "\n";
        // str += String.format("Height: %8.1f in %n", this.height);
        str += String.format("Height: %s %n", convertHeightToFeet());
        str += String.format("Weight: %8.1f lbs %n", this.weight);
        str += "--------------------------------- \n";
        // str += "================================= \n";
        // str += "Total Workouts:        " + this.totalWorkouts + "\n";
        // str += "Total Exercises:       " + this.totalExercises + "\n";
        str += String.format(
            "Total Workouts: %7d %n", 
            this.totalWorkouts);
        str += String.format(
            "Total Exercises: %6d %n", 
            this.totalExercises);
        str += String.format(
            "Exercises/Workout: %6.1f  ex/w %n", 
            this.calcExercisesPerWorkout());
        str += String.format(
            "Total Calories:    %7.2f kcal %n", 
            this.totalCalories);
        str += String.format(
            "Calories/Workout:  %7.2f kcal %n", 
            this.calcCaloriesPerWorkout());
        return str;
    }
}