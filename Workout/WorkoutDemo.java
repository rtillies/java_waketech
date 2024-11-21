// package Workout;
public class WorkoutDemo {
    public static void main(String args[]) {
        Customer rich = new Customer("Professor T", 70.2, 220);
        Customer bella = new Customer("Lyndsey Bella", 63.5, 140);

        rich.addWorkout();
        rich.addWorkout(8);
        rich.addWorkout();
        rich.addWorkout(6);
        bella.addWorkout();
        bella.addWorkout(10);
        bella.addWorkout();
        bella.addWorkout(4);
        // customer.finishWorkout();


        System.out.println(rich);
        System.out.println(bella);
    }
}