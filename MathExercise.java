/* 
 * 
*/
import java.util.Scanner;
public class MathExercise {
    public static void main(String args[]) {
      
        // Create local variables
        int firstInt, secondInt;
        double firstDouble, secondDouble;

        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Get two integer values from user
        System.out.print("Enter two integer values: ");
        firstInt = input.nextInt();  // test data: 13 
        secondInt = input.nextInt(); // test data: 5

        // Display Sum, Difference, Product, Quotient, and Remainder to console
        System.out.println("Sum:        " + firstInt + " + " + secondInt + " = " + (firstInt + secondInt));
        System.out.println("Difference: " + firstInt + " - " + secondInt + " = " + (firstInt - secondInt));
        System.out.println("Product:    " + firstInt + " * " + secondInt + " = " + (firstInt * secondInt));
        System.out.println("Quotient:   " + firstInt + " / " + secondInt + " = " + (firstInt / secondInt));
        System.out.println("Remainder:  " + firstInt + " % " + secondInt + " = " + (firstInt % secondInt));

        // Blank line for console spacing 
        System.out.println();

        // Get two double values from user
        System.out.print("Enter two double values: ");
        firstDouble = input.nextDouble();  // test data: 13.0
        secondDouble = input.nextDouble(); // test data: 5.0

        // Display Sum, Difference, Product, and Quotient to console
        System.out.println("Sum:        " + firstDouble + " + " + secondDouble + " = " + (firstDouble + secondDouble));
        System.out.println("Difference: " + firstDouble + " - " + secondDouble + " = " + (firstDouble - secondDouble));
        System.out.println("Product:    " + firstDouble + " * " + secondDouble + " = " + (firstDouble * secondDouble));
        System.out.println("Quotient:   " + firstDouble + " / " + secondDouble + " = " + (firstDouble / secondDouble));

        // Close Scanner object
        input.close();
    }
}








