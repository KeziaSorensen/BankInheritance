/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: The parent class that contains the types of transactions
		****************************************/
public class TFDA extends Account{
	
	/****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 10
	* Description: Initializing variables
	****************************************/
	TFDA(double balance) { // creating a constructor to initialize the variables
		super (balance); // getting the balance from the super class
	}
	
	/****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 10
	* Description: Leading to another method withdraw fee from the balance
	* Inputs: double, double, int
	* Outputs: Double
	****************************************/

	double depositUpdate (double amt, double balance, int transNum) { // creating a method to complete calculations for deposits
		balance = TFDATransaction(amt, balance); // making the balance equal to the balance after the fee has been taken away
		return balance;
		
	}
	
	 
	/****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 10
	* Description: Withdrawing fee from the balance	
	* Inputs: Double
	* Outputs: Double
	****************************************/
	double TFDATransaction(double amt, double balance) {
		
			balance = balance - 5; // subtracting the fee from the balance
			return balance;
	}
	
	/****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 10
	* Description: Checking to see if the transaction is allowed and leading to another method to withdraw the fee from the balance
	* Inputs: double, double, int
	* Outputs: Double
	****************************************/
	
	double withdrawUpdate(double amt, double balance, int transNum) { // creating a method to check if the withdrawal can go through
		
		if (balance-amt>5) { // lets the balance be calculated if it's high enough
			balance = TFDATransaction(amt, balance); // making the balance equal to the balance after the fee has been taken away

		} else {
			balance = balance + amt; // adds the amount to the balance so it'll stay the same when it's being subtracted from
			System.out.println("You don't have enough money, this transaction cannot be completed");
		}
		return balance;
		
	}

	/****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 14
	* Description: Calculating the interest at the end of the month
	* Inputs: Double, double
	* Outputs: Double
	****************************************/
	double endOfMonthUpdate(double balance, double interest) { // creating a method to make calculations for the end of the month
		
		interest = balance * 0.04; // calculating the interest to add to the balance
		return interest;
	}
	
}
