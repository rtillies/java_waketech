/*  Author: Richard Tillies
 *    Date: December 5, 2024
 * Purpose: To create an abstract Account class
 */

/* DO NOT ALTER THIS CLASS */
public abstract class AccountOld {
	
	// private and protected fields
	private int id = (int)(Math.random() * 8999) + 1000; // four-digit number
	protected String type;
	protected double balance;

	// abstract methods
    public abstract boolean deposit (double amount);
    public abstract boolean withdraw (double amount);
    public abstract void reconcile();
    
    // non-abstract methods
    public int getID() 			{ return this.id; 		}
    public String getType() 	{ return this.type; 	}
    public double getBalance()	{ return this.balance;	}
    
}