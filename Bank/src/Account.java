/*  Author: Richard Tillies
 *    Date: December 5, 2024
 * Purpose: To create an Account class
 */

/* DO NOT ALTER THIS CLASS */
public class Account {
	
	// private fields
	private int id;
	private String type;
	private double balance;
	
    public Account() {
    	super();
    	this.id = (int)(Math.random() * 8999) + 1000; // four-digit number
//    	this.type = "";
//        this.balance = 0.0;
    }
    
    
    // TODO create constructor with id parameter
    public Account(int id) {
    	// TODO write body of method
    	super();
    	this.id = id;
//    	this.type = "";
//    	this.balance = 0.0;
    }

    // TODO create deposit method with double parameter
    // adds amount to balance
    public boolean deposit (double amount) {
    	// TODO write body of method
    	this.balance += amount;
    	return true;
    }
    
    // TODO create withdraw method with double parameter
    // subtracts amount from balance
    public boolean withdraw (double amount) {
    	// TODO write body of method
    	if (balance >= amount) {
            this.balance -= amount;
            return true;
    	}
    	return false;
    }

    // TODO create withdraw method with double parameter
    // subtracts amount from balance
	public void reconcile() {
    	System.out.println("Needs override");
    }
    
	
    // accessors
    public int getID() 			{ return this.id; 		}
    public String getType() 	{ return this.type; 	}
    public double getBalance()	{ return this.balance;	}

    // mutators
	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("%8s %4d | Balance: $%,10.2f", 
				this.getType(), this.getID(), this.getBalance());
	}
    
    
}