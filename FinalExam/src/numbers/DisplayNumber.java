package numbers;

import java.util.Scanner;

public class DisplayNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number, option;
		
		// get number
		number = getNumber(input);
		
		// check if valid number
		if (number < 0 || number > 1000000) {
			Number bigNumber = new Number(number);
			System.out.println(bigNumber);
		} else {
			// display menu
			displayMenu(number);
			
			// get option
			option = getOption(input);
			
			// perform operation
			switchOption(number, option);
		}

	}

	public static void switchOption(int number, int option) {
		switch(option) {
		case 1:
			Number bigNumber = new Number(number);
			System.out.println(bigNumber);
			break;
		case 2:
			displayAllNumbers(number);
			break;
		default:
			System.err.println("Invalid option");
		}
	}

	public static int getOption(Scanner input) {
		int option;
		option = input.nextInt();
		return option;
	}

	public static void displayMenu(int number) {
		System.out.printf(" 1. Display only this number: %,d %n", number);
		System.out.printf(" 2. Display all numbers from 0 to %,d %n", number);
		System.out.print("Enter option: ");
	}

	public static int getNumber(Scanner input) {
		int number;
		System.out.print("Enter number: ");
		number = input.nextInt();
		return number;
	}
	
	public static void displayAllNumbers(int num) {
		for (int i = 0; i <= num; i++) {
			Number n = new Number(i);
			System.out.println(n);
		}
	}

}
