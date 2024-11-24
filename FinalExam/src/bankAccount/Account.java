package bankAccount;

public abstract class Account {
	
	private int id = (int)(Math.random() * 8999) + 1000;
	private double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void reconcileAccount();
    
    public int getID() 			{ return this.id; }
    public double getBalance()	{ return this.balance; }
    
}