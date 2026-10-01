import java.util.*;

class AccountException extends Exception {
	AccountException(String msg) {
		super(msg);
    }
}

class InsufficientBalanceException extends AccountException {
	InsufficientBalanceException(String msg) {
		super(msg);
    }
}

class UnnamedAccountException extends AccountException {
	UnnamedAccountException(String msg) {
		super(msg);
    }
}

class BankAccount {
	private double balance;
	String name;

	BankAccount() {
		this.name = " ";
		balance = 0;
    	}

    	BankAccount(String name) {
        	this.name = name;
        	balance = 0;
    	}

	BankAccount(String name, double balance) {
        	this.name = name;
        	this.balance = balance;
    	}

    	void SetName(String name) {
        	this.name = name;
    	}

    	void SetBalance(double x) {
        	this.balance = x;
    	}

    	double CheckBalance() {
        	return this.balance;
    	}

    	void Withdraw(double amount) throws AccountException {
        	if (name.equals(" "))
            	throw new UnnamedAccountException("Anonymous account, maybe something illegal");

        	if (balance < amount)
            	throw new InsufficientBalanceException("Balance is less than the withdrawal amount");
        	else {
            	balance = balance - amount;
			System.out.printf("\nAmount Withdrawn:%.2f",amount);
        	}
    	}

    	void Deposit(double paisa) throws AccountException {
        	if (name.equals(" "))
            	throw new UnnamedAccountException("Anonymous account, maybe something illegal");
       		this.balance = this.balance + paisa;
		System.out.printf("\nAmount Deposited:%.2f",paisa);
    }
}

public class BankingSystemm {
    	public static void main(String args[]) {
        	BankAccount uno = new BankAccount("Pramit", 499);
        	try {
	    		System.out.printf("\nCurrent Balance:%.2f",uno.CheckBalance());
            		uno.Withdraw(400); 
            		uno.Deposit(900);  
            		uno.Withdraw(998);
        	} 
        	catch (InsufficientBalanceException ifb) {
            		System.out.println("Paisa nahi hai re");
        	} 
        	catch (UnnamedAccountException uae) {
            		System.out.println("Kaun hai tu!");
        	} 
        	catch (Exception e) {
            		System.out.println("Some error occurred: " + e.getMessage());
        	} 
        	finally {
            		System.out.printf("\nGhar ja re, itne paise hai: %.2f\n", uno.CheckBalance());
        	}
    	}
}
