// package Workout;

public class CreateWorkout {

    static Exercise todaysList[] = {
        new Exercise("None", 0),
        new Exercise("10 punches", 4.0),
        new Exercise("10 jumping jacks", 5.0),
        new Exercise("10 hooks", 4.4),
        new Exercise("5 squats", 6.5),
        new Exercise("10 uppercuts", 4.8),
        new Exercise("2 pushups", 3.4),
    };

    public static void main(String[] args) {
        Workout workout = new Workout();
        // Exercise list[] = new Exercise[6];
        // Exercise todaysList[] = {
        //     new Exercise("None", 0),
        //     new Exercise("10 punches", 4.0),
        //     new Exercise("10 jumping jacks", 5.0),
        //     new Exercise("10 hooks", 4.4),
        //     new Exercise("5 squats", 6.5),
        //     new Exercise("10 uppercuts", 4.8),
        //     new Exercise("2 pushups", 3.4),
        // };

        for (int i = 0; i < workout.getWorkoutLength(); i++) {
            int rand = getRandomNumber();
            workout.addExercise(todaysList[rand]);
        }

        System.out.println(workout);

    }

    // public static int addExercise() {
    //     int rand = getRandomNumber();
    //     workout.addExercise(todaysList[rand]);
    //     System.out.println("Random: " + rand);
    //     return rand;
    // }

    public static int getRandomNumber() {
        return (int)(Math.random() * 6 + 1);
        // System.out.println("Random: " + rand);
        // return rand;
    }
}
