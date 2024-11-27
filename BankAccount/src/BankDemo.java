

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BankDemo {

	/* TODO List
	 * - change this class name and file name
	 * - import java packages as needed (no * imports)
	 * - create collection of accounts
	 * - display details for all accounts to console
	 * - open transaction file for reading
	 * - read and process each transaction
	 * - display transaction detail to console or write to output file
	 * - reconcile all accounts
	 * - display details for all accounts to console
	 * - close all reader/writer objects
	 */

	public static void main(String[] args) throws FileNotFoundException {
		/* Create an array (or ArrayList) of accounts in this order
		 * - Checking account with $500 		
		 * - Savings account with $1,000
		 * - Checking account with $250
		 * - Savings account with $5,000 and 4.5% interest rate
		 */

		Account accounts[] = {
				new Checking(500),
				new Savings(1000),
				new Checking(250),
				new Savings(5000, 0.045)
		};
		
		// Display all accounts
		System.out.println("Start");
		displayAccounts(accounts);
		
		// Read transactions
		processTransactions(accounts); //, reader);
		
		// Reconcile accounts
		for (Account a : accounts) {
			a.reconcile();
		}
		
		// Display all accounts
		System.out.println("End");
		displayAccounts(accounts);
	}

	public static void processTransactions(Account[] accounts) //, Scanner reader) 
			throws NumberFormatException, FileNotFoundException {
		
		// Open transactions file
//		String filename = "transactions.txt";
		String filename = "transactions.csv";
		File file = new File(filename);
		Scanner reader = new Scanner(file);
		
		// Open output file
		String outputFilename = "banklog.txt";
		PrintWriter writer = new PrintWriter(outputFilename);
		
		// Discard headers
		String line = reader.nextLine();
		
		// Loop through transactions
		while(reader.hasNext()) {
			// Read single transaction and split line
			line = reader.nextLine();
			String fields[] = line.split(",");
			
			// Parse transaction
			String date = fields[0];
			int num = Integer.parseInt(fields[1]) - 1;
			String tranType = fields[2];
			double amount = Double.parseDouble(fields[3]);
			
			int id = accounts[num].getID();
			String type = accounts[num].getType();
			String message;
			boolean success;
			
			// Process transaction and display message
			switch(tranType) {
			case "deposit":
				success = accounts[num].deposit(amount);
				break;
			case "withdraw":
				success = accounts[num].withdraw(amount);
				break;
			case "check":
				Checking c = (Checking)accounts[num];
				success = c.check(amount);
				break;
			default:
				success = false;
				message = "Unknown transaction type";
			}
			
			message = success ? "" : "**FAIL** ";
			message += String.format("%s $%,.2f from %s account %d on %s",
					tranType, amount, type, id, date);
			
			writer.println(message);
			System.out.println(message);
		}
		
		System.out.println("Transaction log saved to " + outputFilename);
		
		// Close Scanner and PrintWriter objects
		reader.close();
		writer.close();
	}

	public static void displayAccounts(Account[] accounts) {
		for (Account a : accounts) {
			System.out.println(a);
		}
		System.out.println();
	}

}
