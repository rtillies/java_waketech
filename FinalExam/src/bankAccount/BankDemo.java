package bankAccount;

public class BankDemo {

	public static void main(String[] args) {
		/* Create an array (or ArrayList) of accounts in this order
		 * - Checking account with $500 		
		 * - Savings account with $1,000
		 * - Checking account with $250
		 * - Savings account with $5,000 and 5% interest rate
		 */
			
//		Account accounts[];
		
		String weekdays[] = { "Start", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		String months[] = { "Start", "July", "August", "September" };
		Account accounts[] = {
				new Checking(500),
				new Savings(1000),
				new Checking(250),
				new Savings(5000, 0.045)
		};
		
		// Display all accounts
		
		// Read each day (in order), reconcile after each day, then display all accounts 
		
		
		//
		
//		Checking c1 = new Checking(500);
//		Savings s1 = new Savings(1000);
//		
//		Checking c2 = new Checking(250);
//		Savings s2 = new Savings(5000, 0.05);
		
//		accounts[0]
		
		System.out.println(weekdays[0]);
		System.out.println(months[0]);
		for (Account a : accounts) {
			System.out.println(a);
		}
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(s1);
//		System.out.println(s2);

	}

}
